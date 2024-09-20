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
        title = "코틀린 아카데미에 오신 것을 환영합니다!",
        description = "이 앱은 '코틀린 아카데미 : 핵심편' 책의 연습문제를 풀고 이해하는 데 도움을 주기 위해 만들어졌습니다. 다양한 문제를 풀고, 학습 진도를 추적하며 코틀린 실력을 향상시켜보세요!",
        image = R.drawable.book
    ),
    Page(
        title = "실시간 문제 풀이와 해설",
        description = "17가지 연습문제를 통해 코틀린의 핵심 개념을 익힐 수 있습니다. 각 문제를 풀고 나면 자세한 해설을 통해 문제에 대한 이해를 높일 수 있어요.",
        image = R.drawable.app_logo_box
    ),
    Page(
        title = "학습 진도 추적 및 기록 관리",
        description = "문제 풀이 기록을 저장하고, 학습 진도를 추적할 수 있습니다. 풀이 중인 문제의 답안을 임시로 저장하여 언제든지 다시 이어서 풀 수 있어요.",
        image = R.drawable.app_logo_box
    ),
)
