import 'package:flutter/material.dart';
import 'package:gestor_de_estados/provider/contador_provider.dart';
import 'package:provider/provider.dart';

class Pagina3 extends StatelessWidget {
  const new({super.key});

  @override
  Widget build(BuildContext context) {
    return Container(
      color: Colors.limeAccent,
      child: Center(
        
        child: Text("El contador de Pagina 1 marca: ${context.read<ContadorProvider>().contador}"),
      ),
    );
  }
}