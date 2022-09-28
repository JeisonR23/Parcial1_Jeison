package edu.ucne.parcial1_jeison.data

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.ucne.parcial1_jeison.data.dao.ArticuloDao
import edu.ucne.parcial1_jeison.model.Articulo

@Database(
    entities = [Articulo::class],
    exportSchema = false,
    version = 2

)
abstract class ArticuloBd: RoomDatabase() {
    abstract  val articuloDao : ArticuloDao
}


