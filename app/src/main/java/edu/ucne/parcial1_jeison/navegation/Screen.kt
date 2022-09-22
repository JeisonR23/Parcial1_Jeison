package edu.ucne.parcial1_jeison.navegation

sealed class Screen (val route : String){

    object RegistroExamenScreen : Screen("RegistroExamen")
    object ConsultaExamenScreen : Screen("ConsultaExamen")
}