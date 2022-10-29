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
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import edu.ucne.parcial1_jeison.model.ArticuloEntity
import edu.ucne.parcial1_jeison.navegation.Screen

@Composable
fun ConsultaArticuloScreen(

    navHostController: NavHostController,
    viewModel : ArticuloListViewModel = hiltViewModel()
) {
    Scaffold(
        modifier = Modifier.fillMaxWidth(),
        topBar = {
            TopAppBar(
                title = { Text(text = "Consulta de Articulos") }
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

           val uiState by viewModel.uiState.collectAsState()
            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                items(uiState.articuloEntityList) { articulo ->
                    RowArticulo(articuloEntity = articulo)
                }

            }
       }
    }
}

@Composable
fun RowArticulo(articuloEntity : ArticuloEntity){
    Column(
        modifier = Modifier
            .padding(1.dp)
            .border(1.dp, color = Color.LightGray)
            .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Descripcion", color = Color.Cyan)
        Text(text = articuloEntity.descripcion)
        Text(text = "Marca", color = Color.Cyan)
        Text(text = articuloEntity.marca)
        Text(text = "Existencia", color = Color.Cyan)
        Text(text = articuloEntity.existencia.toString())
        Spacer(modifier = Modifier.padding(10.dp))
    }
}

