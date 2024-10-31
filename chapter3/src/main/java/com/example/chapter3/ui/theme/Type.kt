package com.example.chapter3.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import com.example.chapter3.R

private val spoqaBold = FontFamily(
    Font(R.font.spoqa_han_sans_neo_bold, FontWeight.Bold)
)
private val spoqaRegular = FontFamily(
    Font(R.font.spoqa_han_sans_neo_regular, FontWeight.Normal)
)
private val spoqaThin = FontFamily(
    Font(R.font.spoqa_han_sans_neo_thin, FontWeight.Thin)
)

val Typography = Typography(
    // h1
    displayLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 60.sp,
    ),
    // h2
    displayMedium = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 32.sp,
    ),
    // h3
    displaySmall = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 24.sp,
    ),
    // h4
    headlineLarge = TextStyle(
        fontFamily = spoqaThin,
        fontSize = 32.sp,
    ),
    // h5
    headlineMedium = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 18.sp,
    ),
    // h6
    headlineSmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp,
    ),
    // subtitle1
    titleLarge = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 18.sp,
    ),
    // subtitle2
    titleMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp,
    ),
    // body1
    bodyLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 15.sp,
    ),
    // body2
    bodyMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp,
    ),
    // button
    labelLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 18.sp,
    ),
    // caption
    labelMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp,
    ),
)


val Typography.headlineMediumTitle: TextStyle
    @Composable get() = headlineMedium.copy(
        fontSize = 24.sp
    )

val Typography.dialogButton: TextStyle
    @Composable get() = labelLarge.copy(
        fontSize = 18.sp
    )

val Typography.underlinedDialogButton: TextStyle
    @Composable get() = labelLarge.copy(
        textDecoration = TextDecoration.Underline
    )

val Typography.underlinedButton: TextStyle
    @Composable get() = labelLarge.copy(
        textDecoration = TextDecoration.Underline
    )