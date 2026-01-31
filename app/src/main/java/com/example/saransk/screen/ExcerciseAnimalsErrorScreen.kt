package com.example.saransk.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
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
import com.example.saransk.ui.theme.Green
import com.example.saransk.ui.theme.Red
import com.example.saransk.ui.theme.SaranskTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExcerciseAnimalsScreenError(modifier: Modifier = Modifier) {

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
                    colors = TopAppBarDefaults.topAppBarColors(Red),
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
                    painter = painterResource(R.drawable.cat),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(top = 65.dp)
                        .size(160.dp)
                )
                Text(
                    text = "Eh? Wrong answer :("
                            ,
                    fontWeight = FontWeight.Medium,
                    fontSize = 20.sp,
                    fontFamily = FredokaFamily,
                    modifier = Modifier.padding(top = 45.dp)
                )
                Text(
                    text ="That is: Racoon",
                    fontWeight = FontWeight.Medium,
                    fontSize = 20.sp,
                    fontFamily = FredokaFamily,
                    modifier = Modifier.padding( bottom = 25.dp)
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Blue),
                    modifier = Modifier.padding(bottom =15.dp)
                        .width(327.dp)
                        .height(56.dp),
                    shape = RoundedCornerShape(13.dp)
                ) {
                    Text(
                        "Next",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FredokaFamily
                    )

                }
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Blue),
                    modifier = Modifier
                        .width(327.dp)
                        .height(56.dp),
                    shape = RoundedCornerShape(13.dp)
                ) {
                    Text(
                        "Try again",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FredokaFamily
                    )

                }
            }}}

@Preview
@Composable
private fun AnimalError() {
    SaranskTheme { ExcerciseAnimalsScreenError(modifier = Modifier    ) }
}
