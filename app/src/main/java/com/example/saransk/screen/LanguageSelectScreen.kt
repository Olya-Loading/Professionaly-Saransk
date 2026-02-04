package com.example.saransk.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.saransk.ui.theme.Blue
import com.example.saransk.ui.theme.FredokaFamily
import com.example.saransk.ui.theme.Orange
import com.example.saransk.ui.theme.Orange_2
import com.example.saransk.ui.theme.Purple
import com.example.saransk.ui.theme.SaranskTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "RememberReturnType")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LanguageSelectScreen(modifier: Modifier = Modifier,navController : NavHostController = rememberNavController()) {
    val selectedIndex = remember { mutableIntStateOf(0) }
    val languages = listOf(
        "Russian", "English", "Chinese", "Belarus", "Kazakh"
    )


    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(Purple),
                title = {
                    Text(
                        modifier = Modifier.padding(start = 90.dp),
                        text = "Language select",
                        fontSize = 19.sp,
                        fontFamily = FredokaFamily,
                        fontWeight = FontWeight.Medium, color = Color.White
                    )
                })
        },
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding), horizontalAlignment = Alignment.CenterHorizontally){
            Text(
                text = "What is your Mother language?",
                fontSize = 22.sp,
                fontFamily = FredokaFamily,
                fontWeight = FontWeight.Medium, modifier = Modifier.padding(bottom = 20.dp, top = 15.dp)
            )



        LazyColumn(
            modifier = Modifier
                .fillMaxWidth().height(550.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(languages) { item ->
                val currentIndex = languages.indexOf(item)
                Button(
                    onClick = {
                        if (item == "Russian" || item == "English") selectedIndex.value =
                            currentIndex
                    },
                    modifier = Modifier
                        .padding(bottom = 20.dp)
                        .width(327.dp)
                        .height(57.dp),
                    colors = ButtonDefaults.buttonColors(if (currentIndex == selectedIndex.value) Orange else Orange_2),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Text(
                        text = item,
                        modifier = Modifier.fillMaxWidth(),

                        color = Color.Black,
                        fontSize = 22.sp,
                        fontFamily = FredokaFamily,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
        }
        Button(
            colors = ButtonDefaults.buttonColors(Blue),
            onClick = {},
            shape = RoundedCornerShape(11.dp),
            modifier = Modifier.padding(top = 90.dp)
                .width(327.dp)
                .height(56.dp)
        ) { Text(text = "Choose", fontSize = 21.sp) }
    }}
}

@Preview
@Composable
private fun LanguageSelectScreenPrev() {
    SaranskTheme {
        LanguageSelectScreen(modifier = Modifier)
    }
}