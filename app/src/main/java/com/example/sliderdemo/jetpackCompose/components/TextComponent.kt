package com.example.sliderdemo.jetpackCompose.components

import android.content.Context
import android.util.AttributeSet
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import com.example.sliderdemo.jetpackCompose.ui.theme.Gray600
import com.example.sliderdemo.theme.sp_14

class TextComponent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : AbstractComposeView(context, attrs, defStyle) {

    var textContent by mutableStateOf("")
    var color by mutableStateOf(Gray600)
    var fontStyle by mutableStateOf(FontStyle.Normal)
    var fontSize by mutableStateOf(sp_14)
    var fontWeight by mutableStateOf(FontWeight.Normal)
    var textAlign by mutableStateOf(TextAlign.Start)
    var maxLines by mutableStateOf(Int.MAX_VALUE)

    @Composable
    override fun Content() {
        TextView(
            textContent = textContent,
            color = color,
            fontStyle = fontStyle,
            fontSize = fontSize,
            fontWeight = fontWeight,
            textAlign = textAlign,
            maxLines = maxLines)
    }
}

@Composable
fun TextView(
    textContent: String,
    color: Color = Gray600,
    fontStyle: FontStyle? = null,
    fontSize: TextUnit = sp_14,
    fontWeight: FontWeight = FontWeight.Normal,
    textAlign: TextAlign? = null,
    maxLines: Int = Int.MAX_VALUE){
    Text(
        text = textContent,
        color = color,
        fontStyle = fontStyle,
        fontSize = fontSize,
        fontWeight = fontWeight,
        textAlign = textAlign,
        maxLines = maxLines
    )
}