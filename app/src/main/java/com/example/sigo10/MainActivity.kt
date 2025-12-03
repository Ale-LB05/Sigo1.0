package com.example.sigo10

// ===== CLASE: MainActivity.kt (MENÚ PRINCIPAL PROFESIONAL) =====

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sigo.sigo10.R
import com.sigo.sigo10.ui.components.TopBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(Modifier.fillMaxSize()) {
                TopBar("SIGO 1.0")
                Spacer(Modifier.height(25.dp))
                MenuGrid(
                    onPerfil = { startActivity(Intent(this, PerfilActivity::class.java)) },
                    onHistorial = { startActivity(Intent(this, HistorialAcademicoActivity::class.java)) },
                    onPagos = { startActivity(Intent(this, PagosActivity::class.java)) },
                    onEventos = { startActivity(Intent(this, ActividadesEventosActivity::class.java)) },
                    onInscripciones = { startActivity(Intent(this, InscripcionesEscuelaActivity::class.java)) }
                )
            }
        }
    }
}

@Composable
fun MenuItem(icon: Int, txt: String, onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .size(145.dp)
            .clip(RoundedCornerShape(18.dp))
            .background(MaterialTheme.colorScheme.secondary)
            .clickable { onClick() }
            .padding(18.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(icon),
            contentDescription = null,
            modifier = Modifier.size(70.dp)
        )
        Spacer(Modifier.height(10.dp))
        Text(txt, color = MaterialTheme.colorScheme.onBackground)
    }
}

@Composable
fun MenuGrid(onPerfil: () -> Unit, onHistorial: () -> Unit, onPagos: () -> Unit, onEventos: () -> Unit, onInscripciones: () -> Unit) {
    Column(Modifier.padding(20.dp)) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            MenuItem(R.drawable.icon_perfil, "Perfil", onPerfil)
            MenuItem(R.drawable.icon_historial, "Historial", onHistorial)
        }
        Spacer(Modifier.height(20.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            MenuItem(R.drawable.icon_pagos, "Pagos", onPagos)
            MenuItem(R.drawable.icon_eventos, "Eventos", onEventos)
        }
        Spacer(Modifier.height(20.dp))
        MenuItem(R.drawable.icon_inscripciones, "Inscripciones", onInscripciones)
    }
}
