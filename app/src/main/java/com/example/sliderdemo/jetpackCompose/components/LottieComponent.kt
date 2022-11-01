package com.example.sliderdemo.ui

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.AbstractComposeView
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.sliderdemo.jetpackCompose.components.TextView

class LottieComponent  @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : AbstractComposeView(context, attrs, defStyle) {

    var imageSource by mutableStateOf("url")

    @Composable
    override fun Content() {
        StoriLottieAnimation(url = imageSource)
    }
}

@Composable
fun StoriLottieAnimation(url: String?) {
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.Url(url!!))
    LottieAnimation(composition = composition, iterations = LottieConstants.IterateForever)
}