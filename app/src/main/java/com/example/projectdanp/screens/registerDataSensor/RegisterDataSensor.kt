package com.example.projectdanp.screens.registerDataSensor

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.projectdanp.R
import com.maxkeppeker.sheets.core.models.base.rememberSheetState
import com.maxkeppeler.sheets.calendar.CalendarDialog
import com.maxkeppeler.sheets.calendar.models.CalendarSelection

@Composable
fun RegisterDataSensor(
    viewModel: RegisterDataSensorViewModel = hiltViewModel()
) {

    val calendarState = rememberSheetState()

    Column(
        modifier = Modifier
            .padding(20.dp)
            .background(color = Color(0xFFE9EEE9)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        CalendarDialog(
            state = calendarState,
            selection = CalendarSelection.Date { date ->
                viewModel.fecha = "$date"
            }
        )

        Text(
            text = "Presión Arterial",
            color = colorResource(id = R.color.green2),
            style = TextStyle(fontSize = 40.sp, fontFamily = FontFamily.Cursive)
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            label = { Text(text = "Presión Sistólica") },
            value = viewModel.presionSistolica,
            onValueChange = { viewModel.presionSistolica = it },
        )

        Spacer(modifier = Modifier.height(15.dp))

        TextField(
            label = { Text(text = "Presión Diastólica") },
            value = viewModel.presionDiastolica,
            onValueChange = { viewModel.presionDiastolica = it }
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
                value = viewModel.fecha,
                onValueChange = { viewModel.fecha = it }
            )
            Button(
                onClick = { calendarState.show() },
                shape = RoundedCornerShape(50.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(id = R.color.green),
                    contentColor = Color.White),
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
            label = { Text(text = "Undad de medida") },
            value = viewModel.unidad,
            onValueChange = { viewModel.unidad = it }
        )

        Spacer(modifier = Modifier.height(15.dp))

        TextField(
            label = { Text(text = "Notas") },
            value = viewModel.notas,
            onValueChange = { viewModel.notas = it }
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
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(id = R.color.green),
                    contentColor = Color.White),
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
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = colorResource(id = R.color.green),
                    contentColor = Color.White),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(text = "Obtener data sensor")
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Text(viewModel.data)

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
            confirmButton = { TextButton(onClick = { onDismiss() }) {
                Text(text = "Aceptar")
            }},
            dismissButton = { TextButton(onClick = { onDismiss() }) {
                Text(text = "Cancelar")
            }},
            title = { Text(text = "CONFIRMACION DE REGISTRO") },
            text = { Text(text = "¿Estas seguro de registrar este dato del paciente?")})
    }
}