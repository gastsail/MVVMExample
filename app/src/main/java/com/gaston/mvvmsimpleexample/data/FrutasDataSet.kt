package com.gaston.mvvmsimpleexample.data

import com.gaston.mvvmsimpleexample.ui.modelo.Frutas

/**
 * Created by Gastón Saillén on 09 August 2019
 */
class FrutasDataSet {

    fun crearListaDeFrutas(): List<Frutas> {
        return listOf(
            Frutas("Manzana", "Rojo", 4.5F, 250.3F),
            Frutas("Banana","Amarillo",5.60F,200F),
            Frutas("Uvas","Verde",10.50F,100.5F))
    }
}