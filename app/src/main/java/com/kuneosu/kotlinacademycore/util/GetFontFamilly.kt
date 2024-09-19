package com.kuneosu.kotlinacademycore.util

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.kuneosu.kotlinacademycore.R

fun getFontFamily(): FontFamily = FontFamily(
    Font(R.font.paperlogy_thin, FontWeight.W100),       // Thin
    Font(R.font.paperlogy_extralight, FontWeight.W200), // ExtraLight
    Font(R.font.paperlogy_light, FontWeight.W300),      // Light
    Font(R.font.paperlogy_regular, FontWeight.W400),    // Normal
    Font(R.font.paperlogy_medium, FontWeight.W500),     // Medium
    Font(R.font.paperlogy_semibold, FontWeight.W600),   // SemiBold
    Font(R.font.paperlogy_bold, FontWeight.W700),       // Bold
    Font(R.font.paperlogy_extrabold, FontWeight.W800),  // ExtraBold
    Font(R.font.paperlogy_black, FontWeight.W900)       // Black
)