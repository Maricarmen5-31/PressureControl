package com.example.projectdanp.mqtt

import org.eclipse.paho.client.mqttv3.MqttMessage
import java.nio.charset.StandardCharsets
import javax.inject.Inject


class MQTTClient
@Inject constructor(
    private val mqttClientProvider: MqttConnectionInterface
) {
    private val mqttClient = mqttClientProvider.provideMqttClient()

    fun isConnected (): Boolean{
        return mqttClient.isConnected
    }

    fun publish(topic: String, message: String) {
        val mqttMessage = MqttMessage(message.toByteArray())
        mqttClient.publish(topic, mqttMessage)
    }

    fun disconnect() {
        mqttClient.disconnect()
    }

    fun subscribe(topic: String, qos: Int, onDataReceived: (String) -> Unit) {
        mqttClient.subscribe(topic, qos) { _, message ->
            val data = message.payload.toString(StandardCharsets.UTF_8)
            onDataReceived(data)
        }
    }

    fun unsubscribe(topic: String) {
        mqttClient.unsubscribe(topic)
    }
}