package com.kuneosu.kotlinacademycore.presentation.navgraph

sealed class Route(
    val route: String
) {

    data object ProblemListScreen : Route("problemList")
    data object OnBoardingScreen : Route("onBoarding")

    data object AppStartNavigation : Route("appStartNavigation")
    data object DefaultNavigation : Route("defaultNavigation")
}