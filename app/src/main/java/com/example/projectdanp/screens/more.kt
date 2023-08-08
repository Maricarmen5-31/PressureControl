package com.example.projectdanp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectdanp.R

@Composable

fun more() {
    LazyColumn(){
        item{
            Column(
                modifier= Modifier
                    .fillMaxSize()
                    .background(color = Color(0xFFE9EEE9))
                    .height(800.dp),
            ){
                Text(text = "Más",
                    modifier = Modifier
                        .padding(top=50.dp, bottom = 20.dp)
                        .fillMaxWidth(),
                    style = TextStyle(
                        fontSize = 25.sp,
                        //fontFamily = FontFamily(Font(R.font.poppins)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                        textAlign = TextAlign.Center)
                )
                Row(){
                    Image(
                        modifier= Modifier
                            .padding(start = 15.dp, top = 10.dp, end = 30.dp, bottom = 20.dp)
                            .border(width = 5.dp, color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 70.dp))
                            .width(100.dp)
                            .height(100.dp)
                            .background(color = Color(0xFFC4C4C4), shape = RoundedCornerShape(size = 70.dp)),
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "image description",
                        contentScale = ContentScale.FillBounds
                    )
                    Text(
                        text = "Juan Solis",
                        modifier = Modifier
                            .padding(start = 20.dp, top = 30.dp)
                            .width(200.dp)
                            .height(60.dp),
                        style = TextStyle(
                            fontSize = 25.sp,
                            //fontFamily = FontFamily(Font(R.font.poppins)),
                            fontWeight = FontWeight(275),
                            color = Color(0xFF1F1C1C),
                            letterSpacing = 1.0.sp,
                        )
                    )
                }
                Text(text="Informacion",
                    modifier= Modifier
                        .fillMaxWidth()
                        .height(40.dp)
                        .background(color = Color(0xFFF6F6F6))
                        .padding(start = 10.dp, top = 10.dp),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),

                    )

                Row(modifier = Modifier.clickable { }
                    .padding(top = 10.dp, bottom = 10.dp)){
                    Image(
                        modifier= Modifier
                            .padding(start = 5.dp,end=8.dp)
                            .width(21.dp)
                            .height(21.dp),
                        painter = painterResource(id = R.drawable.icon_heart),
                        contentDescription = "image description",
                        contentScale = ContentScale.None
                    )
                    Text(
                        modifier= Modifier
                            .width(300.dp)
                            .height(30.dp),
                        text = "Consejos para bajar BP",
                        style = TextStyle(
                            fontSize = 18.sp,
                            //fontFamily = FontFamily(Font(R.font.poppins)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF000000),
                        )
                    )
                    Image(
                        modifier= Modifier
                            .padding(start=5.dp)
                            .width(20.dp)
                            .height(20.dp),
                        painter = painterResource(id = R.drawable.redic_recomendaciones),
                        contentDescription = "image description",
                        contentScale = ContentScale.None
                    )
                }
                Row(modifier = Modifier.clickable { }
                    .padding(top = 10.dp, bottom = 10.dp)){
                    Text(
                        modifier = Modifier
                            .padding(start = 5.dp)
                            .width(330.dp)
                            .height(30.dp),
                        text = "Valores límite",
                        style = TextStyle(
                            fontSize = 18.sp,
                            //fontFamily = FontFamily(Font(R.font.poppins)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF000000),
                        )
                    )
                    Image(
                        modifier= Modifier
                            .padding(0.dp)
                            .width(20.dp)
                            .height(20.dp),
                        painter = painterResource(id = R.drawable.redic_recomendaciones),
                        contentDescription = "image description",
                        contentScale = ContentScale.None
                    )
                }
                Row(modifier = Modifier.clickable { }
                    .padding(top = 10.dp, bottom = 10.dp)){
                    Text(
                        modifier = Modifier
                            .padding(start = 5.dp)
                            .width(330.dp)
                            .height(30.dp),
                        text = "Acerca de ",
                        style = TextStyle(
                            fontSize = 18.sp,
                            //fontFamily = FontFamily(Font(R.font.poppins)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF000000),
                        )
                    )
                    Image(
                        modifier= Modifier
                            .padding(0.dp)
                            .width(20.dp)
                            .height(20.dp),
                        painter = painterResource(id = R.drawable.redic_recomendaciones),
                        contentDescription = "image description",
                        contentScale = ContentScale.None
                    )
                }
                Row(modifier = Modifier.clickable { }
                    .padding(top = 10.dp, bottom = 10.dp)){
                    Text(
                        modifier = Modifier
                            .padding(start = 5.dp)
                            .width(330.dp)
                            .height(30.dp),
                        text = "Ayuda",
                        style = TextStyle(
                            fontSize = 18.sp,
                            //fontFamily = FontFamily(Font(R.font.poppins)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF000000),
                        )
                    )
                    Image(
                        modifier= Modifier
                            .padding(0.dp)
                            .width(20.dp)
                            .height(20.dp),
                        painter = painterResource(id = R.drawable.redic_recomendaciones),
                        contentDescription = "image description",
                        contentScale = ContentScale.None
                    )
                }

                Text(text="Setting",
                    modifier= Modifier
                        .fillMaxWidth()
                        .height(40.dp)
                        .background(color = Color(0xFFF6F6F6))
                        .padding(start = 10.dp, top = 10.dp),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),

                    )

                Row(modifier = Modifier.clickable { }
                    .padding(top = 10.dp, bottom = 10.dp)){
                    Text(
                        modifier = Modifier
                            .padding(start = 5.dp)
                            .width(330.dp)
                            .height(30.dp),
                        text = "Eliminar mi",
                        style = TextStyle(
                            fontSize = 18.sp,
                            //fontFamily = FontFamily(Font(R.font.poppins)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF000000),
                        )
                    )
                    Image(
                        modifier= Modifier
                            .padding(0.dp)
                            .width(20.dp)
                            .height(20.dp),
                        painter = painterResource(id = R.drawable.redic_recomendaciones),
                        contentDescription = "image description",
                        contentScale = ContentScale.None
                    )
                }

                Row(modifier = Modifier.clickable { }
                    .padding(top = 10.dp, bottom = 10.dp)){
                    Image(
                        modifier= Modifier
                            .padding(start = 5.dp,end=8.dp)
                            .width(21.dp)
                            .height(21.dp),
                        painter = painterResource(id = R.drawable.translate),
                        contentDescription = "image description",
                        contentScale = ContentScale.None
                    )
                    Text(
                        modifier= Modifier
                            .width(300.dp)
                            .height(30.dp),
                        text = "Consejos para bajar BP",
                        style = TextStyle(
                            fontSize = 18.sp,
                            //fontFamily = FontFamily(Font(R.font.poppins)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF000000),
                        )
                    )
                    Image(
                        modifier= Modifier
                            .padding(start=5.dp)
                            .width(20.dp)
                            .height(20.dp),
                        painter = painterResource(id = R.drawable.redic_recomendaciones),
                        contentDescription = "image description",
                        contentScale = ContentScale.None
                    )
                }

                Row(modifier = Modifier.clickable { }
                    .padding(top = 10.dp, bottom = 10.dp)){
                    Text(
                        modifier = Modifier
                            .padding(start = 5.dp)
                            .width(330.dp)
                            .height(30.dp),
                        text = "Cambiar contraseña",
                        style = TextStyle(
                            fontSize = 18.sp,
                            //fontFamily = FontFamily(Font(R.font.poppins)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF000000),
                        )
                    )
                    Image(
                        modifier= Modifier
                            .padding(0.dp)
                            .width(20.dp)
                            .height(20.dp),
                        painter = painterResource(id = R.drawable.redic_recomendaciones),
                        contentDescription = "image description",
                        contentScale = ContentScale.None
                    )
                }

            }

        }
    }
}