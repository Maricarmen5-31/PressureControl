package com.example.projectdanp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        route = "HOME",
        title = "HOME",
        icon = Icons.Default.Home
    )

    object Profile : BottomBarScreen(
        route = "pantalla",
        title = "persona",
        icon = Icons.Default.Person
    )

    object More : BottomBarScreen(
        route = "MORE",
        title = "MORE",
        icon = Icons.Default.Settings
    )
}
