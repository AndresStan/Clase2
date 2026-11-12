import 'package:flutter/material.dart';

class SnackBarScreen extends StatelessWidget {
  const SnackBarScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final colors = Theme.of(context).colorScheme;
    // Funcion personalizada
    void mostrarSnackBarPersonalizado(String texto) {
      ScaffoldMessenger.of(context).clearSnackBars();
      final snackbar = SnackBar(
        content: Text(texto),
        action: SnackBarAction(
          label: "Ok",
          onPressed: () {
            
          },
          ),
        duration: Duration(seconds: 2),
        backgroundColor: colors.primary,
      );
      ScaffoldMessenger.of(context).showSnackBar(snackbar);
    }

    return Scaffold(
      appBar: AppBar(title: Text("SnackBar"),
       backgroundColor: colors.primary,
       foregroundColor: Colors.white,
       ),

      floatingActionButton: FloatingActionButton.extended(
        icon: Icon(Icons.access_time_rounded),
        onPressed: () {
          mostrarSnackBarPersonalizado("Hola a Iker lozano Penero");
        },
        label: Text("Mostrar Snackbar"),
      ),
    );
  }
}
