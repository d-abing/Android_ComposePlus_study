package com.example.chapter3.ui.components.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.chapter3.R
import com.example.chapter3.ui.models.buttons.LeadingIconData
import com.example.chapter3.ui.models.dialog.DialogButton
import com.example.chapter3.ui.theme.FastCampusComposePlusTheme

@Preview
@Composable
private fun AlertDialogPreview() {
    FastCampusComposePlusTheme {
        DialogPopup.Alert(
            title = "Title",
            bodyText = "blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah " ,
            buttons = listOf(
                DialogButton.UnderlinedText("OK") {},
            )
        )
    }
}

@Preview
@Composable
private fun DefaultDialogPreview() {
    FastCampusComposePlusTheme {
        DialogPopup.Default(
            title = "Title",
            bodyText = "blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah " ,
            buttons = listOf(
                DialogButton.Primary("OPEN") {},
                DialogButton.SecondaryBorderless("CANCEL") {},
            )
        )
    }
}

@Preview
@Composable
private fun RatingDialogPreview() {
    FastCampusComposePlusTheme {
        DialogPopup.Rating(
            movieName = "Title",
            rating = 7.5f ,
            buttons = listOf(
                DialogButton.Primary(
                    title = "SUBMIT",
                    leadingIconData = LeadingIconData(
                        iconDrawable = R.drawable.ic_send,
                        iconContentDescription = null
                    )
                ) {},
                DialogButton.Secondary("CANCEL") {},
            )
        )
    }
}