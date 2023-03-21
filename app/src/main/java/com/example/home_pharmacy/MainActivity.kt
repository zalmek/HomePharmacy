package com.example.home_pharmacy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.home_pharmacy.composables.screens.AddMedicineScreen
import com.example.home_pharmacy.composables.screens.MainScreen
import com.example.home_pharmacy.composables.screens.MedicinesScreen
import com.example.home_pharmacy.composables.screens.RegistrationScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            MyAppNavHost(navController = navController)
    }
}
@Composable
fun MyAppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "mainscreen"
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
    ) {
        composable(route = "mainscreen") {
            MainScreen(navigateToRegistration = { navController.navigate("registrationscreen") })
        }
        composable("registrationscreen") {
            RegistrationScreen(navigateToMedicineScreen = {navController.navigate("medicinesscreen")})
        }
        composable("addmedicinescreen") {
            AddMedicineScreen(navigateToMedicineScreen = {navController.navigate("medicinesscreen")})
        }
        composable("medicinesscreen") {
            MedicinesScreen(navigateToAddMedicineScreen = {navController.navigate("addmedicinescreen")})
        }
    }
    navController.navigate("mainscreen")
}
}




@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
}