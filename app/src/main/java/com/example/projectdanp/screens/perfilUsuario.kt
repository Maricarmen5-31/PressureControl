package com.example.projectdanp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedButton
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectdanp.R

@Composable
fun perfilUsuario() {
    LazyColumn(){
        item {
            Column(
                modifier= Modifier
                    .fillMaxSize()
                    .width(360.dp)
                    .height(800.dp)
                    .background(color = Color(0xFFE9EEE9)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Perfil",
                    style = TextStyle(
                        fontSize = 20.sp,
                        //fontFamily = FontFamily(Font(R.font.poppins)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                        textAlign = TextAlign.Center,)
                )
                Image(
                    modifier = Modifier
                        .border(
                            width = 5.dp,
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 117.dp)
                        )
                        .width(117.dp)
                        .height(113.dp)
                        .background(color = Color(0xFFC4C4C4),
                            shape = RoundedCornerShape(size = 117.dp)
                        ),
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription="Logo")

                Text(
                    text = "Nombre",
                    style = TextStyle(
                        fontSize = 14.sp,
                        //fontFamily = FontFamily(Font(R.font.poppins)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    )
                )
                Text ("Juan Carlos2",
                    style = TextStyle(
                        fontSize = 18.sp,
                        color= Color(0xFF1F1C1C),
                        letterSpacing = 1.4.sp
                    ),
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 10.dp)//margin
                        .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
                        .padding(30.dp, 5.dp, 0.dp, 0.dp)
                        .width(282.dp)
                        .height(37.dp)

                )

                Text(
                    text = "Apellido",
                    style = TextStyle(
                        fontSize = 14.sp,
                        //fontFamily = FontFamily(Font(R.font.poppins)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    )
                )
                Text ("Solis Valdez",
                    style = TextStyle(
                        fontSize = 18.sp,
                        color= Color(0xFF1F1C1C),
                        letterSpacing = 1.4.sp
                    ),
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 10.dp)//margin
                        .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
                        .padding(30.dp, 5.dp, 0.dp, 0.dp)
                        .width(282.dp)
                        .height(37.dp)

                )

                Text(
                    text = "fecha de nacimiento",
                    style = TextStyle(
                        fontSize = 14.sp,
                        //fontFamily = FontFamily(Font(R.font.poppins)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    )
                )
                Text ("19/05/00 \t\t\t\t\t\t\t 22 años",
                    style = TextStyle(
                        fontSize = 18.sp,
                        color= Color(0xFF1F1C1C),
                        letterSpacing = 1.4.sp
                    ),
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 10.dp)//margin
                        .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
                        .padding(30.dp, 5.dp, 0.dp, 0.dp)
                        .width(282.dp)
                        .height(37.dp)

                )


                // We have two radio buttons and only one can be selected
                var state by remember { mutableStateOf(true) }
// Note that Modifier.selectableGroup() is essential to ensure correct accessibility behavior
                Row(Modifier.selectableGroup()) {
                    RadioButton(
                        selected = state,
                        onClick = { state = false }
                    )
                    RadioButton(
                        selected = !state,
                        onClick = { state = false }
                    )
                }
                Text(
                    text = "Peso",
                    style = TextStyle(
                        fontSize = 14.sp,
                        //fontFamily = FontFamily(Font(R.font.poppins)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    )
                )
                Text ("70.4 \t\t\t\t\t\t\t\t\t\t kg",
                    style = TextStyle(
                        fontSize = 18.sp,
                        color= Color(0xFF1F1C1C),
                        letterSpacing = 1.4.sp
                    ),
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 10.dp)//margin
                        .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
                        .padding(30.dp, 5.dp, 0.dp, 0.dp)
                        .width(282.dp)
                        .height(37.dp)
                )
                Text(
                    text = "Altura",
                    style = TextStyle(
                        fontSize = 14.sp,
                        //fontFamily = FontFamily(Font(R.font.poppins)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    )
                )
                Text ("160 \t\t\t\t\t\t\t\t\t\t centimetros",
                    style = TextStyle(
                        fontSize = 18.sp,
                        color= Color(0xFF1F1C1C),
                        letterSpacing = 1.4.sp
                    ),
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 10.dp)//margin
                        .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
                        .padding(30.dp, 5.dp, 0.dp, 0.dp)
                        .width(282.dp)
                        .height(37.dp)
                )
                Text(
                    text = "Peso",
                    style = TextStyle(
                        fontSize = 14.sp,
                        //fontFamily = FontFamily(Font(R.font.poppins)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    )
                )
                Text ("70.4 \t\t\t\t\t\t\t\t\t\t kg",
                    style = TextStyle(
                        fontSize = 18.sp,
                        color= Color(0xFF1F1C1C),
                        letterSpacing = 1.4.sp
                    ),
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 10.dp)//margin
                        .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 100.dp))
                        .padding(30.dp, 5.dp, 0.dp, 0.dp)
                        .width(282.dp)
                        .height(37.dp)
                )
                Text("IMC \t\t\t\t\t\t\t\t\t\t 27.5 kgs/m2",
                    style= TextStyle(
                        fontSize = 14.sp,
                        //fontFamily = FontFamily(Font(R.font.poppins)),
                        fontWeight = FontWeight(275),
                        color = Color(0xFF1F1C1C),
                        letterSpacing = 1.4.sp,),
                    modifier= Modifier
                        .padding(bottom = 1.dp)
                        .width(282.dp)
                        .height(29.dp)
                        .background(color = Color(0x141D1B1B))
                        .padding(10.dp, 5.dp, 0.dp, 0.dp)

                )
                OutlinedButton(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxSize()

                        .wrapContentSize(Alignment.Center)
                ) {
                    Text("Actualizar",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        style= TextStyle(
                            fontSize = 14.sp,
                            //fontFamily = FontFamily(Font(R.font.poppins)),
                            fontWeight = FontWeight(275),
                            color = Color(0xFF1F1C1C),
                            letterSpacing = 1.4.sp),

                        modifier= Modifier
                            //.padding(top = 10.dp, bottom = 10.dp)//margin

                            .background(color = Color(0xC2F0CE), shape = RoundedCornerShape(size = 100.dp))
                            .width(282.dp)
                            .height(29.dp)
                            .background(color = Color(0xC2F0CE)))
                }

            }

        }

    }
}