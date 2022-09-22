package edu.ucne.parcial1_jeison.navegation

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import edu.ucne.parcial1_jeison.model.Examen

@Composable
fun RowExamen( examen : Examen){
    Row() {
        Text(text = examen.cadena1)
        Text(text = examen.cadena2)
        Text(text = examen.doble.toString())
    }
}