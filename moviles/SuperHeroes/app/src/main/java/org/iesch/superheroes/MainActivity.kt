package org.iesch.superheroes

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.iesch.superheroes.databinding.ActivityMainBinding
import org.iesch.superheroes.model.SuperHeroe

class MainActivity : AppCompatActivity() {

    // 1 - Creamos la variable lateinit porque la vamos a inicializar luego
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // 2 - Inicializamos el binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        // 3 - Usamos el binding para inflar la vista
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // A partir de aqui introduzco el codigo necesario

        // val botonGuardar = findViewById<Button>(R.id.buttonGuardar)
        binding.buttonGuardar.setOnClickListener {
            // Obtenemos los valore al momento de hacer click



            val superHeroName = binding.heroNameEdit.text.toString()
            val alterEgo = binding.alterEgoEdit.text.toString()
            val bio = binding.ResumenBiografiaText.text.toString()
            val power = binding.miRatingBar.rating

            // 2 - Me creo el objeto superHeroe
            val superHeroe = SuperHeroe(superHeroName, alterEgo, bio, power)

            // Que quiero hacaer cuando pulso el boton guardar
            irADetailActivity(superHeroe)
        }

    }

    fun irADetailActivity(superHeroe: SuperHeroe) {
       // Creamos el objeto intent
        var intent = Intent(this, DetailActivity::class.java)

        // Añadimos todos los campos con el metodo putExtra
        // intent.putExtra("superHeroName", superHeroName)
        // intent.putExtra("alterEgo", alterEgo)
        // intent.putExtra("bio", bio)
        // intent.putExtra("power", power)

        intent.putExtra("superheroe", superHeroe)
        // De esta manera todos los campos se enviaran a DetailActivity

        // Iniciamos la nueva actividad
        startActivity(intent)
    }



}