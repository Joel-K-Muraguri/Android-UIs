package com.joel.podcast.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SearchSection(){

    Card(
        modifier = Modifier
            .shadow(5.dp, RoundedCornerShape(20.dp))
            .background(MaterialTheme.colors.background, RoundedCornerShape(20.dp)),
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(12.dp)
        ) {
            Text(
                text = "Listen to your favourite podcast",
                fontSize = 28.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(8.dp))
            SearchTextField()
        }
    }
}

@Composable
fun SearchTextField(
    hint : String = ""
){

    var value by remember {
        mutableStateOf("")
    }

    val isHintDisplayed by remember {
        mutableStateOf(hint != "")
    }


    BasicTextField(
        value = value,
        onValueChange = {
            value = it
        },
        modifier = Modifier
            .shadow(5.dp, CircleShape)
            .background(Color.White, CircleShape)
            .padding(horizontal = 20.dp, vertical = 12.dp)
            .fillMaxWidth(),
        singleLine = true,
        maxLines = 1
    )

    if (isHintDisplayed){
        Text(
            text = hint,
            modifier = Modifier.padding(
                horizontal = 20.dp, vertical = 12.dp
            ),
            color = Color.LightGray
        )
    }
}