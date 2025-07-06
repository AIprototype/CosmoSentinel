package com.cosmosentinel.nearEarthObjects.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cosmosentinel.nearEarthObjects.domain.NearEarthObjectRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class NearEarthObjectViewModel(
    private val repository: NearEarthObjectRepository
) : ViewModel() {

    private val _state = MutableStateFlow(emptyList<String>())
    val state = _state.asStateFlow()

    init {
        viewModelScope.launch {
            val neo = repository.getNearEarthObjects()
            _state.update { neo }
        }
    }

}
