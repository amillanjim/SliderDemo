package com.example.sliderdemo.jetpackCompose.components

import android.content.Context
import android.util.AttributeSet
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import com.example.sliderdemo.jetpackCompose.ui.theme.GreenTurquoise
import com.example.sliderdemo.theme.dp_1
import com.example.sliderdemo.theme.dp_8
import com.example.sliderdemo.theme.sp_16

class StoriOutlinedButtonComponent  @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : AbstractComposeView(context, attrs, defStyle) {

    var modifier by mutableStateOf(Modifier)
    var buttonContent by mutableStateOf("")
    var cornerSize by mutableStateOf(dp_8)
    var buttonColor by mutableStateOf(GreenTurquoise)
    var strokeColor by mutableStateOf(GreenTurquoise)
    var buttonEnabled by mutableStateOf(true)
    var clickAction by mutableStateOf({})

    @Composable
    override fun Content() {
        StoriOutlinedButton(
            modifier = modifier,
            content = buttonContent,
            cornerSize = cornerSize,
            buttonColor = buttonColor,
            strokeColor = strokeColor,
            enabled = buttonEnabled,
            clickAction = clickAction )
    }
}

@Composable
fun StoriOutlinedButton(
    modifier: Modifier = Modifier,
    content: String,
    cornerSize: Dp = dp_8,
    buttonColor: Color = GreenTurquoise,
    strokeColor: Color = GreenTurquoise,
    enabled: Boolean = true,
    clickAction: () -> Unit) {
    OutlinedButton(
        modifier = modifier,
        onClick = clickAction,
        enabled = enabled,
        shape = RoundedCornerShape(cornerSize),
        border = BorderStroke(dp_1, strokeColor)
    ){
        Text(
            text = content,
            color = buttonColor,
            fontWeight = FontWeight.Normal,
            fontSize = sp_16
        )
    }
}