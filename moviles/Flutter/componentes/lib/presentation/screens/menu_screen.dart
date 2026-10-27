import 'package:componentes/models/menu_option.dart';
import 'package:componentes/theme/app_theme.dart';
import 'package:flutter/material.dart';



class MenuScreen extends StatelessWidget {
   
  const MenuScreen({super.key});
  
  @override
  Widget build(BuildContext context) {

    final menuOptions = <MenuOption>[
      MenuOption(ruta: "listview1", icono: Icons.list_alt, nombre: "ListView Tipo 1"),
      MenuOption(ruta: "listview2", icono: Icons.ac_unit, nombre: "ListView Tipo 2"),
      MenuOption(ruta: "alert", icono: Icons.zoom_out_sharp, nombre: "Alert ventana"),
      MenuOption(ruta: "card", icono: Icons.credit_card, nombre: "Card ventana")
 
    ];


    return Scaffold(
      appBar: AppBar(
        title: Text("Componentes en Flutter"),
      ),
      body: ListView.separated(
        
        itemBuilder: (context, i) => ListTile(
          leading: Icon(Icons.abc),
          title: Text(menuOptions[i].nombre),
          onTap: () {
            /*
            final route = MaterialPageRoute(
              builder: (context) => Listview2Screen(),
              );
              */
            Navigator.pushNamed(context, menuOptions[i].ruta);
          },
          trailing: Icon(Icons.forward, color: AppTheme.primary)
        ),
        separatorBuilder: (_, _) => Divider(), 
        itemCount: menuOptions.length
      ),
    );
  }
}