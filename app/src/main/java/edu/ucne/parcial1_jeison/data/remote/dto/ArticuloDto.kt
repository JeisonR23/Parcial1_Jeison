package edu.ucne.parcial1_jeison.data.remote.dto

import com.squareup.moshi.Json

data class ArticuloDto(

   @Json(name= "ariticuloId")
    val articuloId: Int,
    val descripcion: String,
    val marca: String,
    val precio: Double,
    val existencia: Double
)


