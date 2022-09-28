package com.joel.podcast.components

import androidx.compose.material.*
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
        backgroundColor = MaterialTheme.colors.background,
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
                    textAlign = TextAlign.Center,
                    color = Color.Black
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