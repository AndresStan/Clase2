package org.iesch.superheroes

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.media.Image
import android.os.Bundle
import android.os.Environment
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import androidx.core.graphics.drawable.toBitmap
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.iesch.superheroes.databinding.ActivityMainBinding
import org.iesch.superheroes.model.SuperHeroe
import java.io.File

class MainActivity : AppCompatActivity() {

    // 1 - Creamos la variable lateinit porque la vamos a inicializar luego
    private lateinit var binding: ActivityMainBinding
    // 1 - Creamos una variable que va a manejar el resultado de hacer la foto
    private lateinit var heroImage: ImageView
    private var heroBitMap: Bitmap? = null

    // 1 - Hay que cambiar el metodo takepicturesPreview por takePictures
    private var picturePath = ""

    private val getContent = registerForActivityResult(
        ActivityResultContracts.TakePicture()){
       // Ahora en lugar de un bitmap nos va a devolver un booleano, si la foto es exitosa o no
        success ->
            if (success && picturePath.isNotEmpty() ){
                // Cualquier imagen del directorio la podemos convertir a bitmap
                heroBitMap = BitmapFactory.decodeFile(picturePath)
                // Mostramos la imagen en el cuadradito
                heroImage.setImageBitmap(heroBitMap)
            }
    }




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

        // 2 Linkeamos el elemento con abrir la cámara
        heroImage = binding.heroImage
        binding.heroImage.setOnClickListener {
            abrirCamara()
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



            irADetailActivity(superHeroe)
        }

    }

    fun abrirCamara() {
        // Aqui debemos craer un path temporal para guardar esa imagen que acabamos de captar
        val imageFile = crearImagenFile()

        // Ahora ya tenemos el archivo de tipo file pero lo que necesitamos es el uri
        // Sera a traves del FileProvider
        // FileProvider lo que hace es compartir el file con otras aplicaciones de forma segura
        val uri = FileProvider.getUriForFile(this, "${applicationContext.packageName}.provider", imageFile)
            getContent.launch(uri)
    }

    private fun crearImagenFile() : File {
        // Esta funcion crea un objeto tipo file y de ese file recuperaremos la uri
        val fileName = "superhero_Image"
        // Esto sera el directorio donde vamos a almacenar la imagen.. por defecto es DIRECTORY_PICTURES
        val fileDirectory = getExternalFilesDir(Environment.DIRECTORY_PICTURES)

        // Creamos nuestro file, aqui nos pide el nombre, el formato y el directorio
        val imageFile = File.createTempFile(fileName, ".jpg", fileDirectory)
        // Ahora ya podemos guardar la ruta (path) en la variable global
        picturePath=imageFile.absolutePath;
        return imageFile
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
        // Añado la imagen
        intent.putExtra("path_heroe", picturePath)

        // Iniciamos la nueva actividad
        startActivity(intent)
    }



}