package edu.ucne.parcial1_jeison.navegation

sealed class Screen (val route : String){

    object RegistroArticuloScreen : Screen("RegistroArticulo")
    object ConsultaArticuloScreen : Screen("ConsultaArticulo")
}

