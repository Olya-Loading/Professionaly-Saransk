package com.example.saransk.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.saransk.R
import com.example.saransk.ui.theme.Blue
import com.example.saransk.ui.theme.FredokaFamily
import com.example.saransk.ui.theme.Grey
import com.example.saransk.ui.theme.Orange
import com.example.saransk.ui.theme.SaranskTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun OnBoardingScreen1(viewModel: ViewModel, navController : NavHostController = rememberNavController()) {
    Scaffold {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.illustrations_1),
                contentDescription = "",
                modifier = Modifier.padding(top = 140.dp)
                    .size(240.dp)

            )
            Spacer(modifier = Modifier.height(120.dp))
            val currentPage by viewModel.currentPage.collectAsState()
            val pagerState = rememberPagerState(
                initialPage = currentPage,
                pageCount = { 3 }
            )

            HorizontalPager(
                state = pagerState,
                modifier = Modifier.fillMaxWidth()
            ) {}
            Row(
                Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(pagerState.pageCount) { iteration ->
                    val color = if (pagerState.currentPage == iteration) Orange else Color.LightGray
                    Box(
                        modifier = Modifier
                            .padding(start = 6.dp)
                            .clip(CircleShape)
                            .background(color)
                            .size(8.dp)
                    )
                }
            }
            Text(
                text = "Confidence in your words",
                modifier = Modifier.padding(top = 30.dp),
                fontSize = 22.sp,
                fontFamily = FredokaFamily,
                fontWeight = FontWeight.Medium
            )
            Box(modifier = Modifier.width(263.dp), contentAlignment = Alignment.Center) {
                Text(
                    text = "With conversation-based learning, you'll be talking from lesson one",
                    modifier = Modifier.padding(top = 10.dp, bottom = 50.dp),color = Grey,
                    fontSize = 15.sp,
                    fontFamily = FredokaFamily,
                    fontWeight = FontWeight.Light
                )
            }


            Button(
                onClick = {},
                shape = RoundedCornerShape(11.dp),
                modifier = Modifier
                    .width(327.dp)
                    .height(56.dp), colors = ButtonDefaults.buttonColors(Blue)
            ) {
                Text(
                    text = "Next",
                    fontSize = 21.sp,
                    fontFamily = FredokaFamily,
                    fontWeight = FontWeight.Medium
                )
            }
            Text(
                text = "Skip onboarding",
                modifier = Modifier.padding(top = 22.dp),
                fontSize = 15.sp,
                fontFamily = FredokaFamily,
                fontWeight = FontWeight.Light
            )
        }
    }

}

@Preview
@Composable
private fun OnB1() {
    SaranskTheme {
        OnBoardingScreen1(modifier = Modifier)
    }
}