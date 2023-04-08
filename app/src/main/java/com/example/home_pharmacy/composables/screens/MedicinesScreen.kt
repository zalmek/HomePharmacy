package com.example.home_pharmacy.composables.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.home_pharmacy.composables.FloatingFilledButton

@Composable
fun MedicinesScreen(modifier: Modifier = Modifier, navigateToAddMedicineScreen : ()-> Unit){
    Column(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()) {
        FloatingFilledButton(text = "Добавить", onClick = {navigateToAddMedicineScreen()}, color = Color(android.graphics.Color.parseColor("#4BB34B")))
    }
}