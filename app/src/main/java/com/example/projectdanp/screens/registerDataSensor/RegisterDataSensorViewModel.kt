package com.example.projectdanp.screens.registerDataSensor

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.projectdanp.model.PresionArterial
import com.example.projectdanp.mqtt.MQTTClient
import com.example.projectdanp.mqtt.MqttConnection
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class RegisterDataSensorViewModel
@Inject constructor(
    //private val clientMQTT: MQTTClient
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
            /*if (clientMQTT.isConnected()) {
                clientMQTT.subscribe("esp8266/pub", 0) { data ->
                    val data = PresionArterial.fromJson(data)
                    if (data != null) {
                        //insertSensor(sensorDomain)
                    }
                }
            }*/
        }
    }
}