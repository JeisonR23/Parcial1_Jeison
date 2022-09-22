package edu.ucne.parcial1_jeison.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.ucne.parcial1_jeison.ui.examen.ConsultaExamenScreen
import edu.ucne.parcial1_jeison.ui.examen.RegistroExamenScreen

@Composable
fun MyApp() {
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = Screen.ConsultaExamenScreen.route){
        composable(Screen.ConsultaExamenScreen.route){
            ConsultaExamenScreen(navHostController = navHostController)
        }
        composable(Screen.RegistroExamenScreen.route){
           RegistroExamenScreen(navHostController = navHostController)
        }

    }
}