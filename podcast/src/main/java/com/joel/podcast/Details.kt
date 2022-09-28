package com.joel.podcast

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun DetailScreen(){

       Text(
              text = "Hi Details Screen",
              color = Color.Black
       )
    
}