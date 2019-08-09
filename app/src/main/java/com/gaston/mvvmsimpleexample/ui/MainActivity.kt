package com.gaston.mvvmsimpleexample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.gaston.mvvmsimpleexample.R
import com.gaston.mvvmsimpleexample.ui.modelo.Frutas
import com.gaston.mvvmsimpleexample.viewmodel.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViewModelAndObserve()
        btnCrearListaFrutas.setOnClickListener {
            viewModel.getListaFrutas()
        }
    }

    fun setupViewModelAndObserve() {
        viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)
        val frutasObserver = Observer<List<Frutas>> {

            for (fruta in it) {
                Log.d("Frutas:", fruta.nombreFruta)
            }

            for ((index, value) in it.withIndex()) {
                Log.d("Frutas $index:", value.nombreFruta)
            }
        }
        viewModel.getListaFrutasLiveData().observe(this, frutasObserver)
    }
}