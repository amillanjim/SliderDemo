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
import com.example.sliderdemo.jetpackCompose.ui.theme.GreenTurquoise
import com.example.sliderdemo.theme.sp_20

class TitleTextComponent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : AbstractComposeView(context, attrs, defStyle) {

    var titleContent by mutableStateOf("")
    var color by mutableStateOf(GreenTurquoise)
    var fontStyle by mutableStateOf(FontStyle.Normal)
    var fontSize by mutableStateOf(sp_20)
    var fontWeight by mutableStateOf(FontWeight.Bold)
    var textAlign by mutableStateOf(TextAlign.Start)
    var maxLines by mutableStateOf(Int.MAX_VALUE)

    @Composable
    override fun Content() {
        TitleText(
            titleContent = titleContent,
            color = color,
            fontStyle = fontStyle,
            fontSize = fontSize,
            fontWeight = fontWeight,
            textAlign = textAlign,
            maxLines = maxLines)
    }
}

@Composable
fun TitleText(
    titleContent: String,
    color: Color = GreenTurquoise,
    fontStyle: FontStyle? = null,
    fontSize: TextUnit = sp_20,
    fontWeight: FontWeight = FontWeight.Bold,
    textAlign: TextAlign? = null,
    maxLines: Int = Int.MAX_VALUE){
    Text(
        text = titleContent,
        color = color,
        fontStyle = fontStyle,
        fontSize = fontSize,
        fontWeight = fontWeight,
        textAlign = textAlign,
        maxLines = maxLines
    )
}