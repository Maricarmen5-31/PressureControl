package com.example.projectdanp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import com.example.projectdanp.datarepository.DataRepository
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.projectdanp.paging.DataViewModel
import com.example.projectdanp.screens.graphs.RootNavigationGraph
import com.example.projectdanp.ui.theme.PressureControlApp
import com.example.projectdanp.paging.DataViewModelFactory

class MainActivity : ComponentActivity() {
    private val viewModel: DataViewModel by viewModels { DataViewModelFactory(DataRepository(this)) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PressureControlApp(){
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    RootNavigationGraph(viewModel, navController = rememberNavController())
                }
            }
        }
    }
}