package com.example.sliderdemo.jetpackCompose.components

import android.content.Context
import android.util.AttributeSet
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.unit.dp
import com.example.sliderdemo.jetpackCompose.ui.theme.DeepPurple
import com.example.sliderdemo.jetpackCompose.ui.theme.DeepPurpleDisable
import com.example.sliderdemo.theme.dp_1
import com.example.sliderdemo.theme.dp_4

class SliderIndicatorComponent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : AbstractComposeView(context, attrs, defStyle){

    var totalPages by mutableStateOf(0)
    var currentPage by mutableStateOf(0)
    var enableColor by mutableStateOf(DeepPurple)
    var disableColor by mutableStateOf(DeepPurpleDisable)

    @Composable
    override fun Content() {
        SliderIterator(totalPages, currentPage, enableColor, disableColor)
    }
}

@Composable
fun SliderIterator(totalPages: Int, currentPage: Int, enableColor: Color, disableColor: Color){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        repeat(totalPages){
            val isSelected = it == currentPage
            val width = animateDpAsState(targetValue = if (isSelected) 24.dp else 10.dp)
            Box(modifier = Modifier
                .padding(dp_1)
                .height(dp_4)
                .width(width.value)
                .clip(CircleShape)
                .background(if (isSelected) enableColor else disableColor))
        }
    }
}
