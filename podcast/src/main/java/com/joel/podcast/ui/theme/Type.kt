package com.joel.podcast.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.joel.podcast.R

// Set of Material typography styles to start with


val Roboto = FontFamily(
    Font(R.font.roboto_bold, FontWeight.ExtraBold),
    Font(R.font.roboto_regular),
    Font(R.font.roboto_light, FontWeight.ExtraLight)
)



val Typography = Typography(

    h1 = TextStyle(
        fontFamily = Roboto
    ),
    h2 = TextStyle(
        fontFamily = Roboto
    ),
    h3 = TextStyle(
        fontFamily = Roboto
    ),
    h4 = TextStyle(
        fontFamily = Roboto,
    ),
    h5 = TextStyle(
        fontFamily = Roboto,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold

    ),
    h6 = TextStyle(
        fontFamily = Roboto,
        fontSize = 30.sp,
        fontWeight = FontWeight.ExtraBold
    ),

    subtitle1 = TextStyle(
        fontFamily = Roboto
    ),

    subtitle2 = TextStyle(
        fontFamily = Roboto
    ),

    button = TextStyle(
        fontFamily = Roboto,
        fontSize = 20.sp,
        fontWeight = FontWeight.Normal
    ),

    caption = TextStyle(
        fontFamily = Roboto,
        fontSize = 10.sp
    ),

    body1 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),

    body2 = TextStyle(
        fontFamily = Roboto
    ),



    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)