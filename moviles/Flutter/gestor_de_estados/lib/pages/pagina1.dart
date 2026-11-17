import 'package:flutter/material.dart';
import 'package:gestor_de_estados/provider/contador_provider.dart';
import 'package:provider/provider.dart';

class Pagina1 extends StatelessWidget {
  const new({super.key});

  @override
  Widget build(BuildContext context) {


  
    return Container(
      color: Colors.redAccent,
      child: Center(
        child: Column(
          children: [
            Text(context.watch<ContadorProvider>().contador.toString(), style: TextStyle(fontSize: 120) ,),
            ElevatedButton(
            onPressed: () {
              // Aqui vamos a acceder al provider y llamar a la funcion incrementar 
              context.read<ContadorProvider>().incrementar();
            }, 
            child: Text("Incrementar")
          ),
           ElevatedButton(
            onPressed: () {
              // Aqui vamos a acceder al provider y llamar a la funcion incrementar 
              context.read<ContadorProvider>().decrementar();
            }, 
            child: Text("Decrementar")
          )
         ],
         
        ),
      ),
    );
  }
}