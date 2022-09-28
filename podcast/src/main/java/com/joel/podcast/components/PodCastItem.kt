package com.joel.podcast.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joel.podcast.destinations.DetailScreenDestination
import com.joel.podcast.model.PodCast
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Composable
fun PodCastItem(
    podCast: PodCast,
    navigator: DestinationsNavigator
){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(12.dp)
            .clickable {
                    navigator.navigate(DetailScreenDestination)
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            elevation = 5.dp,
            modifier = Modifier
                .size(200.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Image(
                painter = painterResource(id = podCast.image),
                contentDescription = podCast.name,
                contentScale = ContentScale.FillBounds
            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row(
            horizontalArrangement = Arrangement.Center
        ) {
            Column() {
                Text(
                    text = podCast.name,
                    overflow = TextOverflow.Ellipsis,
                    color = MaterialTheme.colors.primaryVariant
                )
                Text(
                    text = podCast.time,
                    color = Color.LightGray,
                    fontSize = 14.sp
                )
            }

            Spacer(modifier = Modifier.width(90.dp))
            Box(
                modifier = Modifier
                    .size(35.dp)
            ) {
                CustomCircularProgressBar(percentage = podCast.percentage, number = 100)
            }
        }
    }
}

