package com.kuneosu.kotlinacademycore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.kuneosu.kotlinacademycore.presentation.navgraph.NavGraph
import com.kuneosu.kotlinacademycore.presentation.navgraph.Route
import com.kuneosu.kotlinacademycore.ui.theme.KotlinAcademyCoreTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        installSplashScreen()
        setContent {
            KotlinAcademyCoreTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    NavGraph(startDestination = Route.ProblemListScreen.route)
                }
            }
        }
    }
}

