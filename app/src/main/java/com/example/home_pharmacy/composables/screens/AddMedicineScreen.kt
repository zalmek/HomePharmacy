package com.example.home_pharmacy.composables.screens


import DatePicker
import android.app.DatePickerDialog
import android.widget.DatePicker
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.DropdownMenu
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.example.home_pharmacy.composables.FilledButton
import com.example.home_pharmacy.composables.InputField
import com.example.home_pharmacy.composables.MultilineInputField
import java.text.DateFormat
import java.util.*

@Composable
fun AddMedicineScreen(modifier: Modifier = Modifier, navigateToMedicineScreen: ()->Unit){
    Column(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()) {
        InputField(label = "Название")
        InputField(label = "Тип")
        MultilineInputField(label = "Способ применения и дозы")
        var showMenu by remember { mutableStateOf(false) }
        DropdownMenu(expanded = showMenu, onDismissRequest = { showMenu=false }) {
            val list = mutableListOf("Жаропонижающее","Противовоспалительное","Обезболивающее","Анестетиком","Глазное")
        }
        var showPicker by remember { mutableStateOf(false) }

        // Fetching the Local Context
        val mContext = LocalContext.current

        // Declaring integer values
        // for year, month and day
        val mYear: Int
        val mMonth: Int
        val mDay: Int

        // Initializing a Calendar
        val mCalendar = Calendar.getInstance()

        // Fetching current year, month and day
        mYear = mCalendar.get(Calendar.YEAR)
        mMonth = mCalendar.get(Calendar.MONTH)
        mDay = mCalendar.get(Calendar.DAY_OF_MONTH)

        mCalendar.time = Date()

        // Declaring a string value to
        // store date in string format
        val mDate = remember { mutableStateOf("22/12/01") }

        // Declaring DatePickerDialog and setting
        // initial values as current values (present year, month and day)
        val mDatePickerDialog = DatePickerDialog(
            mContext,
            { _: DatePicker, mYear: Int, mMonth: Int, mDayOfMonth: Int ->
                mDate.value = "$mDayOfMonth/${mMonth+1}/$mYear"
            }, mYear, mMonth, mDay
        )



        if (showPicker)
            mDatePickerDialog.show()
            showPicker=false
        FilledButton(onClick = { showPicker = true }, text = mDate.value)
        FilledButton(text = "Добавить", onClick = { navigateToMedicineScreen() })
    }
}