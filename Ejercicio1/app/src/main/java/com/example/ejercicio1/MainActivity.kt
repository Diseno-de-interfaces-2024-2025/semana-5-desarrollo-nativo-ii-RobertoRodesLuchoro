package com.example.ejercicio1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.ejercicio1.ui.theme.Ejercicio1Theme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio1Theme {
                Scaffold(
                    topBar = {
                        CenterAlignedTopAppBar(
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = Color(0xFFCDE7B0)
                            ),
                            title = { Text("Título") },
                            navigationIcon = {
                                Box(Modifier
                                    .clip(shape = CircleShape)
                                    .height(35.dp)
                                    .width(35.dp)
                                    .background(Color.Black)
                                ){}
                            },
                            actions = {
                                Box(Modifier
                                    .clip(shape = CircleShape)
                                    .height(35.dp)
                                    .width(35.dp)
                                    .background(Color.Black)
                                ){}
                                Box(Modifier
                                    .clip(shape = CircleShape)
                                    .height(35.dp)
                                    .width(35.dp)
                                    .background(Color.Black)
                                        ){}
                            }
                        )
                    },
                            bottomBar = {
                        BottomAppBar(
                            containerColor = Color(0xFFCDE7B0)
                        )
                        {
                            Row (Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceEvenly)
                            {
                                Box(Modifier
                                    .clip(shape = CircleShape)
                                    .height(35.dp)
                                    .width(35.dp)
                                    .background(Color.Black)
                                ){}
                                Box(Modifier
                                    .clip(shape = CircleShape)
                                    .height(35.dp)
                                    .width(35.dp)
                                    .background(Color.Black)
                                ){}
                                Box(Modifier
                                    .clip(shape = CircleShape)
                                    .height(35.dp)
                                    .width(35.dp)
                                    .background(Color.Black)
                                ){}
                            }
                        }
                    },
                    modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(Modifier.padding(innerPadding)){
                        Text("Texto de ejemplo", Modifier.padding())
                    }
                }
            }
        }
    }
}