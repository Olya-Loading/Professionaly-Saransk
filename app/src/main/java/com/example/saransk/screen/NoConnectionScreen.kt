package com.example.saransk.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.saransk.R
import com.example.saransk.ui.theme.Purple40
import com.example.saransk.ui.theme.SaranskTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor")
@Composable
fun NoConnection(modifier: Modifier = Modifier,navController : NavHostController = rememberNavController()) {
    Scaffold(topBar = {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Purple40
            ),
            title = {}
        )

    }) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 180.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.sad),
                contentDescription = "",
                modifier = Modifier.size(150.dp)
            )
            Text(text = "No", fontSize = 28.sp, modifier = Modifier.padding(top = 22.dp))
            Text(
                text = "internet connection ",
                fontSize = 28.sp,
                modifier = Modifier.padding(bottom = 340.dp)
            )
            Button(
                onClick = {},
                shape = RoundedCornerShape(11.dp),
                modifier = Modifier
                    .width(327.dp)
                    .height(56.dp)
            ) { Text(text = "Check again", fontSize = 21.sp) }
        }


    }
}

@Preview
@Composable
private fun NoConnectionPrev() {
    SaranskTheme { NoConnection(modifier = Modifier) }
}