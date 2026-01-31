package com.example.saransk.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.saransk.R
import com.example.saransk.ui.theme.Blue
import com.example.saransk.ui.theme.FredokaFamily
import com.example.saransk.ui.theme.Grey
import com.example.saransk.ui.theme.Purple
import com.example.saransk.ui.theme.Purple40
import com.example.saransk.ui.theme.SaranskTheme
import com.example.saransk.ui.theme.darkGrey

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(modifier: Modifier = Modifier,navController : NavHostController = rememberNavController()) {
    Scaffold(topBar = {

            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(Purple),
                title = {
                    Text(
                        modifier = Modifier.padding(start = 100.dp),
                        text = "Signup",
                        fontSize = 19.sp,
                        fontFamily = FredokaFamily,
                        fontWeight = FontWeight.Medium, color = Color.White
                    )
                },
                navigationIcon = { Icon(painter = painterResource(R.drawable.icon_left), contentDescription = "", modifier = Modifier.padding(start = 30.dp).size(20.dp).clickable(onClick = { navController.popBackStack() }), tint = Color.White) })

    }) {innerPadding->
        Column(modifier = Modifier.fillMaxSize().padding(innerPadding), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Create an Account",
                fontSize = 22.sp,
                fontFamily = FredokaFamily,
                fontWeight = FontWeight.Medium
                , modifier = Modifier.padding(top = 40.dp, bottom = 10.dp)
            )
            val text = remember { mutableStateOf("") }
            Column(modifier = Modifier.width(327.dp)){
                Text(
                    text = "Your First Name",
                    fontSize = 15.sp,
                    fontFamily = FredokaFamily,
                    fontWeight = FontWeight.Light
                    , modifier = Modifier.padding(top = 25.dp)
                )

                OutlinedTextField(
                    value = text.value,
                    onValueChange = { text.value = it },
                    modifier = Modifier.width(327.dp),
                    label = { Text(text = "Your First Name", color = darkGrey,fontSize = 15.sp,
                        fontFamily = FredokaFamily,
                        fontWeight = FontWeight.Light) },
                    shape = RoundedCornerShape(18)
                )
            }
            val text2 = remember { mutableStateOf("") }
            Column(modifier = Modifier.width(327.dp)){
                Text(
                    text = "Your Last Name",
                    fontSize = 15.sp,
                    fontFamily = FredokaFamily,
                    fontWeight = FontWeight.Light
                    , modifier = Modifier.padding(top = 25.dp)
                )

                OutlinedTextField(
                    value = text2.value,
                    onValueChange = { text2.value = it },
                    modifier = Modifier.width(327.dp),
                    label = { Text(text = "Your Last Name", color = darkGrey,fontSize = 15.sp,
                        fontFamily = FredokaFamily,
                        fontWeight = FontWeight.Light) },
                    shape = RoundedCornerShape(18)
                )
            }
            EditRegistration("Email Address", "Email")
            Button(
                onClick = {navController.navigate(Destinations.LoginScreen.route)},
                shape = RoundedCornerShape(11.dp),
                modifier = Modifier.padding(top = 40.dp)
                    .width(327.dp)
                    .height(56.dp)
            ) { Text(text = "Continue", fontSize = 21.sp) }
            Row(modifier = Modifier.padding(top = 25.dp)) {
                Text(text = "Already you member? ", fontWeight = FontWeight.Medium, fontSize = 17.sp, color = darkGrey)
                Text(text = "Login",fontWeight = FontWeight.Medium, fontSize = 17.sp, color = Blue)
            }

        }
    }

}
@Composable
fun EditRegistration(text: String = "", label : String="") {
    val text = remember { mutableStateOf("") }
    Column(modifier = Modifier.width(327.dp)){
        Text(
            text = label,
            fontSize = 15.sp,
            fontFamily = FredokaFamily,
            fontWeight = FontWeight.Light
            , modifier = Modifier.padding(top = 25.dp)
        )

    OutlinedTextField(
        value = text.value,
        onValueChange = { text.value = it },
        modifier = Modifier.width(327.dp),
        label = { Text(text = label, color = darkGrey,fontSize = 15.sp,
            fontFamily = FredokaFamily,
            fontWeight = FontWeight.Light) },
        shape = RoundedCornerShape(18)
    )
}}

@Preview
@Composable
private fun SignUpScreen() {
    SaranskTheme(){SignUpScreen(modifier = Modifier)}
}
