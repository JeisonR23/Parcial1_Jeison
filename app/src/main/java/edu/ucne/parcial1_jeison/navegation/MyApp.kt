package edu.ucne.parcial1_jeison.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.ucne.parcial1_jeison.ui.examen.ConsultaArticuloScreen
import edu.ucne.parcial1_jeison.ui.examen.RegistroArticuloScreen

@Composable
fun MyApp() {
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = Screen.ConsultaArticuloScreen.route){
        composable(Screen.ConsultaArticuloScreen.route){
            ConsultaArticuloScreen(navHostController = navHostController)
        }
        composable(Screen.RegistroArticuloScreen.route){
           RegistroArticuloScreen(navHostController = navHostController)
        }

    }
}