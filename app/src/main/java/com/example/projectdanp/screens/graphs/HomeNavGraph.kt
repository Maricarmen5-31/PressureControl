package com.example.projectdanp.screens.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.projectdanp.BottomBarScreen
import com.example.projectdanp.paging.DataViewModel
import com.example.projectdanp.screens.*
import com.example.projectdanp.screens.history.ListScreen
import com.example.projectdanp.screens.registerDataSensor.RegisterDataSensor
import com.example.projectdanp.screens.registerDataSensor.RegisterDataSensorViewModel

@Composable
fun HomeNavGraph(
    viewModel: DataViewModel,
    registerDataSensorViewModel: RegisterDataSensorViewModel,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            RegisterDataSensor(registerDataSensorViewModel)
        }
        composable(route = BottomBarScreen.List.route) {
            ListScreen(viewModel)
        }
        composable(route = BottomBarScreen.Profile.route) {
            perfilUsuario()
        }
        composable(route = BottomBarScreen.More.route) {
           more()
        }
        //detailsNavGraph(navController = navController)
    }
}



fun NavGraphBuilder.detailsNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.DETAILS,
        startDestination = DetailsScreen.Information.route
    ) {
        composable(route = DetailsScreen.Information.route) {
            ScreenContent(name = DetailsScreen.Information.route) {
                navController.navigate(DetailsScreen.Overview.route)
            }
        }
        composable(route = DetailsScreen.Overview.route) {
            ScreenContent(name = DetailsScreen.Overview.route) {
                navController.popBackStack(
                    route = DetailsScreen.Information.route,
                    inclusive = false
                )
            }
        }
    }
}

sealed class DetailsScreen(val route: String) {
    object Information : DetailsScreen(route = "INFORMATION")
    object Overview : DetailsScreen(route = "OVERVIEW")
}
