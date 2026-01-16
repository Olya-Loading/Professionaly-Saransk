package com.example.saransk.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.saransk.R
import com.example.saransk.ui.theme.Blue
import com.example.saransk.ui.theme.FredokaFamily
import com.example.saransk.ui.theme.Purple40
import com.example.saransk.ui.theme.SaranskTheme
import com.example.saransk.ui.theme.darkGrey
import com.example.saransk.ui.theme.lightGrey
import androidx.compose.material3.OutlinedTextField
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(modifier: Modifier = Modifier,navController : NavHostController = rememberNavController()) {


    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Purple40),
                title = { Text(
                    modifier = Modifier.padding(start = 100.dp),
                    text = "Login",
                    fontSize = 19.sp,
                    fontFamily = FredokaFamily,
                    fontWeight = FontWeight.Medium, color = Color.White
                ) },
                navigationIcon = {
                    Icon(
                        painter = painterResource(R.drawable.icon_left),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(start = 30.dp)
                            .size(20.dp),
                        tint = Color.White
                    )
                })
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
                modifier = Modifier
                    .size(105.dp)
                    .padding(top = 18.dp)
            )


            Text(
                text = "For free, join now and ",
                fontSize = 22.sp,
                modifier = Modifier.padding(top = 20.dp)
            )
            Text(
                text = "start learning",
                fontSize = 22.sp,
                modifier = Modifier.padding(bottom = 20.dp)
            )


            Box() {
                Column {
                    Text(text = "Email Address", fontSize = 15.sp)
                    EditEmailRegistration("Email")
                }
            }
            Box() {

                    EditPasswordRegistration("Password")

            }
            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 30.dp)
                    .width(327.dp)
            ) {
                Text(
                    text = "Forgot Password",
                    fontWeight = FontWeight.Light,
                    fontSize = 15.sp,
                    fontFamily =
                        FredokaFamily, color = Color.Red
                )
            }
            Button(
                onClick = {},
                shape = RoundedCornerShape(11.dp),
                modifier = Modifier
                    .width(327.dp)
                    .height(56.dp)
            ) { Text(text = "Login", fontSize = 21.sp) }
            Row(modifier = Modifier.padding(top = 25.dp)) {
                Text(
                    text = "Not you member? ",
                    fontWeight = FontWeight.Medium,
                    fontSize = 17.sp,
                    color = darkGrey
                )
                Text(
                    text = "Signup",
                    fontWeight = FontWeight.Medium,
                    fontSize = 17.sp,
                    color = Blue
                )
            }
        }

    }

}

fun isValidEmail(email: String): Boolean {
    val regex = Regex("^[a-z0-9]+@[a-z0-9]+\\.ru$")
    return regex.matches(email)
}

fun isStrongPassword(password: String): Boolean {
    val regex = Regex("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.* )(?=.*[^a-zA-Z0-9 ]).{8,}$")
    return regex.matches(password)
}
@Composable
fun EditEmailRegistration(label: String = "") {
    val text = remember { mutableStateOf("") }
    OutlinedTextField(

        value = text.value,
        onValueChange = { text.value = it },
        modifier = Modifier.width(327.dp),
        label = { Text(text = label, color = darkGrey) },
        shape = RoundedCornerShape(18), colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = lightGrey)

    )
}

@Composable
fun EditPasswordRegistration(text: String) {
    val password = remember { mutableStateOf("") }
    val passwordVisible = remember { mutableStateOf(false) }
    Column(modifier = Modifier.width(327.dp)){
        Text(
            text =text,
            fontSize = 15.sp,
            fontFamily = FredokaFamily,
            fontWeight = FontWeight.Light
            , modifier = Modifier.padding(top = 25.dp)
        )

        OutlinedTextField(
        value = password.value,
        onValueChange = { password.value = it },
        modifier = Modifier.width(327.dp),
        label = { Text(text = "") },
        visualTransformation = if (passwordVisible.value)
            VisualTransformation.None
        else
            PasswordVisualTransformation(),
        shape = RoundedCornerShape(18),
        trailingIcon = {
            IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                Icon(painter = painterResource(id = R.drawable.ic_eye), contentDescription = "")
            }
        }
    )}
}


@Preview
@Composable
private fun LogPrev() {
    SaranskTheme { LoginScreen(modifier = Modifier) }
}