package org.iesch.practica1

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.iesch.practica1.R
import org.iesch.practica1.databinding.ActivityDetailSuperheroesBinding
import org.iesch.superheroes.model.SuperHeroe

class DetailActivity_superheroes : AppCompatActivity() {

    private lateinit var binding: ActivityDetailSuperheroesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDetailSuperheroesBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // 1 - Recibimos el Objeto SuperHeroe del intent
        val superHeroe = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            // Para versiones sdk 33 o superiores
            intent.getParcelableExtra("superheroe", SuperHeroe::class.java)
        } else {
            // Para versiones menores a 33
            intent.getParcelableExtra<SuperHeroe>("superheroe")
        }

        //Recibimos los datos del main acitivity
        val bundle = intent.extras!!
        // val bitmap = bundle.getParcelable<Bitmap>("foto_heroe")
        val bitmapDirectory = bundle.getString("path_heroe")
        val bitmap = BitmapFactory.decodeFile(bitmapDirectory)
        // val superHeroName = bundle.getString("superHeroName") ?: "Nombre no Encontrado"
        // val alterEgo = bundle.getString("alterEgo") ?: "Alter Ego no Encontrado"
        // val bio = bundle.getString("bio") ?: "Bio no Encontrada"
        // val power = bundle.getFloat("power")

        // Rellenamos los campos con los valores recibidos
        binding.heroNameTv.text = superHeroe?.nombre ?: "No hay nombre"
        binding.alterEgoResult.text = superHeroe?.alterEgo ?: "No hay alterEgo"
        binding.bioResult.text = superHeroe?.bio ?: "No hay bio"
        binding.ratingBarInmovible.rating = superHeroe?.power ?: 0f

        // Asigno la imagen a la imageView
        binding.imageView.setImageBitmap(bitmap)




    }
}