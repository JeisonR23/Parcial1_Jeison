package edu.ucne.parcial1_jeison.data.repository

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import edu.ucne.parcial1_jeison.data.ArticuloDb
import edu.ucne.parcial1_jeison.model.Articulo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ArticuloRepository @Inject constructor(
    val articuloDb: ArticuloDb
) {

    suspend fun insert(articulo: Articulo) {
        articuloDb.articuloDao.insert(articulo)
    }

    suspend fun delete(articulo: Articulo) {
        articuloDb.articuloDao.delete(articulo)
    }

    fun find() = articuloDb.articuloDao.find()

    suspend fun findById(id: Int) = articuloDb.articuloDao.findById(id)


}