package com.sim.fakenamesgenerator

import androidx.lifecycle.ViewModel
import java.util.*

/**
 * Created by Syed Asim Ali on 10-Nov-18.
 */
class MainViewModel constructor(private val repository: FakeNamesRepository) : ViewModel() {

    var selectedName: String = "---"

    private val fakeNamePoolSize = repository.fakeNamePool().size

    fun getNewFakeName(): String {

        selectedName = repository.fakeNamePool()[Random().nextInt(fakeNamePoolSize)]

        return selectedName
    }

}


