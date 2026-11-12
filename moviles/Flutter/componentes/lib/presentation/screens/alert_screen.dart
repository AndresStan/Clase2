import 'package:componentes/theme/app_theme.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class AlertScreen extends StatelessWidget {
  const AlertScreen({super.key});

  void mostrarAlerta(BuildContext context) {
    showAdaptiveDialog(
      barrierDismissible: true, // Al clicear fuera sales de la alert si/no
      context: context,
      builder: (context) {
        return AlertDialog(
          title: Text("Titulo de la alerta"),
          content: Column(
            mainAxisSize: .min,
            children: [
              Text("Data data data"),
              SizedBox(height: 20),
              FlutterLogo(size: 100,)
            ],
          ),
          actions: [
            TextButton(onPressed: () => Navigator.pop(context), child: Text("Cancelar", style: TextStyle(color: Colors.red),)),
            TextButton(onPressed: () => mostrarAlerta(context), child: Text("Mostrar"))
          ],
        );
      },
    );
  }

  @override
  Widget build(BuildContext context) {

    final colors = Theme.of(context).colorScheme;

    return Scaffold(
      appBar: AppBar(
        title: Text('Alertas'),
        backgroundColor: colors.primary,
        foregroundColor: Colors.white,
        ),
      body: Center(
        child: ElevatedButton(
          style: ElevatedButton.styleFrom(backgroundColor: AppTheme.primary),
          onPressed: () {mostrarAlerta(context);},
          child: Padding(
            padding: EdgeInsets.all(25),
            child: Text("Mostrar Alerta"),
          ),
        ),
      ),
    );
  }
}
