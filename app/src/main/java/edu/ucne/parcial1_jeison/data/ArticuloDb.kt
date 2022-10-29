package edu.ucne.parcial1_jeison.data

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.ucne.parcial1_jeison.data.dao.ArticuloDao
import edu.ucne.parcial1_jeison.model.ArticuloEntity

@Database(
    entities = [ArticuloEntity::class],
    exportSchema = false,
    version = 2

)
abstract class ArticuloDb: RoomDatabase() {
    abstract  val articuloDao : ArticuloDao
}


