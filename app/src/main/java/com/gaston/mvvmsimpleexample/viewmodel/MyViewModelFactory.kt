package com.gaston.mvvmsimpleexample.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gaston.mvvmsimpleexample.domain.FrutasUseCase

/**
 * Created by Gastón Saillén on 10 August 2019
 */
class MyViewModelFactory(val frutasUseCase: FrutasUseCase):ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(FrutasUseCase::class.java).newInstance(frutasUseCase)
    }
}