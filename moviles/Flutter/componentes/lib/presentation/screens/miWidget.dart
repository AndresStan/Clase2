import 'dart:io';

import 'package:flutter/material.dart';
import 'package:animate_do/animate_do.dart';

// Mi widget ValueListenableBuilder
// Es un widget que se queda esperando a escuchar lo que le enviemos


// Creamos una pantalla normal de las que no se recargan solas 
class MiWidget extends StatelessWidget {
  // Esta es una caja que guarda un número (empieza en 0) y avisa a la app cada vez que el número cambia
  final ValueNotifier<int> contadorClics = ValueNotifier<int>(0);

  MiWidget({super.key});

  @override
  Widget build(BuildContext context) {

    final colors = Theme.of(context).colorScheme;
    
    return Scaffold(
      // La barra superior de la aplicación, de color azul y con título
      appBar: AppBar(
        title: const Text("Mi Widget"),
        foregroundColor: Colors.white,
        backgroundColor: colors.primary,
      ),

      // Centramos todo el contenido en el medio de la pantalla
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment
              .center, // Centra los elementos de arriba a abajo
          children: [
            // Este widget se queda "escuchando" a la caja del contador de clics
            ValueListenableBuilder(
              valueListenable:
                  contadorClics, // Le decimos qué caja tiene que vigilar
              builder: (context, valor, child) {
                if (valor == 0) {
                  return const SizedBox(height: 150, width: 150);
                } else {
                  // Cada vez que el número cambia, el builder vuelve a dibujar este trozo de código:
                  return BounceIn(
                    // al meterle el número de clics aquí, Flutter cree que es una imagen nueva y repite el rebote
                    key: ValueKey(valor),

                    duration: const Duration(milliseconds: 8000),

                    child: Image.asset(
                      'assets/ikerPacoSanz.jpg',
                      height: 150,
                      width: 150,
                    ),
                  );
                }
              },
            ),

            // Dejamos un espacio de 40 píxeles entre la imagen y el botón para que respiren
            const SizedBox(height: 40),

            // El botón físico que el usuario va a pulsar en la pantalla
            ElevatedButton(
              onPressed: () {
                // Al pulsar el botón, le sumamos 1 al número de la caja. Esto hace que el Builder se entere y reactive el rebote.
                contadorClics.value++;
              },
              // El texto que se va a leer dentro del botón
              child: const Text('activar'),
            ),
          ],
        ),
      ),
    );
  }
}
