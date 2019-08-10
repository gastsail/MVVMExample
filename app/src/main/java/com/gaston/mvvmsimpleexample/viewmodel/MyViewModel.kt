package com.gaston.mvvmsimpleexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gaston.mvvmsimpleexample.domain.FrutasUseCase
import com.gaston.mvvmsimpleexample.ui.modelo.Frutas

/**
 * Created by Gastón Saillén on 09 August 2019
 */
class MyViewModel(val frutasUseCase: FrutasUseCase):ViewModel() {

    private val listData = MutableLiveData<List<Frutas>>()

    fun setListData(listaFrutas:List<Frutas>){
        listData.value = listaFrutas
    }

    //Podemos usar corutinas para pedir informacion que sea asyncrona
    fun getListaFrutas(){
        setListData(frutasUseCase.obtenerListaDeFrutas())
    }

    fun getListaFrutasLiveData():LiveData<List<Frutas>>{
        return listData
    }

}