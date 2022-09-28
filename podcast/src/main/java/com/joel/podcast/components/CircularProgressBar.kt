package com.joel.podcast.components

import android.graphics.Color
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joel.podcast.ui.theme.MainColor


@Composable
fun CustomCircularProgressBar(
    percentage : Float,
    number : Int,
    animDuration : Int = 1000,
    animDelay : Int = 0,
    radius : Dp = 50.dp,
    strokeWidth : Dp = 2.dp
){

    var animationPlayed by remember {
       mutableStateOf(false) 
    }
    
    val currentPercentage = animateFloatAsState(
        targetValue = if (animationPlayed) percentage else 0f,
        animationSpec = tween(
            durationMillis = animDuration,
            delayMillis = animDelay
        ),
    )
    
    LaunchedEffect(key1 = true){
        animationPlayed = true
    }
    
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.size(size = radius * 2f)
    ) {
        Canvas(
            modifier = Modifier
                .size(radius * 2f),
        ){
            drawArc(
                color = MainColor,
                -90f,
                sweepAngle = 360 * currentPercentage.value,
                useCenter = false,
                style = Stroke(strokeWidth.toPx() , cap = StrokeCap.Round)
            )
        }
        Text(
            text = "${(currentPercentage.value * number ).toInt().toString()}%",
            color = MaterialTheme.colors.primaryVariant,
            fontSize = 10.sp
        )
    }
}