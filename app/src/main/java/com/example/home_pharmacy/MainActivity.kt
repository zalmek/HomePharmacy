package com.example.home_pharmacy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.home_pharmacy.composables.screens.MainScreen
import com.example.home_pharmacy.composables.screens.RegistrationScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}





@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
        RegistrationScreen()
}