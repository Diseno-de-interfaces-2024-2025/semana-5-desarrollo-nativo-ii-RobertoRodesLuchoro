package com.example.ejercicio3.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun login(modifier : Modifier = Modifier)
{
    var colorText by remember { mutableStateOf(Color.Unspecified) }
    var resultText by remember { mutableStateOf("") }
    var user by remember { mutableStateOf("admin") }
    var pass by remember { mutableStateOf("1234") }
    var textCliente by remember { mutableStateOf("Nombre del Cliente...") }
    var textEmpleado by remember { mutableStateOf("Nombre del Empleado...") }
    var textFecha by remember { mutableStateOf("Fecha de la Orden...") }
    var textEstado by remember { mutableStateOf("Estado de la Orden...") }
    var textInputCliente by remember { mutableStateOf("") }
    var textInputEmpleado by remember { mutableStateOf("") }
    var textInputFecha by remember { mutableStateOf("") }
    var textInputEstado by remember { mutableStateOf("") }

    Box(
        Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column (horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(
                value = textInputCliente,
                onValueChange = {textInputCliente = it},
                label = { Text(textCliente) }
            )
            Spacer(Modifier.height(50.dp))
            OutlinedTextField(
                value = textInputEmpleado,
                onValueChange = {textInputEmpleado = it},
                label = { Text(textEmpleado) },
                maxLines = 1,
            )
            Spacer(Modifier.height(50.dp))
            OutlinedTextField(
                value = textInputFecha,
                onValueChange = {textInputFecha = it},
                label = { Text(textFecha) },
                maxLines = 1,
            )
            Spacer(Modifier.height(50.dp))
            OutlinedTextField(
                value = textInputEstado,
                onValueChange = {textInputEstado = it},
                label = { Text(textEstado) },
                maxLines = 1,
            )

            Spacer(Modifier.height(10.dp))
            Text(
                text= resultText,
                color= colorText
            )
            Spacer(Modifier.height(10.dp))
            Button(onClick = {
                if(textInputCliente == user && textInputEmpleado == pass)
                {
                    colorText = Color.Green
                    resultText = "Usuario Correcto"
                }
                else
                {
                    colorText = Color.Red
                    resultText = "Usuario Incorrecto"
                }
            }
            ){
                Text("Añadir Orden")
            }
        }
    }
}