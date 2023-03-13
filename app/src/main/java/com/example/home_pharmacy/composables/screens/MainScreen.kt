package com.example.home_pharmacy.composables.screens


import com.example.home_pharmacy.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.home_pharmacy.composables.BackgroundlessButton
import com.example.home_pharmacy.composables.FilledButton
import com.example.home_pharmacy.composables.InputField

@Preview
@Composable
fun MainScreen() {
    var regIsClicked by remember {
        mutableStateOf(false)
    }
    if (regIsClicked){
        RegistrationScreen()
    }
    else {
        Column(modifier = Modifier
            .background(Color.White)
            .fillMaxSize()) {
            Text(text = "Моя аптека", modifier = Modifier.align(CenterHorizontally).padding(top = 50.dp), fontFamily = FontFamily(Font(R.font.pacifico_regular)), fontSize = 40.sp, color = Color(android.graphics.Color.parseColor("#2688EB")))
            var openDialog by remember {
                mutableStateOf(false)
            }
            if (openDialog) {
                AlertDialog(onDismissRequest = { openDialog = false },
                    buttons = { ALertButtonsLayout() },
                    modifier = Modifier.clip(
                        RoundedCornerShape(15.dp)
                    ),
                    title = {
                        Text(
                            text = "Предупреждение",
                            modifier = Modifier.fillMaxWidth(1f),
                            textAlign = TextAlign.Center
                        )
                    },
                    text = {
                        Text(
                            text = "Вам будет недоступна возможность синхронизации записей, пока вы не авторизуетесь.",
                            textAlign = TextAlign.Center
                        )
                    }
                )
            }
            InputField(modifier = Modifier.padding(top = 100.dp), label = "Логин")
            InputField(label = "Пароль")
            FilledButton(modifier = Modifier, text = "Войти", {})
            BackgroundlessButton(
                modifier = Modifier,
                text = "Зарегестрироваться"
            ) { regIsClicked=true }
            BackgroundlessButton(
                modifier = Modifier.padding(top = 200.dp),
                text = "Продолжить без регистрации",
                onClick = { openDialog = true })
        }
    }
}