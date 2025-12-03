package com.example.sigo10.ui.theme


// ===== CLASE: InscripcionesEscuelaActivity.kt =====

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sigo.sigo10.ui.components.TopBar

class InscripcionesEscuelaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                TopBar("Inscripciones EE") { finish() }
                InscripcionesList()
            }
        }
    }
}

@Composable
fun InscripcionesList() {
    val ee = listOf("Inglés III", "Robótica", "Programación Avanzada", "Dibujo Técnico")
    var seleccionada by remember { mutableStateOf("") }

    Column(Modifier.padding(20.dp)) {
        ee.forEach {
            Button(
                onClick = { seleccionada = it },
                modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp)
            ) {
                Text(it)
            }
        }
        if (seleccionada.isNotEmpty()) {
            Text("Seleccionaste: $seleccionada")
        }
    }
}
