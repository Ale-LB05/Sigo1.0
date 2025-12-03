package com.example.sigo10.ui.theme

// ===== CLASE: PerfilActivity.kt =====

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

class PerfilActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(Modifier.fillMaxSize()) {
                TopBar("Mi Perfil") { finish() }
                ProfileContent()
            }
        }
    }
}

@Composable
fun ProfileContent() {
    Column(Modifier.padding(20.dp)) {
        Box(
            Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(18.dp))
                .background(MaterialTheme.colorScheme.surface)
                .padding(20.dp)
        ) {
            Column {
                Text("Nombre: Lucia Molinero", style = MaterialTheme.typography.titleMedium)
                Spacer(Modifier.height(10.dp))
                Text("Matrícula: 202300123")
                Text("Carrera: Ingeniería en Software")
                Text("Cuatrimestre: 4to")
            }
        }
    }
}
