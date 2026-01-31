package com.example.saransk.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
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
import com.example.saransk.R
import com.example.saransk.ui.theme.Blue
import com.example.saransk.ui.theme.FredokaFamily
import com.example.saransk.ui.theme.Purple
import com.example.saransk.ui.theme.SaranskTheme
import com.example.saransk.ui.theme.darkGrey

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExcerciseAnimalsScreen(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = Modifier, containerColor = Color.White,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Guess the animal",
                        fontFamily = FredokaFamily,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Medium, color = Color.White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(Purple),
                navigationIcon = {
                    Icon(
                        painter = painterResource(R.drawable.ic_vector),
                        contentDescription = "", tint = Color.White, modifier= Modifier.padding(start = 20.dp, end = 20.dp)
                    )
                })
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(R.drawable.pay_main1),
                contentDescription = "",
                modifier = Modifier
                    .padding(top = 15.dp)
                    .size(328.dp)
            )
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Write who is on image",
                    fontWeight = FontWeight.Medium,
                    fontSize = 17.sp,
                    fontFamily = FredokaFamily,
                    modifier = Modifier.padding(top = 15.dp, bottom = 15.dp, start = 37.dp)
                )
            }
            val text = remember { mutableStateOf("") }
            OutlinedTextField(
                value = text.value,
                onValueChange = { text.value = it },
                modifier = Modifier
                    .width(327.dp)
                    .padding(bottom = 20.dp),
                label = { Text(text = "", color = darkGrey) },
                shape = RoundedCornerShape(18), colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = Color.LightGray.copy(alpha = 0.3f),
                    unfocusedContainerColor = Color.LightGray.copy(alpha = 0.3f),
                    unfocusedBorderColor = Color.LightGray.copy(alpha = 0.3f),
                    focusedBorderColor = Color.LightGray
                )
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Blue),
                modifier = Modifier
                    .width(327.dp)
                    .height(56.dp),
                shape = RoundedCornerShape(13.dp)
            ) {
                Text(
                    "Check",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = FredokaFamily
                )

            }
        }
    }

}

@Preview
@Composable
private fun Ex1() {
    SaranskTheme { ExcerciseAnimalsScreen(modifier = Modifier) }
}