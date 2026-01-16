package com.example.saransk.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.saransk.ui.theme.Blue
import com.example.saransk.ui.theme.FredokaFamily
import com.example.saransk.ui.theme.Purple
import com.example.saransk.ui.theme.SaranskTheme
import com.example.saransk.ui.theme.lightLightGrey

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    Scaffold(topBar = {
        TopAppBar(title = {
            Text(
                "Your profile, Emil",
                fontSize = 22.sp,
                fontFamily = FredokaFamily,
                fontWeight = FontWeight.Medium
            )
        }, colors = TopAppBarDefaults.topAppBarColors(Purple))
    }) { innerPadding->
        Column( modifier = Modifier.fillMaxSize().padding(innerPadding),horizontalAlignment = Alignment.CenterHorizontally,) {
            Spacer(modifier = Modifier.height(400.dp))
            Button(
                colors = ButtonDefaults.buttonColors(Blue),
                onClick = {},
                shape = RoundedCornerShape(11.dp),
                modifier = Modifier.padding(top = 100.dp)
                    .width(327.dp)
                    .height(56.dp)
            ) { Text(text = "Switch to Dark", fontSize = 21.sp) }
            Button(
                colors = ButtonDefaults.buttonColors(Blue),
                onClick = {},
                shape = RoundedCornerShape(11.dp),
                modifier = Modifier.padding(top = 10.dp)
                    .width(327.dp)
                    .height(56.dp)
            ) { Text(text = "Change mother language", fontSize = 21.sp) }
            Button(
                colors = ButtonDefaults.buttonColors(Blue),
                onClick = {},
                shape = RoundedCornerShape(11.dp),
                modifier = Modifier.padding(top = 10.dp)
                    .width(327.dp)
                    .height(56.dp)
            ) { Text(text = "Change your image", fontSize = 21.sp) }
            Button(
                colors = ButtonDefaults.buttonColors(lightLightGrey),
                onClick = {},
                shape = RoundedCornerShape(11.dp),
                modifier = Modifier.padding(top = 10.dp)
                    .width(327.dp)
                    .height(56.dp)
            ) { Text(text = "Logout", fontSize = 21.sp) }
        }


    }
}

@Preview
@Composable
private fun ProfileScreenPrev() {
    SaranskTheme{ProfileScreen(modifier = Modifier)}
}