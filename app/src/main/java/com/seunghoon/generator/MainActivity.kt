package com.seunghoon.generator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.seunghoon.designsystem.ui.theme.ProjectGeneratorTheme
import com.seunghoon.generator.navigation.ProjectGeneratorApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectGeneratorTheme {
                ProjectGeneratorApp()
            }
        }
    }
}
