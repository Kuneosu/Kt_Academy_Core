package com.kuneosu.kotlinacademycore.presentation.onboarding

import androidx.annotation.DrawableRes
import com.kuneosu.kotlinacademycore.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Welcome to Kotlin Academy",
        description = "Kotlin Academy is a platform to learn and practice Kotlin programming language.",
        image = R.drawable.app_logo_box
    ),
    Page(
        title = "Learn",
        description = "Learn Kotlin programming language with our interactive lessons.",
        image = R.drawable.app_logo_box
    ),
    Page(
        title = "Practice",
        description = "Practice your Kotlin skills with our interactive problems.",
        image = R.drawable.app_logo_box
    ),
)
