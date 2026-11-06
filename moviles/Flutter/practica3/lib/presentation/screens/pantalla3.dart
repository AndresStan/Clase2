import 'package:flutter/material.dart';
import 'package:practica3/models/MenuOption.dart';


class Pantalla3 extends StatelessWidget {

  
  @override
  Widget build(BuildContext context) {

     final menuOptiones = <MenuOption>[
      MenuOption(ruta: "pantalla1", icono: Icons.local_see_outlined, nombre: "Pantalla 1"),
      MenuOption(ruta: "pantalla2", icono: Icons.add_card_outlined, nombre: "Pantalla 2"),
    ];


    return Scaffold(
      appBar: AppBar(
        title: Text("Pantalla 3"),
        backgroundColor: (const Color.fromARGB(255, 180, 73, 132)),
      ),
      body: ListView.separated(
        itemBuilder: (context, index) => ListTile(
          title: Text(menuOptiones[index].nombre),
          onTap: () {
            Navigator.pushNamed(context, menuOptiones[index].ruta);
          },
          leading: Icon(menuOptiones[index].icono, color: const Color.fromARGB(255, 243, 33, 33)),
        ),
        separatorBuilder: (_, _) => Divider(),
        itemCount: menuOptiones.length,
     ),
   );
  }
}