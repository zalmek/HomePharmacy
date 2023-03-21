package com.example.home_pharmacy.composables.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.home_pharmacy.composables.FilledButton
import com.example.home_pharmacy.composables.InputField

@Composable
fun RegistrationScreen(modifier: Modifier = Modifier, navigateToMedicineScreen: ()->Unit){
//    var isChecked by remember {
//        mutableStateOf(false)
//    }
    Column(modifier = modifier
        .background(Color.White)
        .fillMaxSize()) {
        Text(text = "Регистрация", modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 50.dp), fontSize = 40.sp, color = Color(android.graphics.Color.parseColor("#2688EB")))
        InputField(Modifier.padding(top = 150.dp),label = "Email")
        InputField(label = "Логин")
        InputField(label = "Пароль")
//        Row(modifier = modifier) {
//            Switch(modifier = modifier,checked = isChecked, onCheckedChange = {isChecked=!isChecked}, colors = SwitchDefaults.colors(checkedThumbColor =  Color(android.graphics.Color.parseColor("#2688EB"))))
//            Column() {
//                Text(text = "Автоматическая синхронизация", modifier = modifier, Color.Black, fontSize = 16.sp)
//                Text(text = "Разрешает автоматически синхронизировать записи, если есть доступ в Интернет (можно отключить в меню настроек)",modifier = modifier.padding(end = 10.dp), Color(129,140,153), fontSize = 13.sp)
//            }
//        }
        FilledButton(modifier = Modifier.padding(top = 200.dp), text = "Зарегистрироваться", onClick = { navigateToMedicineScreen() })

    }
}