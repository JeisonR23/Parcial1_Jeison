package edu.ucne.parcial1_jeison.data.remote

import edu.ucne.parcial1_jeison.data.remote.dto.ArticuloDto
import retrofit2.http.GET
import retrofit2.http.POST

interface PrestamoApi {
    @GET("api/Articulos")
    suspend fun getArticulos(): List<ArticuloDto>

}
