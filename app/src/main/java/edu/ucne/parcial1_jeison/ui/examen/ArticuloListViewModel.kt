package edu.ucne.parcial1_jeison.ui.examen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.ucne.parcial1_jeison.model.Articulo
import javax.inject.Inject

data class ExamenListUiState(
   val examenList: List<Articulo> = emptyList()
)

@HiltViewModel
class ExamenListViewModel @Inject constructor(
 //  val repository: ExamenRepository
) : ViewModel() {
 /*
    var examen = repository.find()
    var uiState by mutableStateOf(ExamenListUiState())
        private set

    init {
        viewModelScope.launch {
            repository.getList().collect() { list ->
                uiState = uiState.copy(ExamenList = list)
            }
        }
    }*/

}