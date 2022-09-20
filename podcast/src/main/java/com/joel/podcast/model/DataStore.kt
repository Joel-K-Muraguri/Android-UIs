package com.joel.podcast.model

import com.joel.podcast.R

object DataStore {

    val topic = listOf(
        Topic(
            name = "Business",
            icon = R.drawable.briefcase_emoji
        ),
        Topic(
            name = "Space",
            icon = R.drawable.space_emoji
        ),
        Topic(
            name = "Music",
            icon = R.drawable.music_emoji
        ),
        Topic(
            name = "Well-being",
            icon = R.drawable.wholesome_emoji
        ),
        Topic(
            name = "Marriage",
            icon = R.drawable.ring_emoji
        ),
        Topic(
            name = "Education",
            icon = R.drawable.education_emoji
        ),
        Topic(
            name = "Travel",
            icon = R.drawable.plane_emoji
        ),
        Topic(
            name = "Finance",
            icon = R.drawable.finance_emoji
        ),
    )

    val podCast = listOf(
        PodCast(
            name = "1",
            image = R.drawable.business,
            topic = "Business",
            time = "1h 40min",
            0.45f
        ),
        PodCast(
            name = "2",
            image = R.drawable.music,
            topic = "Music",
            time = "40min",
            percentage = 0.4f
        ),
        PodCast(
            name = "3",
            image = R.drawable.finance,
            topic = "Finance",
            time = "2h 40min",
            0.8f,
        ),
        PodCast(
            name = "4",
            image = R.drawable.travel,
            topic = "Travel",
            time = "1h 10min",
            0.3f
        ),
        PodCast(
            name = "5",
            image = R.drawable.tech,
            topic = "Technology",
            time = "1h ",
            0.23f
        ),
        PodCast(
            name = "6",
            image = R.drawable.school,
            topic = "School",
            time = "30min",
            0.58f
        ),
        PodCast(
            name = "7",
            image = R.drawable.marriage,
            topic = "Marriage",
            time = "1h 40min",
            1f
        ),
        PodCast(
            name = "8",
            image = R.drawable.wellbeing,
            topic = "Wellbeing",
            time = "1h 40min",
            0.69f
        ),
    )
}