package de.sebastiangrundhoefer.littlelemon.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import de.sebastiangrundhoefer.littlelemon.R

// Set of Material typography styles to start with
val Typography = Typography(
   body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        fontStyle = FontStyle(R.font.karlaregular),
        color = LittleLemonWhite
   ),
    body2 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        fontStyle = FontStyle(R.font.karlaregular),
        color = LittleLemonBlack
    ),

    h1 = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Normal,
        fontSize = 32.sp,
        fontStyle = FontStyle(R.font.markazitextregular),
        color = LittleLemonYellow
    ),

    h2 = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
        fontStyle = FontStyle(R.font.markazitextregular),
        color = LittleLemonWhite
    ),

    h3 = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        fontStyle = FontStyle(R.font.karlaregular),
        color = LittleLemonBlack
    ),

    h4 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        fontStyle = FontStyle(R.font.karlaregular),
        color = LittleLemonBlack
    ),

    h5 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        fontStyle = FontStyle(R.font.karlaregular),
        color = LittleLemonBlack
    ),

    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp,
        fontStyle = FontStyle(R.font.markazitextregular)

    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        fontStyle = FontStyle(R.font.karlaregular)
    )



)