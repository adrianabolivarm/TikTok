package com.example.tiktok

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TikTokScreen()
        }
    }
}

@Composable
fun TikTokScreen() {
    // 1. Box es el lienzo completo de la pantalla
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black) // Fondo negro estilo TikTok
    ) {
        // 2. Columna alineada a la DERECHA para los botones
        Column(
            modifier = Modifier
                .align(Alignment.BottomEnd) // Pega los botones abajo a la derecha
                .padding(end = 16.dp, bottom = 40.dp), // Separación del borde de la pantalla
            horizontalAlignment = Alignment.CenterHorizontally // Centra el texto debajo del ícono
        ) {
            // --- BOTÓN ME GUSTA ---
            Icon(
                imageVector = Icons.Default.Favorite, // Ícono de corazón
                contentDescription = "Me gusta",
                tint = Color.Red, // Color rojo
                modifier = Modifier.size(36.dp)
            )
            Text(text = "12.5K", color = Color.White, fontSize = 12.sp)

            Spacer(modifier = Modifier.height(20.dp)) // Espacio vertical entre botones

            // --- BOTÓN COMENTARIOS / MÁS OPCIONES ---
            Icon(
                imageVector = Icons.Default.MoreVert, // Ícono de 3 puntos horizontales/verticales
                contentDescription = "Comentarios",
                tint = Color.White,
                modifier = Modifier.size(36.dp)
            )
            Text(text = "450", color = Color.White, fontSize = 12.sp)

            Spacer(modifier = Modifier.height(20.dp))

            // --- BOTÓN COMPARTIR ---
            Icon(
                imageVector = Icons.Default.Share, // Ícono de compartir
                contentDescription = "Compartir",
                tint = Color.White,
                modifier = Modifier.size(36.dp)
            )
            Text(text = "Compartir", color = Color.White, fontSize = 12.sp)
        }
    }
}