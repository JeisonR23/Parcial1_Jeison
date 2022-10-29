package edu.ucne.parcial1_jeison.data.repository

import edu.ucne.parcial1_jeison.data.ArticuloDb
import edu.ucne.parcial1_jeison.data.remote.PrestamoApi
import edu.ucne.parcial1_jeison.model.ArticuloEntity
import javax.inject.Inject

class ArticuloRepository @Inject constructor(
    val articuloDb: ArticuloDb,
    val api: PrestamoApi
) {

    suspend fun getArticulos() {
        val listaDto = api.getArticulos()
        val listaEntity = listaDto.map { articuloDto ->
            ArticuloEntity(
                articuloId = articuloDto.articuloId,
                descripcion = articuloDto.descripcion,
                marca = articuloDto.marca,
                existencia = articuloDto.existencia
            )
        }
        articuloDb.articuloDao.insertList(listaEntity)
    }

    suspend fun insert(articuloEntity: ArticuloEntity) {
        articuloDb.articuloDao.insert(articuloEntity)
    }

    suspend fun delete(articuloEntity: ArticuloEntity) {
        articuloDb.articuloDao.delete(articuloEntity)
    }

    fun find() = articuloDb.articuloDao.find()

    suspend fun findById(id: Int) = articuloDb.articuloDao.findById(id)


}