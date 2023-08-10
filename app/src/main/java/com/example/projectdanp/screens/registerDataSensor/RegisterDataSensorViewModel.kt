package com.example.projectdanp.screens.registerDataSensor

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class RegisterDataSensorViewModel
@Inject constructor(

): ViewModel() {

    var fecha by mutableStateOf("")
    var presionSistolica by mutableStateOf("")
    var presionDiastolica by mutableStateOf("")
    var unidad by mutableStateOf("")
    var notas by mutableStateOf("")
    var data by mutableStateOf("")

    fun registrarData() {
        viewModelScope.launch(Dispatchers.IO){

        }
    }
    fun obtenerData() {
        viewModelScope.launch(Dispatchers.IO){

        }
    }
}