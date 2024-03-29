package com.example.projectdanp.screens.authentication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectdanp.R
import com.example.projectdanp.screens.graphs.Graph
import com.example.projectdanp.ui.theme.Purple500

@Composable
fun LoginContent(
    onClick: () -> Unit,
    onSignUpClick: () -> Unit,
    onForgotClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFE9EEE9)),
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
            color = colorResource(id = R.color.green2),
            style = TextStyle(fontSize = 60.sp, fontFamily = FontFamily.Cursive)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Image(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp),
            painter = painterResource(id = R.drawable.logo),
            contentDescription="Logo")

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Inicio de Sesión",
            color = colorResource(id = R.color.green2),
            style = TextStyle(fontSize = 40.sp, fontFamily = FontFamily.Serif)
        )

        Spacer(modifier = Modifier.height(40.dp))

        TextField(
            label = {
                Text(
                    text = "Username",
                    color = colorResource(id = R.color.green2))},
            value = username.value,
            onValueChange = { username.value = it }
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            label = { Text(
                text = "Password",
                color = colorResource(id = R.color.green2))},
            value = password.value,
            onValueChange = { password.value = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Box(modifier = Modifier.padding(90.dp, 0.dp, 90.dp, 0.dp)) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(50.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(id = R.color.green),
                    contentColor = Color.White),
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

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            modifier = Modifier.clickable { onSignUpClick() },
            text = "Sign Up",
            fontSize = MaterialTheme.typography.body1.fontSize,
            textDecoration = TextDecoration.Underline,
            color = colorResource(id = R.color.green2),
            fontFamily = FontFamily.Default
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            modifier = Modifier.clickable { onForgotClick() },
            text = "Forgot Password",
            fontSize = MaterialTheme.typography.body1.fontSize,
            textDecoration = TextDecoration.Underline,
            color = colorResource(id = R.color.green2),
            fontFamily = FontFamily.Default
        )
    }
}