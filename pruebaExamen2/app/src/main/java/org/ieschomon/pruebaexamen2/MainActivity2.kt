package org.ieschomon.pruebaexamen2

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.ieschomon.pruebaexamen2.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding;
    var contador = 1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        val bundle = intent.extras!!
        binding.algo.setText(bundle.getString("tellevas"))

        binding.button.setText("Volver al menu principal")
        binding.button.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            intent.putExtra("usuario", bundle.getString("usuario"))
            intent.putExtra("ultimaCosa", bundle.getString("tellevas"))
            startActivity(intent)
        }

    }

    override fun onResume() {
        super.onResume()
        if (contador != 1){
            contador++
        } else {
            contador++
        }
    }


}