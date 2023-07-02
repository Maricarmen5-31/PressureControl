package com.example.projectdanp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.projectdanp.graphs.RootNavigationGraph
import com.example.projectdanp.ui.theme.NestedNavigationBottomBarDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NestedNavigationBottomBarDemoTheme {
                RootNavigationGraph(navController = rememberNavController())
            }
        }
    }
}