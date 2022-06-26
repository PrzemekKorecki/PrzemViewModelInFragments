package com.example.przemviewmodelinfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frag1 = ScrollingFragment()
        val frag2 = ScrollingFragment2()
        val frag3 = ScrollingFragment3()

        supportFragmentManager.beginTransaction().apply {
            add(R.id.fragmentContainer1, frag1)
            add(R.id.fragmentContainer2, frag2)
            add(R.id.fragmentContainer3, frag3)
            commit()
        }
    }
}