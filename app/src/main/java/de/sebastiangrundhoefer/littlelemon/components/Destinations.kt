package de.sebastiangrundhoefer.littlelemon.components


// Interface that sets all the destinations of the Little Lemon App
interface Destinations{
    val route: String
}

object OnBoarding: Destinations {
    override val route = "OnBoarding"
}

object Home: Destinations {
    override val route = "Home"
}

object Profile: Destinations {
    override val route = "Profile"
}