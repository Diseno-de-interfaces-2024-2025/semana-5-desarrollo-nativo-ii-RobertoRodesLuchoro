package com.example.ejercicio3

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.twotone.ArrowBack
import androidx.compose.material.icons.twotone.Edit
import androidx.compose.material.icons.twotone.Favorite
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejercicio3.ui.components.login
import com.example.ejercicio3.ui.theme.Ejercicio3Theme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio3Theme {
                Scaffold(
                    topBar = {
                    CenterAlignedTopAppBar(
                        colors = TopAppBarDefaults.topAppBarColors(
                            containerColor = Color(0xFF9b9b9b)
                        ),
                        title = { Text("Formulario ORDENES") },
                        navigationIcon = {
                            Box(
                                Modifier
                                    .clip(shape = CircleShape)
                                    .height(35.dp)
                                    .width(35.dp)
                                    .background(Color(0xFF9b9b9b))
                            ) {
                                MyIcon3(modifier = Modifier.size(32.dp))
                            }
                        },
                        actions = {
                            Box(
                                Modifier
                                    .clip(shape = CircleShape)
                                    .height(35.dp)
                                    .width(35.dp)
                                    .background(Color(0xFF9b9b9b))
                            ) {
                                MyIcon2(modifier = Modifier.size(32.dp))
                            }
                        }
                    )
                },
                    bottomBar = {
                        BottomAppBar(
                            containerColor = Color(0xFF9b9b9b)
                        )
                        {
                            Row(
                                Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceEvenly
                            )
                            {
                                Box(
                                    Modifier
                                        .clip(shape = CircleShape)
                                        .height(35.dp)
                                        .width(35.dp)
                                        .background(Color(0xFF9b9b9b))
                                ) {
                                    MyIcon1(modifier = Modifier.size(32.dp))
                                }
                                Box(
                                    Modifier
                                        .clip(shape = CircleShape)
                                        .height(35.dp)
                                        .width(35.dp)
                                        .background(Color(0xFF9b9b9b))
                                ) {
                                    MyIcon4(modifier = Modifier.size(32.dp))
                                }
                                Box(
                                    Modifier
                                        .clip(shape = CircleShape)
                                        .height(35.dp)
                                        .width(35.dp)
                                        .background(Color(0xFF9b9b9b))
                                ) {
                                    MyIcon5(modifier = Modifier.size(32.dp))
                                }
                            }
                        }
                    },
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Box(Modifier.padding(innerPadding).fillMaxWidth()) {
                        login(modifier = Modifier.fillMaxWidth())
                    }
                }
            }
        }
    }
}

@Composable
fun MyIcon1(modifier: Modifier) {
    Icon(
        imageVector = Icons.Filled.Home,
        contentDescription = "home",
        tint = Color.Black,
        modifier = modifier.size(48.dp)
    )
}

@Composable
fun MyIcon2(modifier: Modifier) {
    Icon(
        imageVector = Icons.Outlined.AccountCircle,
        contentDescription = "profile",
        tint = Color.Black,
        modifier = modifier.size(48.dp)
    )

}

@Composable
fun MyIcon3(modifier: Modifier) {
    Icon(
        imageVector = Icons.TwoTone.ArrowBack,
        contentDescription = "back",
        tint = Color.Black,
        modifier = modifier.size(48.dp)
    )
}

@Composable
fun MyIcon4(modifier: Modifier) {
    Icon(
        imageVector = Icons.TwoTone.Edit,
        contentDescription = "edit",
        tint = Color.Black,
        modifier = modifier.size(48.dp)
    )
}

@Composable
fun MyIcon5(modifier: Modifier) {
    Icon(
        imageVector = Icons.TwoTone.Favorite,
        contentDescription = "love",
        tint = Color.Red,
        modifier = modifier.size(48.dp)
    )
}