package org.ieschomon.pruebaexamen2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.ieschomon.pruebaexamen2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val bundle = intent.extras!!

        binding.SaludoPrograma.setText( "Bienvenido a mi app, " + bundle.getString("usuario"))
        binding.textoPro.setText("Elije una caja random")

        binding.imagencard0.setOnClickListener {
            binding.textoPro.setText("Has tocado la primera caja estas loco")
        }

        binding.imagencard1.setOnClickListener {
            binding.textoPro.setText("Has tocado la segunda caja estas loco")
        }

        binding.imagencard2.setOnClickListener {
            binding.textoPro.setText("Has tocado la tercera caja estas loco")
        }

        binding.imagencard3.setOnClickListener {
            binding.textoPro.setText("Has tocado la cuarta caja estas loco")
        }





    }
}