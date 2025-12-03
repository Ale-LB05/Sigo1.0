package com.example.sigo10.ui.theme


// ===== CLASE: RestaurarPasswordActivity.kt =====

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sigo.sigo10.ui.components.TopBar

class RestaurarPasswordActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var correo by remember { mutableStateOf("") }
            Column {
                TopBar("Recuperar contraseña") { finish() }
                Column(Modifier.padding(20.dp)) {
                    OutlinedTextField(
                        value = correo,
                        onValueChange = { correo = it },
                        label = { Text("Correo institucional") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(Modifier.height(20.dp))
                    Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                        Text("Enviar código de recuperación")
                    }
                }
            }
        }
    }
}
