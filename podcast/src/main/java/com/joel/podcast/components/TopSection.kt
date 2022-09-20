package com.joel.podcast.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joel.podcast.R

@Composable
fun TopSection(){

    TopAppBar(
        backgroundColor = Color.White,
        contentColor = Color.Black,
        elevation = 0.dp,
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(painter = painterResource(
                    id = R.drawable.ic_baseline_menu_24),
                    contentDescription = "menu")
            }
        },
        title = {
                Text(
                    text = "Quari PodCast",
                    textAlign = TextAlign.Center
                )
        },

        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(painter = painterResource(
                    id = R.drawable.ic_baseline_notifications_none_24),
                    contentDescription = "menu")
            }
        }
    )
}


@Preview
@Composable
fun TopPreview(){
    TopSection()
}