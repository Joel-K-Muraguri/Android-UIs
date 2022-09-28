package com.joel.podcast.onboarding

import com.joel.podcast.R

data class Page(
    val image : Int,
    val title : String,
    val description : String
)

val onboardPage = listOf(

    Page(
        image = R.drawable.logo,
        title = "Quari Podcast",
        description = "Browse over 10m+ podcast in one place, anytime and anywhere"
    )

)