package com.example.chapter3.ui.components.dialog

import androidx.compose.runtime.Composable
import com.example.chapter3.ui.models.dialog.DialogButton
import com.example.chapter3.ui.models.dialog.DialogContent
import com.example.chapter3.ui.models.dialog.DialogText
import com.example.chapter3.ui.models.dialog.DialogTitle

@Composable
fun DialogPopup.Rating(
    movieName: String,
    rating: Float,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Large("Rate your score!"),
        dialogContent = DialogContent.Rating(
            DialogText.Rating(
                text = movieName,
                rating = rating
            )
        ),
        buttons = buttons
    )
}