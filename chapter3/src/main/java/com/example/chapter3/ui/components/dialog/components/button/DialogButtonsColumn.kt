package com.example.chapter3.ui.components.dialog.components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.chapter3.ui.components.buttons.PrimaryButton
import com.example.chapter3.ui.components.buttons.SecondaryBorderlessButton
import com.example.chapter3.ui.components.buttons.SecondaryButton
import com.example.chapter3.ui.components.buttons.UnderlinedTextButton
import com.example.chapter3.ui.models.dialog.DialogButton
import com.example.chapter3.ui.theme.Paddings

@Composable
fun DialogButtonsColumn(
    buttons: List<DialogButton>?
){
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        buttons?.forEachIndexed { index, dialogButton ->
            if (index > 0) {
                Spacer(modifier = Modifier.height(Paddings.large))
            }
            when(dialogButton) {
                is DialogButton.Primary -> {
                    PrimaryButton(
                        text = dialogButton.title,
                        leadingIconData = dialogButton.leadingIconData,
                        onClick = { dialogButton.action?.invoke() }
                    )
                }
                is DialogButton.Secondary -> {
                    SecondaryButton(
                        text = dialogButton.title,
                        onClick = { dialogButton.action?.invoke() }
                    )
                }
                is DialogButton.SecondaryBorderless -> {
                    SecondaryBorderlessButton(
                        text = dialogButton.title,
                        onClick = { dialogButton.action?.invoke() }
                    )
                }
                is DialogButton.UnderlinedText -> {
                    UnderlinedTextButton(
                        text = dialogButton.title,
                        onClick = { dialogButton.action?.invoke() }
                    )
                }
            }
        }
    }

}
