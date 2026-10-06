package org.iesch.practica1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.iesch.practica1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val usuario = intent.getStringExtra("usuario")

        binding.mainBuenosDiasText.text = ("Hola, " + (usuario)?.ifEmpty {"Usuario Sin nombre" })

        binding.cardEdadCanina.setOnClickListener {
            startActivity(Intent(this, dogAgekt::class.java))
        }

        binding.cardSuperHeroes.setOnClickListener {
            startActivity(Intent(this, MainActivity_superheroes::class.java))
        }

        binding.cardQuizzes.setOnClickListener {
            startActivity(Intent(this, quizz::class.java))
        }
    }
}
