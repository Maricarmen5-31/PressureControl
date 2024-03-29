package com.example.projectdanp.screens.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.projectdanp.screens.home.HomeScreen
import com.example.projectdanp.paging.DataViewModel
import com.example.projectdanp.screens.authentication.ForgotPassword
import com.example.projectdanp.screens.authentication.SignUpScreen
import com.example.projectdanp.screens.registerDataSensor.RegisterDataSensorViewModel

@Composable
fun RootNavigationGraph(
    viewModel: DataViewModel,
    registerDataSensorViewModel: RegisterDataSensorViewModel,
    navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTHENTICATION
    ) {
        authNavGraph(navController = navController)
        composable(route = Graph.HOME) {
            HomeScreen(viewModel, registerDataSensorViewModel)
        }
        composable(route = Graph.SIGNUP) {
            SignUpScreen(navController = navController)
        }
        composable(route = Graph.FORGOT) {
            ForgotPassword(navController = navController)
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val AUTHENTICATION = "auth_graph"
    const val HOME = "home_graph"
    const val DETAILS = "details_graph"
    const val LIST = "list_datos"
    const val SIGNUP = "signup_graph"
    const val FORGOT = "forgot_graph"
}