package com.yml.pocwithnetworklib.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yml.pocwithnetworklib.presentation.fragment.UniversityListFragment
import com.yml.pocwithnetworklib.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container, UniversityListFragment.getInstance())
            .commit()
    }
}