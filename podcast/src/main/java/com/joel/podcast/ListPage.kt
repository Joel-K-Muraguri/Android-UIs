package com.joel.podcast

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.joel.podcast.components.*
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun ListPage(navigator: DestinationsNavigator) {

    Scaffold(
        topBar = {
            TopSection()
        },
        bottomBar = {
            BottomBarSection()
        },
        backgroundColor = MaterialTheme.colors.background
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
        ) {
            Box(
                modifier = Modifier
                    .padding(12.dp)
            ) {
                Column() {

                    Box(
                        contentAlignment = Alignment.Center
                    ) {
                        SearchSection()
                    }
                    Spacer(modifier = Modifier.height(12.dp))

                    Text(text = "Categories", color = Color.Black)

                    Spacer(modifier = Modifier.height(3.dp))
                    TopicList()
                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Recently Played",
                        color = Color.Black
                    )

                    Spacer(modifier = Modifier.height(3.dp))
                    PodCastList(navigator)
                    Spacer(modifier = Modifier.height(20.dp))

                }
            }
        }
    }
}