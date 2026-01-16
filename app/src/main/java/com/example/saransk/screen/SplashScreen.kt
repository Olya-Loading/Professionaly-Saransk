package com.example.saransk.screen

import android.annotation.SuppressLint
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.saransk.R
import com.example.saransk.data.PagerViewModel
import com.example.saransk.ui.theme.SaranskTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SplashScreen(modifier: Modifier = Modifier,navController : NavHostController = rememberNavController()) {
    Scaffold(modifier= Modifier, containerColor = colorResource(R.color.purple)) {
        Column(modifier = Modifier.fillMaxSize().padding(top = 290.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(R.drawable.illustrations), contentDescription = "", modifier = Modifier.size(164.dp).clickable(onClick = {
                navController.navigate(Destinations.OnBoardingScreen1.route)}))
            Text(text = "Language App", fontSize = 37.sp, modifier = Modifier.padding(top = 15.dp))
        }
    }
}

@Preview
@Composable
private fun SplashScreenPrev() {
    SaranskTheme {
        //SplashScreen(modifier = Modifier)
    }
}