package com.example.presentation.login

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun LoginNavHost() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = LoginRoute.WelcomeScreen.name
    ) {
        composable(route = LoginRoute.WelcomeScreen.name) {
            WelcomeScreen(
                onNavigateToLoginScreen = {
                    navController.navigate(route = LoginRoute.LoginScreen.name)
                }
            )
        }

        composable(route = LoginRoute.LoginScreen.name) {
            LoginScreen(
                id = "phasellus",
                password = "primis",
                onIdChange = {},
                onPasswordChange = {},
                onNavigateToSignUpScreen = {})
        }

        composable(route = LoginRoute.SignUpScreen.name) {
            SignUpScreen(
                id = "dapibus",
                username = "Harriett Hart",
                password1 = "cetero",
                password2 = "sociis",
                onIdChange = {},
                onUsernameChange = {},
                onPassword1Change = {},
                onPassword2Change = {},
                onSignUpClick = {})
        }
    }
}