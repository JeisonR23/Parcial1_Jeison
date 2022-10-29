package edu.ucne.parcial1_jeison.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Articulos")

data class ArticuloEntity(
    @PrimaryKey(autoGenerate = true)
    val articuloId : Int = 0,
    val descripcion : String,
    val marca: String,
    val existencia: Double = 0.00

)

