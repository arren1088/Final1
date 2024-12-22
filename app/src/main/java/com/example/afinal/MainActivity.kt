package com.example.afinal

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.afinal.ui.theme.FinalTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FinalTheme {
                val navController = rememberNavController()
                    FullScreenBackground()
                    NavHost(navController = navController, startDestination = "first_screen") {
                        composable("first_screen") { FirstScreen(navController) }
                        composable("tutorial_screen_1") { TutorialScreen1(navController) }
                        composable("tutorial_screen_2") { TutorialScreen2(navController) }
                        composable("tutorial_screen_3") { TutorialScreen3(navController) }
                        composable("tutorial_screen_4") { TutorialScreen4(navController) }
                        composable("TutorialScreen5") { TutorialScreen5(navController) }
                        composable("TutorialScreen6") { TutorialScreen6(navController) }
                        composable("TutorialScreen7") { TutorialScreen7(navController) }
                        composable("TutorialScreen8") { TutorialScreen8(navController) }
                        composable("final_screen") { FinalScreen(navController) }
                        composable("TestPage1") { TestPage1(navController) }
                        composable("TestPage3") { TestPage3(navController) }
                        composable("TestPage4") { TestPage4(navController) }
                        composable("TestPage5") { TestPage5(navController) }
                        composable("TestPage6") { TestPage6(navController) }
                        composable("TestPage7") { TestPage7(navController) }
                        composable("TestPage8") { TestPage8(navController) }
                        composable("TestPage9") { TestPage9(navController) }
                        composable("TestPage10") { TestPage10(navController) }
                        composable("WrongPage") { WrongPage(navController) }
                    }
                }
            }
        }
    }

