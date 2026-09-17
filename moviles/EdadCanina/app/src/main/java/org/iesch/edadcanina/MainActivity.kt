package org.iesch.edadcanina

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Aqui la pantalla esta creada

        // 1 - Tomamos el control de todos los elementos de la parte de la UI
        val textoRespuesta = findViewById<TextView>(R.id.textoRespuesta)
        val botonCalcular = findViewById<Button>(R.id.botonCalcular)
        val ageEdit = findViewById<EditText>(R.id.edit_edad)

        // 2 - Los botones tienen la propiedad setOnClickListener al pulsarlo
        botonCalcular.setOnClickListener {



            if (!ageEdit.text.toString().isEmpty()){
                val edadString = ageEdit.text.toString()
                val edadInt = edadString.toInt()*7
                textoRespuesta.text = getString(R.string.textoRespuesta, edadInt)
            } else {
                Toast.makeText(this, R.string.texto_toast, Toast.LENGTH_SHORT).show()
            }



        }
    }
}