package edu.ucne.parcial1_jeison.ui.examen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import edu.ucne.parcial1_jeison.navegation.RowExamen
import edu.ucne.parcial1_jeison.navegation.Screen

@Composable
fun ConsultaExamenScreen(

    navHostController: NavHostController,
    viewModel : ExamenViewModel = hiltViewModel()
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Consulta Examen") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navHostController.navigate(Screen.RegistroExamenScreen.route)
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
/*
            val lista = viewModel.examen.collectAsState(initial = emptyList())

            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                items(lista.value) { examen ->
                    RowExamen(examen = examen)
                }

            }


       */ }
    }
}

