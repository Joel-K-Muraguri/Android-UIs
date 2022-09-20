package com.joel.podcast.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joel.podcast.R

@Composable
fun BottomSection(){

    BottomAppBar(
        backgroundColor = MaterialTheme.colors.background,
        contentColor = Color.Black,
        elevation = 5.dp
    ) {
        val items = listOf(
            Bottom.Home,
            Bottom.Collections,
            Bottom.Favourites,
            Bottom.Profile
        )

        BottomNavigation {
            items.forEach { screen ->
                Items(screen = screen)
            }
        }
    }
}

@Composable
fun RowScope.Items(screen : Bottom){
    BottomNavigationItem(
        icon = {
             Image(painter = painterResource(id = screen.icon), contentDescription = screen.title)
        },
        label = {
              Text(text = screen.title)
        },
        onClick = {

        },
        selected = false
    )
}



sealed class Bottom(
    val icon : Int,
    val title: String
){
    object Home : Bottom(
        icon = R.drawable.ic_baseline_home_24,
        title = "Home"
    )
    object Collections : Bottom(
        icon = R.drawable.ic_baseline_collections_24,
        title = "Collections"
    )
    object Favourites : Bottom(
        icon = R.drawable.ic_baseline_favorite_border_24,
        title = "Favourites"
    )
    object Profile : Bottom(
        icon = R.drawable.ic_baseline_person_outline_24,
        title = "Profile"
    )
}

@Preview
@Composable
fun BottomPreview(){
    BottomSection()
}