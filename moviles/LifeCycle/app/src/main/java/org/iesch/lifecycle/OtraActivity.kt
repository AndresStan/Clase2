package org.iesch.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OtraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_otra)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val boton = findViewById<Button>(R.id.iramainactivitybutton)
        boton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        Log.w("CICLOVIDA", "Entramos en el metodo onCreate()")

    }


    override fun onStart() {
        super.onStart()
        Log.w("CICLOVIDA", "Entramos en el metodo onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.w("CICLOVIDA", "Entramos en el metodo onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.w("CICLOVIDA", "Entramos en el metodo onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.w("CICLOVIDA", "Entramos en el metodo onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("CICLOVIDA", "Entramos en el metodo onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("CICLOVIDA", "Entramos en el metodo onDestroy()")
    }
}