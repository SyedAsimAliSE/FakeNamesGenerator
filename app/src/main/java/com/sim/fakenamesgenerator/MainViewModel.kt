package com.sim.fakenamesgenerator

import androidx.lifecycle.ViewModel
import java.util.*

/**
 * Created by Syed Asim Ali on 10-Nov-18.
 */
class MainViewModel constructor(private val repository: FakeNamesRepository) : ViewModel() {

    private val fakeNamePoolSize = repository.fakeNamePool().size

    fun getNewFakeName() = repository.fakeNamePool()[Random().nextInt(fakeNamePoolSize)]

}

