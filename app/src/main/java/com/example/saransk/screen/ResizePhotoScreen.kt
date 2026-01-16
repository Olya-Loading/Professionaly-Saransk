package com.example.saransk.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.saransk.ui.theme.FredokaFamily

@Composable
fun ResizePhotoScreen(modifier: Modifier = Modifier) {
    Scaffold(topBar = TopAppBar(title = { Text("Your photo is gorgeous!", fontFamily = FredokaFamily, fontWeight = FontWeight.Medium , fontSize = 22.sp) })) {  }
    Column(modifier = Modifier.fillMaxSize()){}
}

