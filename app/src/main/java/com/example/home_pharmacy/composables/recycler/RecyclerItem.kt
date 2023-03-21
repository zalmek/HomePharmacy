package com.example.home_pharmacy.composables.recycler

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.home_pharmacy.composables.FilledButton
import com.example.home_pharmacy.db.Medicine

@Composable
fun RecyclerItem(modifier: Modifier = Modifier, medicine: Medicine, ) {
    Column {
        Text(text = medicine.type)
        Text(text = medicine.name)
        Text(text = "Срок годности: ${medicine.expires}")

        val list = medicine.tags.split(",")
        Row() {
            list.forEach {
                FilledButton(text = it, color = TODO(), onClick = { println() })

            }
        }
    }
}