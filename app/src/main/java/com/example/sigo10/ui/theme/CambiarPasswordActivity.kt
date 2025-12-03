package com.example.sigo10.ui.theme

// ===== CLASE: CambiarPasswordActivity.kt =====

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


class CambiarPasswordActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var pass1 by remember { mutableStateOf("") }
            var pass2 by remember { mutableStateOf("") }
            Column {
                TopBar("Cambiar contraseña") { finish() }
                Column(Modifier.padding(20.dp)) {
                    OutlinedTextField(value = pass1, onValueChange = { pass1 = it }, label = { Text("Nueva contraseña") }, modifier = Modifier.fillMaxWidth())
                    Spacer(Modifier.height(20.dp))
                    OutlinedTextField(value = pass2, onValueChange = { pass2 = it }, label = { Text("Confirmar contraseña") }, modifier = Modifier.fillMaxWidth())
                    Spacer(Modifier.height(20.dp))
                    Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                        Text("Actualizar contraseña")
                    }
                }
            }
        }
    }
}
