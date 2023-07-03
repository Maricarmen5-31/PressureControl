package com.example.projectdanp.screens

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maxkeppeker.sheets.core.models.base.rememberSheetState
import com.maxkeppeler.sheets.calendar.CalendarDialog
import com.maxkeppeler.sheets.calendar.models.CalendarSelection

@Composable
fun RegisterDataSensor() {

    val calendarState = rememberSheetState()

    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        val pulsoFrecuCard = remember {
            mutableStateOf("")
        }

        val nivelOxigenoSangre = remember {
            mutableStateOf("")
        }

        val peso = remember {
            mutableStateOf("")
        }

        val fecha = remember {
            mutableStateOf("")
        }

        CalendarDialog(
            state = calendarState,
            selection = CalendarSelection.Date { date ->
                fecha.value = "$date"
            }
        )

        Text(
            text = "Registro de Frecuencia Cardiaca",
            style = TextStyle(fontSize = 40.sp, fontFamily = FontFamily.Cursive)
        )

        Spacer(modifier = Modifier.height(30.dp))

        TextField(
            label = { Text(text = "Pulso de paciente") },
            value = pulsoFrecuCard.value,
            onValueChange = { pulsoFrecuCard.value = it }
        )

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            TextField(
                modifier = Modifier.width(174.dp),
                label = { Text(text = "Fecha Medición") },
                value = fecha.value,
                onValueChange = { fecha.value = it }
            )
            Button(
                onClick = { calendarState.show() },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .padding(15.dp, 0.dp, 0.dp, 0.dp)
                    .height(40.dp)
                    .width(90.dp)

            ) {
                Text(text = "Ver")
            }
        }
        Spacer(modifier = Modifier.height(15.dp))

        TextField(
            label = { Text(text = "Nivel Oxigeno en Sangre") },
            value = nivelOxigenoSangre.value,
            onValueChange = { nivelOxigenoSangre.value = it }
        )

        Spacer(modifier = Modifier.height(15.dp))

        TextField(
            label = { Text(text = "Peso del paciente") },
            value = peso.value,
            onValueChange = { peso.value = it }
        )

        Spacer(modifier = Modifier.height(30.dp))

        var show by rememberSaveable {
            mutableStateOf(false)
        }

        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(
                onClick = {
                    show = true
                },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(text = "Registrar data sensor")
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Box(modifier = Modifier.padding(40.dp, 0.dp, 40.dp, 0.dp)) {
            Button(
                onClick = {
                    show = true
                },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(text = "Obtener data sensor")
            }
        }

        DialogConfirm(show, {show = false}, { Log.i("accion", "click")})
    }
}

@Composable
fun DialogConfirm(
    show: Boolean,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    if(show) {
        AlertDialog(onDismissRequest = { onDismiss() },
            confirmButton = { TextButton(onClick = { onConfirm() }) {
                Text(text = "Aceptar")
            }},
            dismissButton = { TextButton(onClick = { onDismiss() }) {
                Text(text = "Cancelar")
            }},
            title = { Text(text = "CONFIRMACION DE REGISTRO") },
            text = { Text(text = "¿Estas seguro de registrar este dato del paciente?")})
    }
}