package de.sebastiangrundhoefer.littlelemon.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import de.sebastiangrundhoefer.littlelemon.data.UserSingleton

@Composable
fun MyNavigation(){

    val context = LocalContext.current
    UserSingleton.loadFromPreferences(context)

    val startDestination = if (UserSingleton.isLoggedIn){
        Home.route
    } else {
        OnBoarding.route
    }

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination){

        composable(OnBoarding.route){
            OnBoarding(navController = navController)
        }

        composable(Home.route){
            Home(navController = navController)


        }

        composable(Profile.route){
            Profile(navController = navController)
        }
    }
}