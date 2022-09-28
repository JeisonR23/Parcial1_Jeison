package edu.ucne.parcial1_jeison.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import edu.ucne.parcial1_jeison.model.Articulo
import kotlinx.coroutines.flow.Flow

@Dao
interface ArticuloDao {

    @Insert(onConflict =  OnConflictStrategy.REPLACE)
    suspend fun insert (articulo: Articulo)

    @Delete
    suspend fun delete (articulo: Articulo)

    @Query("SELECT * FROM Articulos ORDER BY articuloId")
    fun find (): Flow<List<Articulo>>

    @Query("SELECT * FROM Articulos WHERE articuloId =:id")
   suspend fun findById (id : Int): Articulo

}