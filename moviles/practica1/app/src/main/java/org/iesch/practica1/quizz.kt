package org.iesch.practica1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.iesch.practica1.databinding.ActivityQuizzBinding

class quizz : AppCompatActivity() {

    private lateinit var binding: ActivityQuizzBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityQuizzBinding.inflate(layoutInflater)
        setContentView(binding.root)





        var arrayProgressText = arrayOf("1/3", "2/3", "3/3")

        var arrayPreguntaActual = arrayOf(
            "¿Que valor tiene Y en esta situación?",
            "¿Que valor tiene X en esta situación?",
            "¿Que valor tiene Z en esta situación?"
        )
        var arrayPreguntaActualExtra = arrayOf(
            "10 y = 70",
            "20 x = 10",
            "30 z = 150"
        )

        var arrayOpcion1 = arrayOf(
            "y = 7",
            "x = 1",
            "z = 15"
        )

        var arrayOpcion2 = arrayOf(
            "y = 70",
            "x = 0.5",
            "z = 5"
        )

        // Inicializamos con valores por defecto
        binding.progressText.text = arrayProgressText[0]
        binding.barraProgreso.progress = 33
        binding.opcion1.text = arrayOpcion1[0]
        binding.opcion2.text = arrayOpcion2[0]
        binding.preguntaActual.text = arrayPreguntaActual[0]
        binding.preguntaActualExtra.text = arrayPreguntaActualExtra[0]


        // Logica radioButton
        var preguntaActual = 1;
        var opcionEscogida = 0


        binding.radioGroup.setOnCheckedChangeListener { group, i ->

            when(i){
                binding.opcion1.id -> {
                    Toast.makeText(this, "Seleccionaste Opción 1", Toast.LENGTH_SHORT).show()
                    opcionEscogida = 1;
                }
                binding.opcion2.id -> {
                    Toast.makeText(this, "Seleccionaste Opción 2", Toast.LENGTH_SHORT).show()
                    opcionEscogida = 2;
                }
            }


        }


        // Logica QUIZZ

        binding.buttonSiguiente.setOnClickListener {

            if (preguntaActual == 1) {

                if (opcionEscogida == 0) {
                    Toast.makeText(this, "Porfavor Selecciona una opccion", Toast.LENGTH_SHORT).show()

                } else {
                    if (opcionEscogida == 1) {

                    }
                    if (opcionEscogida == 2) {

                    }
                }

            }


        }


    }




}