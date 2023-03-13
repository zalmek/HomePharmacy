package com.example.home_pharmacy.composables.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.home_pharmacy.composables.BackgroundlessButton
import com.example.home_pharmacy.composables.FilledButton


@Composable
fun ALertButtonsLayout(modifier: Modifier=Modifier){
    FilledButton(modifier = Modifier, text = "Продолжить", {})
    BackgroundlessButton(
        text = "Зарегистрироваться",
        onClick = {})
}