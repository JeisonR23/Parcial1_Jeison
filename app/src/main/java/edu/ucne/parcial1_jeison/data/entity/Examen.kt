package edu.ucne.parcial1_jeison.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Examenes")

data class Examen(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val cadena1 : String,
    val cadena2: String,
    val doble: Double = 0.00

)

