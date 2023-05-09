package de.sebastiangrundhoefer.littlelemon.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import de.sebastiangrundhoefer.littlelemon.R
import de.sebastiangrundhoefer.littlelemon.data.UserSingleton
import de.sebastiangrundhoefer.littlelemon.ui.theme.LittleLemonYellow
import de.sebastiangrundhoefer.littlelemon.ui.theme.Typography

@Composable
fun Profile(navController: NavController) {

    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .fillMaxWidth()
                .height(75.dp)
                .padding(top = 8.dp, bottom = 16.dp)
        )

        Text(
            text = "Personal information",
            style = Typography.h3,
            modifier = Modifier.padding(top = 32.dp, bottom = 16.dp)
        )

        Text(
            text = "First Name",
            style = Typography.caption
        )
        Text(
            text = UserSingleton.firstName.toString(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            style = Typography.body2
        )

        Text(
            text = "Last Name",
            style = Typography.caption
        )
        Text(
            text = UserSingleton.lastName.toString(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            style = Typography.body2
        )

        Text(
            text = "Email",
            style = Typography.caption
        )
        Text(
            text = UserSingleton.email.toString(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            style = Typography.body2
        )
        // Button at the bottom of the page
        MyButton(
            text = "Logout", onClick = {
                UserSingleton.logout(context)
                navController.navigate(OnBoarding.route)

            },
            color = LittleLemonYellow
        )

    }
}