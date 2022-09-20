package com.joel.podcast

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joel.podcast.components.*
import com.ramcosta.composedestinations.annotation.Destination

//@Destination(start = true)
@Composable
fun ListPage(){

    Scaffold(
        topBar = {
                 TopSection()
        },
        bottomBar = {
           BottomSection()
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
                    Text(text = "Categories")
                    Spacer(modifier = Modifier.height(3.dp))
                    TopicList()
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(text = "Recently Played")
                    Spacer(modifier = Modifier.height(3.dp))
                    PodCastList()
                    Spacer(modifier = Modifier.height(20.dp))

                }
            }
//            Box(
//                contentAlignment = Alignment.BottomCenter,
//                modifier = Modifier
//                    .background(color = MaterialTheme.colors.background)
//                    .shadow(5.dp)
//                    .height(50.dp)
//                    .fillMaxWidth()
//
//            ) {
//                BottomSection()
//            }

        }

    }
}


@Preview(showBackground = true)
@Composable
fun ListPreview(){
    ListPage()
}