package com.sim.fakenamesgenerator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Syed Asim Ali on 10-Nov-18.
 *
 *  DI is not used in the project for the sake of the simplicity
 *
 */
class MainActivity : AppCompatActivity() {

    private lateinit var viewModelFactory: MyViewModelFactory
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModelFactory = MyViewModelFactory(FakeNamesRepository())

        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)

        initView()

    }

    private fun initView() {

        txtResult.text = viewModel.selectedName

        btnGenName.setOnClickListener {
            txtResult.text = viewModel.getNewFakeName()
        }

    }

}
