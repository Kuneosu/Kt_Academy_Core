package com.kuneosu.kotlinacademycore.presentation.navgraph

sealed class Route(
    val route: String
) {

    data object ProblemListScreen : Route("problemList")

    data object NavigationScreen : Route("navigation")
}