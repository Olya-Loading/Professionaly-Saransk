package com.example.saransk.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.saransk.ui.theme.Blue
import com.example.saransk.ui.theme.FredokaFamily
import com.example.saransk.ui.theme.Orange
import com.example.saransk.ui.theme.Orange_2
import com.example.saransk.ui.theme.Purple
import com.example.saransk.ui.theme.SaranskTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LanguageSelectScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(Purple),
                title = {
                    Text(
                        modifier = Modifier.padding(start = 90.dp),
                        text = "Language select",
                        fontSize = 22.sp,
                        fontFamily = FredokaFamily,
                        fontWeight = FontWeight.Medium, color = Color.White
                    )
                })
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 80.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "What is your Mother language?",
                fontSize = 22.sp,
                fontFamily = FredokaFamily,
                fontWeight = FontWeight.Medium, modifier = Modifier.padding(bottom = 20.dp)
            )

            Button(
                onClick = {},
                modifier = Modifier
                    .padding(bottom = 20.dp)
                    .width(327.dp)
                    .height(67.dp),
                colors = ButtonDefaults.buttonColors(
                    Orange
                ), shape = RoundedCornerShape(20.dp)
            ) {

                Text(
                    text = "Russian",
                    modifier = Modifier,
                    textAlign = TextAlign.Start,
                    color = Color.Black,
                    fontSize = 22.sp,
                    fontFamily = FredokaFamily,
                    fontWeight = FontWeight.Medium
                )
            }

            Button(
                onClick = {},
                modifier = Modifier
                    .padding(bottom = 20.dp)
                    .width(327.dp)
                    .height(67.dp),
                colors = ButtonDefaults.buttonColors(
                    Orange_2
                ),
                shape = RoundedCornerShape(18.dp)
            ) {

                Text(
                    text = "English",
                    modifier = Modifier,
                    textAlign = TextAlign.Start,
                    color = Color.Black,
                    fontSize = 22.sp,
                    fontFamily = FredokaFamily,
                    fontWeight = FontWeight.Medium
                )
            }
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(bottom = 20.dp)
                    .width(327.dp)
                    .height(67.dp),
                colors = ButtonDefaults.buttonColors(
                    Orange_2
                ),
                shape = RoundedCornerShape(18.dp)
            ) {

                Text(
                    text = "Chinese",
                    modifier = Modifier,
                    textAlign = TextAlign.Start,
                    color = Color.Black,
                    fontSize = 22.sp,
                    fontFamily = FredokaFamily,
                    fontWeight = FontWeight.Medium
                )
            }
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(bottom = 20.dp)
                    .width(327.dp)
                    .height(67.dp),
                colors = ButtonDefaults.buttonColors(
                    Orange_2
                ),
                shape = RoundedCornerShape(18.dp)
            ) {

                Text(
                    text = "Belarus",
                    modifier = Modifier,
                    textAlign = TextAlign.Start,
                    color = Color.Black,
                    fontSize = 22.sp,
                    fontFamily = FredokaFamily,
                    fontWeight = FontWeight.Medium
                )
            }

            Button(
                onClick = {},
                modifier = Modifier
                    .padding(bottom = 220.dp)
                    .width(327.dp)
                    .height(67.dp),
                colors = ButtonDefaults.buttonColors(
                    Orange_2
                ),
                shape = RoundedCornerShape(18.dp)
            ) {

                Text(
                    text = "Kazakh",
                    modifier = Modifier,
                    textAlign = TextAlign.Start,
                    color = Color.Black,
                    fontSize = 22.sp,
                    fontFamily = FredokaFamily,
                    fontWeight = FontWeight.Medium
                )
            }
            Button(
                onClick = {},
                modifier = Modifier

                    .width(327.dp)
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(
                    Blue
                ),
                shape = RoundedCornerShape(14.dp)
            ) {

                Text(
                    text = "Choose",
                    modifier = Modifier,
                    textAlign = TextAlign.Start,
                    color = Color.White,
                    fontSize = 22.sp,
                    fontFamily = FredokaFamily,
                    fontWeight = FontWeight.Medium
                )
            }


        }
    }

}

@Preview
@Composable
private fun LanguageSelectScreenPrev() {
    SaranskTheme {
        LanguageSelectScreen(modifier = Modifier)
    }
}