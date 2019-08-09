package com.gaston.mvvmsimpleexample.domain

import com.gaston.mvvmsimpleexample.data.FrutasDataSet
import com.gaston.mvvmsimpleexample.ui.modelo.Frutas

/**
 * Created by Gastón Saillén on 09 August 2019
 */
class FrutasUseCase {

    private val frutasDataSet = FrutasDataSet()

    fun obtenerListaDeFrutas():List<Frutas>{
        return frutasDataSet.crearListaDeFrutas()
    }
}