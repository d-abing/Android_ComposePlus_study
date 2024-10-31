package com.example.chapter3.ui.components.movie

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.chapter3.ui.theme.Paddings
import com.example.chapter3.ui.theme.myColors
import com.example.chapter3.ui.util.getAnnotatedText


@Composable
fun MovieMeta(
    modifier: Modifier = Modifier,
    key: String,
    value: String
) {
    Column(modifier = modifier) {
        // Key
        Text(
            text = key,
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.myColors.onSurface.copy(alpha = 0.5f)
        )

        // Value
        Text(
            text = getAnnotatedText(text = value),
            style = MaterialTheme.typography.bodyMedium
        )

        Spacer(modifier = Modifier.height(Paddings.large))
    }
}