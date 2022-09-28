package com.joel.podcast.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SearchSection(){

    Card(
        modifier = Modifier
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
){
    var value by remember {
        mutableStateOf("")
    }
    
    OutlinedTextField(
        value = value,
        onValueChange = {
            value = it
        },
        modifier = Modifier
//            .shadow(5.dp, CircleShape)
            .background(Color.White, RoundedCornerShape(20.dp))
//            .padding(horizontal = 20.dp, vertical = 12.dp)
            .fillMaxWidth(),
        singleLine = true,
        maxLines = 1,
        shape = RoundedCornerShape(20.dp),
        placeholder = {
           Row(
               horizontalArrangement = Arrangement.Center,
               verticalAlignment = Alignment.CenterVertically
           ) {
               Icon(
                   imageVector = Icons.Default.Search,
                   contentDescription = "search",
                   tint = Color.LightGray
               )
               Spacer(modifier = Modifier.width(6.dp))
               Text(
                   text = "Search for a podcast",
                   color = Color.LightGray
               )
           }
        },
        colors = TextFieldDefaults.textFieldColors(


        )
    )
}