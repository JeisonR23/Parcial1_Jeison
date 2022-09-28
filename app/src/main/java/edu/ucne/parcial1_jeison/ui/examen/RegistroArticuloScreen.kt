package edu.ucne.parcial1_jeison.ui.examen

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.core.text.isDigitsOnly
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import edu.ucne.parcial1_jeison.navegation.Screen

@Composable
fun RegistroArticuloScreen(
    navHostController: NavHostController,
    viewModel: ArticuloViewModel = hiltViewModel()
) {

    Scaffold(
        modifier = Modifier.fillMaxWidth(),
        topBar = {
            TopAppBar(
                title = { Text(text = "Registro de Articulos") }
            )
        },
    ) {
    val context = LocalContext.current
    fun validar() {
        if (viewModel.descripcion.isEmpty()) {
            Toast.makeText(context, "El campo Descripcion esta vacio", Toast.LENGTH_LONG).show()
        } else
            if (viewModel.marca.isEmpty()) {
                Toast.makeText(context, "El campo Marca esta vacio", Toast.LENGTH_LONG).show()
            } else
                if (viewModel.existencia.isEmpty()) {
                    Toast.makeText(context, "El campo Existencia esta vacio", Toast.LENGTH_LONG)
                        .show()
                } else
                    if (viewModel.existencia.isDigitsOnly() && viewModel.existencia.toDouble() > 0) {
                        viewModel.Guardar()
                        navHostController.navigateUp()
                    } else {
                        Toast.makeText(
                            context,
                            "El campo Existencia solo permite numeros mayores a 0",
                            Toast.LENGTH_LONG
                        ).show()
                    }
    }

    Column(modifier = Modifier.fillMaxWidth()) {

        OutlinedTextField(
            value = viewModel.descripcion, onValueChange = { viewModel.descripcion = it },
            label = { Text(text = "Descripcion") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = viewModel.marca, onValueChange = { viewModel.marca = it },
            label = { Text(text = "Marca") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = viewModel.existencia, onValueChange = { viewModel.existencia = it },
            label = { Text(text = "Existencia") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedButton(modifier = Modifier.fillMaxWidth(),
            onClick = {
                validar()
            }) {
            Text(text = "Guardar")
        }
    }

}
}
