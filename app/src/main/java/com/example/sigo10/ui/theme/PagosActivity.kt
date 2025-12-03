package com.example.sigo10.ui.theme


// ===== CLASE: PagosActivity.kt =====

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
import com.sigo.sigo10.ui.components.TopBar

class PagosActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                TopBar("Pagos") { finish() }
                PagosList()
            }
        }
    }
}

@Composable
fun PagosList() {
    val pagos = listOf(
        "Inscripción" to "$2,500",
        "Constancia de estudios" to "$45",
        "Reposición de credencial" to "$150",
        "Curso extra" to "$350"
    )

    Column(Modifier.padding(20.dp)) {
        pagos.forEach {
            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 15.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(MaterialTheme.colorScheme.surface)
                    .padding(18.dp)
            ) {
                Column {
                    Text(it.first, style = MaterialTheme.typography.titleMedium)
                    Text("Costo: ${it.second}")
                }
            }
        }
    }
}
