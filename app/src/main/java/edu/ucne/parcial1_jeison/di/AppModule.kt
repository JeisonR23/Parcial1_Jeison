package edu.ucne.parcial1_jeison.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import edu.ucne.parcial1_jeison.data.ExamenBd
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun ProvideExamenBd(@ApplicationContext context: Context): ExamenBd {
        val DATABASE_NAME = "examenBd"
        return Room.databaseBuilder(
            context,
            ExamenBd::class.java,
            DATABASE_NAME       )
            .fallbackToDestructiveMigration()
            .build()
    }


}