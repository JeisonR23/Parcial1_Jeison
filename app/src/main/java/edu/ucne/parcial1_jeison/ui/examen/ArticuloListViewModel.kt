package edu.ucne.parcial1_jeison.ui.examen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.ucne.parcial1_jeison.data.remote.dto.ArticuloDto
import edu.ucne.parcial1_jeison.data.repository.ArticuloRepository
import edu.ucne.parcial1_jeison.model.ArticuloEntity
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class ArticuloListUiState(
    val articuloEntityList: List<ArticuloEntity> = emptyList()
)

@HiltViewModel
class ArticuloListViewModel @Inject constructor(
    val repository: ArticuloRepository
) : ViewModel() {

     var articulo = repository.find()


    var uiState = MutableStateFlow(ArticuloListUiState())
        private set

    init {
        viewModelScope.launch {
            repository.getArticulos().collect() { list ->
                uiState = uiState.copy(articulo = list)
            }
        }

    }


}