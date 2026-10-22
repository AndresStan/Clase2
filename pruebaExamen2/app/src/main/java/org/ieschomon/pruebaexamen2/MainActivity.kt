package org.ieschomon.pruebaexamen2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.ieschomon.pruebaexamen2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var saludoDefecto = ""
    var bundle = bundleOf()
    var textoprodefecto = "Elije una caja ahora"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        bundle = intent.extras!!
        saludoDefecto = "Bienvenido a mi app, " + bundle.getString("usuario")

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        binding.SaludoPrograma.setText(saludoDefecto)
        binding.textoPro.setText(textoprodefecto)

        binding.imagencard0.setOnClickListener {
            binding.textoPro.setText("Has tocado la primera caja estas loco")
        }

        binding.imagencard1.setOnClickListener {
            binding.textoPro.setText("Has tocado la segunda caja estas loco")
        }

        binding.imagencard2.setOnClickListener {
            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("tellevas", binding.tellevas.text.toString().ifEmpty { "No te has llevado nada" })
            intent.putExtra("usuario", bundle.getString("usuario"))

            startActivity(intent)
        }

        binding.imagencard3.setOnClickListener {
            binding.textoPro.setText("Has tocado la cuarta caja estas loco")
        }





    }

    var contador = 0;

    override fun onResume() {
        super.onResume()
        Log.i("MIIO", "ONRESUME")

        if (contador != 0){
            contador++
        } else{
            contador++;
        }



    }

}