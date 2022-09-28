package edu.ucne.parcial1_jeison.ui.examen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.ucne.parcial1_jeison.data.repository.ArticuloRepository
import edu.ucne.parcial1_jeison.model.Articulo
import kotlinx.coroutines.launch
import javax.inject.Inject

data class ArticuloListUiState(
   val articuloList: List<Articulo> = emptyList()
)

@HiltViewModel
class ArticuloListViewModel @Inject constructor(
   val repository: ArticuloRepository
) : ViewModel() {

    var articulo = repository.find()

    var uiState by mutableStateOf(ArticuloListUiState())
        private set

    init {
        viewModelScope.launch {
            repository.find().collect() { list ->
                uiState = uiState.copy(articuloList = list)
            }
        }
    }

}