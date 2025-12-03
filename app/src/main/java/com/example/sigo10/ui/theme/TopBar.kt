package com.example.sigo10.ui.theme

// ===== CLASE: TopBar.kt (componente) =====

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sigo.sigo10.R

@Composable
fun TopBar(titulo: String, onBack: (() -> Unit)? = null) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        shadowElevation = 4.dp
    ) {
        Row(
            Modifier.fillMaxWidth().padding(16.dp),
            horizontalArrangement = Arrangement.Start
        ) {
            if (onBack != null) {
                IconButton(onClick = onBack) {
                    Image(
                        painter = painterResource(R.drawable.icon_back),
                        contentDescription = null,
                        modifier = Modifier.size(26.dp)
                    )
                }
                Spacer(Modifier.width(10.dp))
            }

            Text(
                titulo,
                color = MaterialTheme.colorScheme.onPrimary,
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}
