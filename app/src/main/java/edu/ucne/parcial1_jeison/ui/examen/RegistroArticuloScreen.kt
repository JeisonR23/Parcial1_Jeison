package edu.ucne.parcial1_jeison.ui.examen

import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun RegistroArticuloScreen(
    navHostController: NavHostController,
    viewModel: ArticuloViewModel = hiltViewModel()
) {

    

    OutlinedButton(onClick = {
        viewModel.Guardar()
        navHostController.navigateUp()
    }) {
        Text(text = "Guardame")
    }
}
