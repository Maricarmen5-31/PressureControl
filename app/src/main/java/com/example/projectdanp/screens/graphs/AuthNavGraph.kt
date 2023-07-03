package com.example.projectdanp.screens.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.projectdanp.screens.LoginContent
import com.example.projectdanp.screens.ScreenContent

fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            LoginContent(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(Graph.HOME)
                },
                onSignUpClick = {
                    navController.navigate(Graph.SIGNUP)
                },
                onForgotClick = {
                    navController.navigate(Graph.FORGOT)
                }
            )
        }
    }
}

sealed class AuthScreen(val route: String) {
    object Login : AuthScreen(route = "LOGIN")
    object SignUp : AuthScreen(route = "SIGN_UP")
    object Forgot : AuthScreen(route = "FORGOT")
}