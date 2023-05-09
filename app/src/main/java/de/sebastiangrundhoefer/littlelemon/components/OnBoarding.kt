package de.sebastiangrundhoefer.littlelemon.components

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import de.sebastiangrundhoefer.littlelemon.R
import de.sebastiangrundhoefer.littlelemon.R.*
import de.sebastiangrundhoefer.littlelemon.data.UserSingleton
import de.sebastiangrundhoefer.littlelemon.ui.theme.LittleLemonGreen
import de.sebastiangrundhoefer.littlelemon.ui.theme.LittleLemonYellow
import de.sebastiangrundhoefer.littlelemon.ui.theme.Typography


@Composable
fun OnBoarding(navController: NavController) {

    navController.clearBackStack(OnBoarding.route)

    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        // Logo image

        Image(
            painter = painterResource(id = drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .fillMaxWidth()
                .height(85.dp)
                .padding(top = 8.dp, bottom = 16.dp)
        )

        // Title with green background

        Text(
            text = "Let's get to know you",
            fontSize = 30.sp,
            fontFamily = FontFamily(Font(R.font.karlaregular)),
            textAlign = TextAlign.Center,
            color = Color.White,
            modifier = Modifier
                .background(LittleLemonGreen)
                .padding(16.dp)
                .fillMaxWidth()
                .height(85.dp)
                .wrapContentHeight()

        )

        Text(
            style = Typography.h3,
            text = "Personal information",
            modifier = Modifier.padding(top = 32.dp, bottom = 16.dp)
        )

        Text(
            text = "First Name",
            fontSize = 12.sp,
            fontFamily = FontFamily(Font(font.karlaregular, FontWeight.Bold))
        )

        TextField(
            value = firstName,
            onValueChange = { firstName = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        Text(
            text = "Last Name",
            fontSize = 12.sp,
            fontFamily = FontFamily(Font(font.karlaregular, FontWeight.Bold)),
        )

        TextField(
            value = lastName,
            onValueChange = { lastName = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        Text(
            text = "Email",
            fontSize = 12.sp,
            fontFamily = FontFamily(Font(font.karlaregular, FontWeight.Bold))
        )
        TextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )
        MyButton(
            text = "Register", onClick = {

                if (firstName.isBlank() || lastName.isBlank() || email.isBlank()) {
                    Toast.makeText(context, string.unsuccessful_reg, Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(context, string.successful_reg, Toast.LENGTH_LONG).show()
                    saveUser(firstName, lastName, email, true, context)
                    navController.navigate(Home.route)
                }

            },
            color = LittleLemonYellow
        )
    }
}

fun saveUser(
    firstName: String,
    lastName: String,
    email: String,
    isLoggedIn: Boolean,
    context: Context
) {
    UserSingleton.firstName = firstName
    UserSingleton.lastName = lastName
    UserSingleton.email = email
    UserSingleton.isLoggedIn = isLoggedIn
    UserSingleton.saveToPreferences(context)
}









