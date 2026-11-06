import 'package:flutter/material.dart';
import 'package:practica3/models/MenuOption.dart';


class Pantalla5 extends StatelessWidget {

  @override
  Widget build(BuildContext context) {

    final menuOptions = <MenuOption>[
      MenuOption(ruta: "pantalla1", icono: Icons.add_shopping_cart_sharp, nombre: "Pantalla 1"),
      MenuOption(ruta: "pantalla2", icono: Icons.abc, nombre: "Pantalla 2"),
      MenuOption(ruta: "pantalla4", icono: Icons.screenshot, nombre: "Pantalla 3"),
      MenuOption(ruta: "pantalla1", icono: Icons.exit_to_app, nombre: "Volver a pantalla Principal")
    ];

    return Scaffold(
      appBar: AppBar(
        title: Text("Pantalla 5"),
        backgroundColor: const Color.fromARGB(255, 182, 187, 218),
      ),
      body: ListView.separated(
        itemBuilder: (context, index) => ListTile(
          title: Text(menuOptions[index].nombre),
          leading: Icon(menuOptions[index].icono, color: const Color.fromARGB(255, 71, 199, 46),),
          onTap: () {
            if (menuOptions[index].nombre == "Volver a pantalla Principal") {
              Navigator.pushNamedAndRemoveUntil(context, menuOptions[index].ruta, (route) => false);
            } else {
                Navigator.pushNamed(context, menuOptions[index].ruta);
            }
           
          },
        ),
        separatorBuilder: (_, _) => Divider(),
        itemCount: menuOptions.length
     ),
   );
  }
}