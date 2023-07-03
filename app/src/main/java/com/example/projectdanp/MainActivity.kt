package com.example.projectdanp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.projectdanp.graphs.RootNavigationGraph
import com.example.projectdanp.ui.theme.NestedNavigationBottomBarDemoTheme
import com.example.projectdanp.MqttHandler

class MainActivity : ComponentActivity() {
    private val BROKER_URL = "ssl://a14yncwleucddp-ats.iot.us-east-2.amazonaws.com:8883"
    private val CLIENT_ID = "237065139024"
    private var mqttHandler = MqttHandler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NestedNavigationBottomBarDemoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    RootNavigationGraph(navController = rememberNavController())
                    //mqttHandler = MqttHandler()
                    mqttHandler.connect(BROKER_URL, CLIENT_ID)
                    //subscribeToTopic("esp8266/sub")
                    publishMessage("esp8266/sub", "Holaaa")

                }
            }
        }
    }

    override fun onDestroy() {
        mqttHandler.disconnect()
        super.onDestroy()
    }

    fun publishMessage(topic: String, message:String){
        Toast.makeText(this,"Publising message: $message", Toast.LENGTH_LONG).show()
        mqttHandler.publish(topic, message)
    }
    fun subscribeToTopic(topic: String){
        Toast.makeText(this,"Subscribing to topic: $topic", Toast.LENGTH_LONG).show()
        mqttHandler.subscribe(topic)
    }

}