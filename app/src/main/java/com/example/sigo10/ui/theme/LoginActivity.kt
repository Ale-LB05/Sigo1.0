package com.example.sigo10.ui.theme


// ===== CLASE: LoginActivity.kt =====

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.sigo.sigo10.R

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var matricula by remember { mutableStateOf("") }
            var pass by remember { mutableStateOf("") }

            Column(
                Modifier.fillMaxSize().padding(32.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(Modifier.height(60.dp))

                Image(
                    painter = painterResource(R.drawable.logo_sigo),
                    contentDescription = null,
                    modifier = Modifier.size(200.dp)
                )

                Spacer(Modifier.height(35.dp))

                OutlinedTextField(
                    value = matricula,
                    onValueChange = { matricula = it },
                    label = { Text("Matrícula") },
                    leadingIcon = {
                        Image(
                            painter = painterResource(R.drawable.icon_usuario),
                            contentDescription = null,
                            modifier = Modifier.size(26.dp)
                        )
                    },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(Modifier.height(20.dp))

                OutlinedTextField(
                    value = pass,
                    onValueChange = { pass = it },
                    label = { Text("Contraseña") },
                    leadingIcon = {
                        Image(
                            painter = painterResource(R.drawable.icon_contrasena),
                            contentDescription = null,
                            modifier = Modifier.size(26.dp)
                        )
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(Modifier.height(25.dp))

                Button(
                    onClick = {
                        startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                        finish()
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Iniciar sesión")
                }

                TextButton(onClick = {
                    startActivity(Intent(this@LoginActivity, RestaurarPasswordActivity::class.java))
                }) {
                    Text("¿Olvidaste tu contraseña?")
                }
            }
        }
    }
}
