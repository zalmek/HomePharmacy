package com.example.home_pharmacy.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InputField(modifier: Modifier = Modifier,label: String) {
    var text by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        modifier = modifier.padding(
            10.dp
        ).fillMaxWidth(1f),
        label = { Text(text = label)},
        placeholder = { Text(text = "Ввести $label")},
        singleLine = true
        )
}

@Composable
fun MultilineInputField(modifier: Modifier = Modifier,label: String) {
    var text by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        modifier = modifier.padding(
            10.dp
        ).fillMaxWidth(1f),
        label = { Text(text = label)},
        placeholder = { Text(text = "Ввести $label")},
        singleLine = false
    )
}