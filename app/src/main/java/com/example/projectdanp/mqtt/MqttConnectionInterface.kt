package com.example.projectdanp.mqtt

import org.eclipse.paho.client.mqttv3.MqttClient

interface MqttConnectionInterface {
    fun provideMqttClient(): MqttClient
}