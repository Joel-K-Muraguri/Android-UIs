package com.joel.podcast

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.compose.rememberNavController

@Composable
fun OnBoardingScreen(){
    val navController = rememberNavController()
    Box(
        contentAlignment = Alignment.Center)
    {
        Button(onClick = {

        }) {
            Text(text = "Get Started")
        }
    }
}