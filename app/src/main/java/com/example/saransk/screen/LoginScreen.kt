package com.example.saransk.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.saransk.R
import com.example.saransk.ui.theme.Purple40
import com.example.saransk.ui.theme.SaranskTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Purple40),
                title = {})
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.ill_login),
                contentDescription = "",
                modifier = Modifier.size(105.dp)
            )
            Box(modifier = Modifier.width(263.dp)) {
                Column(horizontalAlignment = Alignment.CenterHorizontally, ) {
                    Text(text = "For free, join now and ", fontSize = 22.sp)
                    Text (text = "start learning", fontSize = 22.sp) }

            }

            Box() {
                Column {
                    Text (text = "Email Address", fontSize = 15.sp)
                    EditTextRegistration()
                }
            }
            Box() {
                Column {
                    Text (text = "Email Address", fontSize = 15.sp)
                    EditTextRegistration()
                }
            }


        }
    }

}


@Composable
fun EditTextRegistration(label: String = "") {
    val text = remember { mutableStateOf("") }
    OutlinedTextField(
        value = text.value,
        onValueChange = { text.value = it },
        modifier = Modifier.width(327.dp), label = { Text(text = label) }
    )
}


@Preview
@Composable
private fun LogPrev() {
    SaranskTheme { LoginScreen(modifier = Modifier) }
}