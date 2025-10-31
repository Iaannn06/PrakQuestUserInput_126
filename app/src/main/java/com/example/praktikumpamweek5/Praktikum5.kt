package com.example.praktikumpamweek5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun RegistrationScreen() {
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var selectedGender by remember { mutableStateOf("") }
    var selectedStatus by remember { mutableStateOf("") }

}