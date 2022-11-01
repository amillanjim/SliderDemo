package com.example.sliderdemo.jetpackCompose.components

import android.content.Context
import android.util.AttributeSet
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import com.example.sliderdemo.jetpackCompose.ui.theme.Gray600
import com.example.sliderdemo.theme.sp_16

class StoriTextButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : AbstractComposeView(context, attrs, defStyle) {

    var textButtonContent by mutableStateOf("")
    var color by mutableStateOf(Gray600)
    var fontSize by mutableStateOf(sp_16)
    var fontWeight by mutableStateOf(FontWeight.Normal)
    var textButtonEnabled by mutableStateOf(true)
    var onClick by mutableStateOf({})

    @Composable
    override fun Content() {
        CustomTextButton(
            buttonContent = textButtonContent,
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight,
            enabled = textButtonEnabled,
            onClick = onClick)
    }
}

@Composable
fun CustomTextButton(
    buttonContent: String,
    color: Color = Gray600,
    fontSize: TextUnit = sp_16,
    fontWeight: FontWeight = FontWeight.Normal,
    enabled: Boolean = true,
    onClick: () -> Unit = {}){
    TextButton(onClick = onClick, enabled = enabled) {
        Text(
            text = buttonContent,
            color = color,
            fontSize = fontSize,
            fontWeight = fontWeight
        )
    }
}