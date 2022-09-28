package edu.ucne.parcial1_jeison.ui.examen

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import edu.ucne.parcial1_jeison.model.Articulo
import edu.ucne.parcial1_jeison.navegation.Screen

@Composable
fun ConsultaArticuloScreen(

    navHostController: NavHostController,
    viewModel : ArticuloListViewModel = hiltViewModel()
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Consulta Examen") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navHostController.navigate(Screen.RegistroArticuloScreen.route)
            }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        }

    ) {

        Column(
            modifier = Modifier
                .padding(it)
                .padding(8.dp)
        ) {

            val lista = viewModel.articulo.collectAsState(initial = emptyList())

            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                items(lista.value) { articulo ->
                    RowArticulo(articulo = articulo)
                }

            }
       }
    }
}

@Composable
fun RowArticulo( articulo : Articulo){
    Column(
        modifier = Modifier.padding(1.dp).border(1.dp, color = Color.LightGray).fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Descripcion", color = Color.Cyan)
        Text(text = articulo.descripcion)
        Text(text = "Marca", color = Color.Cyan)
        Text(text = articulo.marca)
        Text(text = "Existencia", color = Color.Cyan)
        Text(text = articulo.existencia.toString())
        Spacer(modifier = Modifier.padding(10.dp))
    }
}

