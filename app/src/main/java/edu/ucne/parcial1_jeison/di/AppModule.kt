package edu.ucne.parcial1_jeison.di

import android.content.Context
import androidx.room.Room
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import edu.ucne.parcial1_jeison.data.ArticuloDb
import edu.ucne.parcial1_jeison.data.remote.PrestamoApi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun ProvideExamenBd(@ApplicationContext context: Context): ArticuloDb {
        val DATABASE_NAME = "examenBd"
        return Room.databaseBuilder(
            context,
            ArticuloDb::class.java,
            DATABASE_NAME
        )
            .fallbackToDestructiveMigration()
            .build()
    }
    @Singleton
    @Provides
    fun providesMoshi(): Moshi{
         return Moshi
             .Builder()
             .add(KotlinJsonAdapterFactory())
             .build()
    }
    @Singleton
    @Provides
    fun providesPrestamoApi( moshi : Moshi): PrestamoApi {
        return Retrofit.Builder()
            .baseUrl("https://gestioninventario.azurewebsites.net/")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
            .create(PrestamoApi::class.java)
    }

}