package com.joel.podcast.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.joel.podcast.model.DataStore

@Composable
fun TopicList(){

    val topics = remember {
        DataStore.topic
    }

    LazyRow {
        items(
            items = topics,
            itemContent = {
                TopicItem(topic = it)
            }
        )
    }
}