package com.example.viewmodelproject.views

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainGuiViewModel : ViewModel() { // Removido o underscore para seguir a convenção de nomenclatura
    private val _contador: MutableLiveData<Int> = MutableLiveData(0)
    val contador: LiveData<Int> get() = _contador // Use getter para encapsular

    fun incrementarContador() {
        Log.i("MainGuiViewModel", "Incrementar Contador: ${_contador.value}")
        _contador.value = (_contador.value ?: 0) + 1 // Simplificado com Elvis operator
    }
}
