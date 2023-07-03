package com.example.projectdanp.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectdanp.screens.graphs.Graph
import com.example.projectdanp.ui.theme.Purple500

@Composable
fun LoginContent(
    onClick: () -> Unit,
    onSignUpClick: () -> Unit,
    onForgotClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val username = remember {
            mutableStateOf(TextFieldValue())
        }
        val password = remember {
            mutableStateOf(TextFieldValue())
        }

        Text(
            text = "PressureControl",
            style = TextStyle(fontSize = 60.sp, fontFamily = FontFamily.Cursive)
        )

        Spacer(modifier = Modifier.height(100.dp))

        Text(
            text = "Inicio de Sesión",
            style = TextStyle(fontSize = 40.sp, fontFamily = FontFamily.Serif)
        )

        Spacer(modifier = Modifier.height(40.dp))

        TextField(
            label = { Text(text = "Username") },
            value = username.value,
            onValueChange = { username.value = it }
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            label = { Text(text = "Password") },
            value = password.value,
            onValueChange = { password.value = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Box(modifier = Modifier.padding(90.dp, 0.dp, 90.dp, 0.dp)) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(modifier = Modifier.clickable { onClick() },
                    text = "INICIAR SESION",
                    fontSize = MaterialTheme.typography.body1.fontSize,
                )
            }
            /*Text(
                modifier = Modifier.clickable { onClick() },
                text = "Login",
                fontSize = MaterialTheme.typography.h2.fontSize,
                fontFamily = FontFamily.Default
            )*/
        }

        Spacer(modifier = Modifier.height(100.dp))

        Text(
            modifier = Modifier.clickable { onSignUpClick() },
            text = "Sign Up",
            fontSize = MaterialTheme.typography.body1.fontSize,
            textDecoration = TextDecoration.Underline,
            color = Purple500,
            fontFamily = FontFamily.Default
        )

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            modifier = Modifier.clickable { onForgotClick() },
            text = "Forgot Password",
            fontSize = MaterialTheme.typography.body1.fontSize,
            textDecoration = TextDecoration.Underline,
            color = Purple500,
            fontFamily = FontFamily.Default
        )
    }
}