package com.example.saransk.screen
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

sealed class Destinations(val route: String){
    data object LanguageSelectScreen: Destinations("language")
    data object LoginScreen: Destinations("login")
    data object OnBoardingScreen1: Destinations("on_boarding1")
    data object OnBoardingScreen2: Destinations("on_boarding2")
    data object OnBoardingScreen3: Destinations("on_boarding3")
    data object ProfileScreen: Destinations("profile")
    data object SignUpScreen: Destinations("sign_up1")
    data object SignUp2Screen: Destinations("sign_up2")
    data object SplashScreen: Destinations("splash")
    data object MainScreen: Destinations("main")
}

@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = Destinations.SplashScreen.route,
        modifier = modifier

    ) {
        composable(Destinations.SplashScreen.route) {
            SplashScreen(modifier = Modifier,navController)
        }
        composable(Destinations.LanguageSelectScreen.route) {
            LanguageSelectScreen(modifier = Modifier, navController)
        }
        composable(Destinations.ProfileScreen.route) {
            ProfileScreen(modifier = modifier,navController)
        }
        composable(Destinations.OnBoardingScreen1.route) {
            OnBoardingScreen1(modifier= Modifier,navController)
        }
        composable(Destinations.OnBoardingScreen2.route) {
            OnBoardingScreen2(modifier= Modifier,navController)
        }
        composable(Destinations.OnBoardingScreen3.route) {
            OnBoardingScreen3(modifier= Modifier,navController)
        }
        composable(Destinations.SignUpScreen.route) {
            SignUpScreen(modifier = Modifier, navController)
        }
        composable(Destinations.SignUp2Screen.route) {
            SignUp2Screen(modifier = Modifier, navController)
        }
        composable(Destinations.LoginScreen.route) {
            LoginScreen(modifier = Modifier, navController)
        }
        composable(Destinations.MainScreen.route) {
            MainScreen(modifier = Modifier)
        }
    }
}