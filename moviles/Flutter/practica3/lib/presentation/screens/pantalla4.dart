import 'package:flutter/material.dart';
import 'package:practica3/models/MenuOption.dart';


class Pantalla4 extends StatelessWidget {

  
  @override
  Widget build(BuildContext context) {

     final menuOptiones = <MenuOption>[
      MenuOption(ruta: "pantalla3", icono: Icons.zoom_out_sharp, nombre: "Pantalla 3"),
      MenuOption(ruta: "pantalla5", icono: Icons.account_balance_wallet_outlined, nombre: "Pantalla 5"),
    ];


    return Scaffold(
      appBar: AppBar(
        title: Text("Pantalla 4"),
        backgroundColor: (const Color.fromARGB(255, 46, 207, 54)),
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