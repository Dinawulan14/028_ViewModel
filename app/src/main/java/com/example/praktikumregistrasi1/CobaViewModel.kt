package com.example.praktikumregistrasi1

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.praktikumregistrasi1.Data.DataForm
import com.example.praktikumregistrasi1.Data.DataSource.status
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel() {
    var namaUsr: String by mutableStateOf("")//revised
    private set
    var noTlp: String by mutableStateOf("")
        private set
    var jenisKl: String by mutableStateOf("")
        private set
    var alamat: String by mutableStateOf("")
        private set

    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun insertData(nm: String, tlp: String, almt: String, jk:String, ){
        namaUsr = nm;
        noTlp = tlp;
        alamat= almt;
        jenisKl = jk;

    }

    fun setJenis(pilihJK: String) {
        _uiState.update{ currentState -> currentState.copy(sex = pilihJK) }
    }
    fun setStatus(pilihStatus: String) {
        _uiState.update { currentState -> currentState.copy(sex = pilihStatus) }
    }
}