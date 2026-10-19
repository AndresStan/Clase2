package org.ieschomon.pruebaexamen2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.ieschomon.pruebaexamen2.databinding.ActivityLoginBinding

class login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.login.setText("Porfavor, inicia sesion")

        binding.loginButton.setOnClickListener {

            val usuario = binding.usuario.text
            val contraseña = binding.contraseA.text



            if (usuario?.isEmpty() == true || (contraseña?.isEmpty() == true)){
                binding.login.setText("Porfavor, asegurate de rellenar todos los campos")

            } else if (usuario.toString() != "Andres" || contraseña.toString() != "1234") {
                binding.login.setText("Usuario o contraseña incorrectas")
            } else if (usuario.toString() == "Andres" && contraseña.toString() == "1234") {
                var intent = Intent(this, MainActivity::class.java)
                intent.putExtra("usuario", usuario.toString())

                startActivity(intent)
            }



        }

    }
}