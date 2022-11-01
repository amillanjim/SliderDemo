package com.example.sliderdemo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentManager = supportFragmentManager

        val buttonDialogFragment = findViewById<MaterialButton>(R.id.buttonDialogFragment)
        buttonDialogFragment.setOnClickListener{ loadDialogFragment() }

        val buttonFragment = findViewById<MaterialButton>(R.id.buttonFragment)
        buttonFragment.setOnClickListener{
            buttonFragment.visibility = View.GONE
            buttonDialogFragment.visibility = View.GONE
            loadFragment()
        }

    }

    private fun loadDialogFragment(){
        val tutorialDialogFragment = TutorialDialogFragment()
        tutorialDialogFragment.show(fragmentManager, "fragment_tutorial")
    }

    private fun loadFragment(){
        val fragmentTransaction = fragmentManager.beginTransaction()
        val tutorialFragment = TutorialFragment()
        fragmentTransaction.replace(R.id.fragment_container, tutorialFragment).commit()
    }
}