package com.kuneosu.kotlinacademycore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.kuneosu.kotlinacademycore.ui.theme.KotlinAcademyCoreTheme

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
                    Text(
                        text = "Hello World!",
                        style = MaterialTheme.typography.displayLarge
                    )
                }
            }
        }
    }
}

