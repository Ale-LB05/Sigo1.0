package com.example.sigo10.ui.theme

// ===== CLASE: HistorialAcademicoActivity.kt =====

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class HistorialAcademicoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(Modifier.fillMaxSize()) {
                TopBar("Historial Académico") { finish() }
                HistorialList()
            }
        }
    }
}

@Composable
fun HistorialList() {
    val materias = listOf(
        "Cálculo Integral" to "Aprobado",
        "Fundamentos de Programación" to "Aprobado",
        "Base de Datos" to "Cursando",
        "Cálculo Diferencial" to "Aprobado",
        "Ingeniería de Software" to "Aprobado"
    )

    Column(Modifier.padding(20.dp)) {
        materias.forEach { item ->
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 15.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(MaterialTheme.colorScheme.surface)
                    .padding(18.dp)
            ) {
                Column {
                    Text(item.first, style = MaterialTheme.typography.titleMedium)
                    Text("Estado: ${item.second}")
                }
            }
        }
    }
}
