package edu.ucne.parcial1_jeison.ui.examen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.OutlinedButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun RegistroArticuloScreen(
    navHostController: NavHostController,
    viewModel: ArticuloViewModel = hiltViewModel()
) {
    Column(modifier = Modifier.fillMaxWidth()) {

        OutlinedTextField(
            value = viewModel.descripcion
            , onValueChange ={viewModel.descripcion = it},
         label = { Text(text = "Descripcion")},
        modifier = Modifier.fillMaxWidth())
    }
    OutlinedTextField(
        value = viewModel.marca
        , onValueChange ={viewModel.marca = it},
        label = { Text(text = "Marca")},
        modifier = Modifier.fillMaxWidth())

    OutlinedTextField(
        value = viewModel.existencia
        , onValueChange ={viewModel.existencia = it},
        label = { Text(text = "Existencia")},
        modifier = Modifier.fillMaxWidth())



    OutlinedButton(onClick = {
        viewModel.Guardar()
        navHostController.navigateUp()
    }) {
        Text(text = "Guardame")
    }
}
