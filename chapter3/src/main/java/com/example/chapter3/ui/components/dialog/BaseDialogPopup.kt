package com.example.chapter3.ui.components.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.chapter3.ui.components.dialog.components.button.DialogButtonsColumn
import com.example.chapter3.ui.components.dialog.components.content.DialogContentWrapper
import com.example.chapter3.ui.components.dialog.components.title.DialogTitleWrapper
import com.example.chapter3.ui.models.dialog.DialogButton
import com.example.chapter3.ui.models.dialog.DialogContent
import com.example.chapter3.ui.models.dialog.DialogText
import com.example.chapter3.ui.models.dialog.DialogTitle
import com.example.chapter3.ui.theme.FastCampusComposePlusTheme
import com.example.chapter3.ui.theme.Paddings
import com.example.chapter3.ui.theme.myColors

@Composable
fun BaseDialogPopup(
    dialogTitle: DialogTitle? = null,
    dialogContent: DialogContent? = null,
    buttons: List<DialogButton>? = null
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(
            Paddings.none),
        colors = CardDefaults.cardColors(MaterialTheme.myColors.background),
        shape = MaterialTheme.shapes.large
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            dialogTitle?.let {
                DialogTitleWrapper(it)
            }
            Column(
                modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxWidth()
                    .padding(
                        start = Paddings.xlarge,
                        end = Paddings.xlarge,
                        bottom = Paddings.xlarge
                    )
            ) {
                dialogContent?.let { DialogContentWrapper(it) }
                buttons?.let { DialogButtonsColumn(it) }
            }
        }
    }
}

@Preview
@Composable
private fun BaseDialogPopupPreview() {
    FastCampusComposePlusTheme {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Header("TITLE"),
            dialogContent = DialogContent.Large(
                DialogText.Default("abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde ")
            ),
            buttons = listOf(
                DialogButton.Primary("OK") {

                },
            )
        )
    }
}

@Preview
@Composable
private fun BaseDialogPopupPreview2() {
    FastCampusComposePlusTheme {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Large("TITLE"),
            dialogContent = DialogContent.Default(
                DialogText.Default("abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde abcde ")
            ),
            buttons = listOf(
                DialogButton.Secondary("OK") {},
                DialogButton.UnderlinedText("CANCEL") {},
            )
        )
    }
}

@Preview
@Composable
private fun BaseDialogPopupPreview3() {
    FastCampusComposePlusTheme {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Large("TITLE"),
            dialogContent = DialogContent.Rating(
                DialogText.Rating(
                    text = "Jurassic Park",
                    rating = 8.2f
                )
            ),
            buttons = listOf(
                DialogButton.Primary("OK") {},
                DialogButton.Secondary("CANCEL") {},
            )
        )
    }
}


