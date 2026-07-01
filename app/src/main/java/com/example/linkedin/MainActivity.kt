package com.example.linkedin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.linkedin.ui.Screeen.ProfileScreen
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Box
import com.example.linkedin.ui.theme.LinkedInTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LinkedInTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   Box(
                       modifier = Modifier
                           .fillMaxSize()
                           .padding(paddingValues = innerPadding)
                   ){
                       ProfileScreen()
                   }
                }
            }
        }
    }
}