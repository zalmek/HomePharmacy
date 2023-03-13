package com.example.home_pharmacy.composables

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun FilledButton(modifier: Modifier = Modifier, text: String,onClick: () -> Unit){
    Button(modifier = modifier
        .padding(15.dp)
        .clip(
            RoundedCornerShape(15.dp)
        )
        .width(360.dp)
        .height(44.dp), onClick = onClick, colors = ButtonDefaults.textButtonColors(contentColor = Color.White, backgroundColor = Color(android.graphics.Color.parseColor("#2688EB")))){
        Text(text = text)
    }
}
@Composable
fun BackgroundlessButton(modifier: Modifier = Modifier, text: String,onClick: () -> Unit){
    Button(modifier = modifier
        .padding(15.dp)
        .clip(
            RoundedCornerShape(10.dp)
        )
        .border(width = 0.dp, color = Color.White)
        .width(360.dp)
        .height(44.dp), onClick = onClick,
        colors = ButtonDefaults.textButtonColors(contentColor = Color(android.graphics.Color.parseColor("#2688EB")), backgroundColor = Color.White)){
        Text(text = text)
    }
}