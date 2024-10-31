package com.example.chapter3.ui.components.buttons

import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chapter3.ui.theme.FastCampusComposePlusTheme
import com.example.chapter3.ui.theme.Paddings
import com.example.chapter3.ui.theme.myColors

@Composable
fun SecondaryButton(
    modifier: Modifier = Modifier,
    @StringRes id: Int? = null,
    text: String = "",
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.large,
        border = BorderStroke(
            2.dp,
            MaterialTheme.myColors.secondary
        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.myColors.background,
            contentColor = MaterialTheme.myColors.secondary,
            disabledContainerColor = MaterialTheme.myColors.background,
            disabledContentColor = MaterialTheme.myColors.disabledSecondary
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = id?.let { stringResource(id = id) } ?: text,
                style = MaterialTheme.typography.labelLarge,
                modifier = Modifier.padding(Paddings.small)
            )
        }
    }
}

@Preview
@Composable
private fun SecondaryButtonPreview() {
    FastCampusComposePlusTheme {
        SecondaryButton(onClick = {}, text = "SUBMIT")
    }
}