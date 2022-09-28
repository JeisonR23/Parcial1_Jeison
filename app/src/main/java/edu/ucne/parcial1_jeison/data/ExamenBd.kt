package edu.ucne.parcial1_jeison.data

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.ucne.parcial1_jeison.model.Articulo

@Database(
    entities = [Articulo::class],
    exportSchema = false,
    version = 1

)
abstract class ExamenBd: RoomDatabase() {

}

