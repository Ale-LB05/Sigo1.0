package com.example.sigo10.ui.theme


// ===== CLASE: ActividadesEventosActivity.kt =====

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

class ActividadesEventosActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                TopBar("Eventos") { finish() }
                EventosList()
            }
        }
    }
}

@Composable
fun EventosList() {
    val eventos = listOf(
        "Semana de Ingeniería 2025" to "Del 14 al 17 de abril",
        "Feria de Proyectos UTM" to "3 de mayo",
        "Conferencia IA 2025" to "15 de junio"
    )

    Column(Modifier.padding(20.dp)) {
        eventos.forEach {
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 15.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surface)
                    .padding(18.dp)
            ) {
                Column {
                    Text(it.first, style = MaterialTheme.typography.titleMedium)
                    Text(it.second)
                }
            }
        }
    }
}
