import 'package:flutter/material.dart';
import 'package:practica3/models/MenuOption.dart';


class Pantalla2 extends StatelessWidget {

  @override
  Widget build(BuildContext context) {

     final menuOptiones = <MenuOption>[
      MenuOption(ruta: "pantalla5", icono: Icons.apartment_sharp, nombre: "Pantalla 5"),
    ];


    return Scaffold(
      appBar: AppBar(
        title: Text("Pantalla 2"),
        backgroundColor: (Colors.lightBlue),
      ),
      body: ListView.separated(
        itemBuilder: (context, index) => ListTile(
          title: Text(menuOptiones[index].nombre),
          onTap: () {
            Navigator.pushNamed(context, menuOptiones[index].ruta);
          },
          leading: Icon(menuOptiones[index].icono, color: Colors.blue),
        ),
        separatorBuilder: (_, _) => Divider(),
        itemCount: menuOptiones.length,
     ),
   );
  }
}