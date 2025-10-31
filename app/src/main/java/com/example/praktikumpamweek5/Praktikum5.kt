package com.example.praktikumpamweek5

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.stringArrayResource
import  androidx.compose.ui.graphics.Color

val purpleGradient = Brush.verticalGradient(
    colors = listOf(
        Color(0xFF6A1B9A), //
        Color(0xFF8E24AA), //
        Color(0xFFAB47BC)  //
    )
)
@Composable
fun RegistrationScreen() {
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var selectedGender by remember { mutableStateOf("") }
    var selectedStatus by remember { mutableStateOf("") }

    var submittedNama by remember { mutableStateOf("") }
    var submittedAlamat by remember { mutableStateOf("") }
    var submittedGender by remember { mutableStateOf("") }
    var submittedStatus by remember { mutableStateOf("") }

    val genderOptions = stringArrayResource(R.array.gender_options)
    val statusOptions = stringArrayResource(R.array.status_options)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(purpleGradient)
    ){

    }
}

