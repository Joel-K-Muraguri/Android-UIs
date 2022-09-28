package com.joel.podcast.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.joel.podcast.model.Topic
import com.joel.podcast.ui.theme.SurfaceColor

@Composable
fun TopicItem(topic: Topic){
    
   Card(
       elevation = 5.dp,
       shape = RoundedCornerShape(15.dp),
       modifier = Modifier.padding(12.dp)
   ) {
       Row(
           horizontalArrangement = Arrangement.Center,
           modifier = Modifier.padding(12.dp),
           verticalAlignment = Alignment.CenterVertically
       ) {
           Image(
               painter = painterResource(id = topic.icon),
               contentDescription = topic.name,
               modifier = Modifier
                   .size(25.dp)
                   .background(color = SurfaceColor),
           )
           Spacer(modifier = Modifier.width(3.dp))
           Text(text = topic.name)
       }
   }
}