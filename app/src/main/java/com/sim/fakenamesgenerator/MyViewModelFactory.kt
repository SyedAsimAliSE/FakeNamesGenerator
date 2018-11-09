package com.sim.fakenamesgenerator

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


/**
 * Created by Syed Asim Ali on 10-Nov-18.
 */
@Suppress("UNCHECKED_CAST")
class MyViewModelFactory(private val fakeNamesRepository: FakeNamesRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(fakeNamesRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
