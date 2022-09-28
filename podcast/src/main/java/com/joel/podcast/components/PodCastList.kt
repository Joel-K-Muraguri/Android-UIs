package com.joel.podcast.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.joel.podcast.model.DataStore
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Composable
fun PodCastList(navigator: DestinationsNavigator){

    val podCast = remember {
        DataStore.podCast
    }

    LazyRow {
        items(
            items = podCast,
            itemContent = {
                PodCastItem(podCast = it, navigator)
            }
        )
    }
}

