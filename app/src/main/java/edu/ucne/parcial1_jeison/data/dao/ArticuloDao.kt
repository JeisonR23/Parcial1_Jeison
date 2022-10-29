package edu.ucne.parcial1_jeison.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import edu.ucne.parcial1_jeison.model.ArticuloEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ArticuloDao {

    @Insert(onConflict =  OnConflictStrategy.REPLACE)
    suspend fun insert (articuloEntity: ArticuloEntity)

    @Insert(onConflict =  OnConflictStrategy.REPLACE)
    suspend fun insertList (articulos: List<ArticuloEntity>)

    @Delete
    suspend fun delete (articuloEntity: ArticuloEntity)

    @Query("SELECT * FROM Articulos ORDER BY articuloId")
    fun find (): Flow<List<ArticuloEntity>>

    @Query("SELECT * FROM Articulos WHERE articuloId =:id")
   suspend fun findById (id : Int): ArticuloEntity

}