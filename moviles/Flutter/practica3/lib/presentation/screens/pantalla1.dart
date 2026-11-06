import 'package:flutter/material.dart';
import 'package:practica3/models/MenuOption.dart';


class Pantalla1 extends StatelessWidget {

  

  @override
  Widget build(BuildContext context) {

    final menuOptiones = <MenuOption>[
      MenuOption(ruta: "pantalla3", icono: Icons.accessible_forward, nombre: "Pantalla 3"),
      MenuOption(ruta: "pantalla4", icono: Icons.access_alarm_sharp, nombre: "Pantalla 4")
    ];

    return Scaffold(
      appBar: AppBar(
        title: Text("Pantalla 1"),
        backgroundColor: (Colors.amber),
      ),
      body: ListView.separated(
        itemBuilder: (context, index) => ListTile(
          title: Text(menuOptiones[index].nombre),
          leading: Icon(menuOptiones[index].icono, color: const Color.fromARGB(255, 81, 7, 255),),
          onTap: () {
            Navigator.pushNamed(context, menuOptiones[index].ruta);
          },
          

        ),
        separatorBuilder: (_,_) => Divider(),
        itemCount: menuOptiones.length,
     ),
   );
  }
}