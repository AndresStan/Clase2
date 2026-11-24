import 'package:flutter/material.dart';
import 'package:gestor_de_estados/provider/contador_provider.dart';
import 'package:gestor_de_estados/provider/theme_provider.dart';
import 'package:provider/provider.dart';

class Pagina3 extends StatelessWidget {
  const new({super.key});

  @override
  Widget build(BuildContext context) {
    return Container(
      child: Column(
        mainAxisAlignment: .center,
        children: [
          Center(child: Text("El contador de Pagina 1 marca: ${context.read<ContadorProvider>().contador}")),
          SizedBox(height: 30,),
          ElevatedButton(
            onPressed: () {
                context.read<ThemeProvider>().cambiarTema();
            }, 
            child: Text("Modo Light/Dark") 
            )
        ],
      ),
    );
  }
}