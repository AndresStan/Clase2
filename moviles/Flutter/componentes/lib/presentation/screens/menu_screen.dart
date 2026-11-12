import 'package:componentes/models/menu_option.dart';
import 'package:flutter/material.dart';



class MenuScreen extends StatelessWidget {
   
  const MenuScreen({super.key});
  
  @override
  Widget build(BuildContext context) {


    // Acceder a los parametros del tema
    final colors = Theme.of(context).colorScheme;

    final menuOptions = <MenuOption>[
      MenuOption(ruta: "buttons", icono: Icons.radio_button_on_rounded, nombre: "Botones"),
      MenuOption(ruta: "listview1", icono: Icons.list_alt, nombre: "ListView Tipo 1"),
      MenuOption(ruta: "listview2", icono: Icons.ac_unit, nombre: "ListView Tipo 2"),
      MenuOption(ruta: "alert", icono: Icons.window, nombre: "Ventanas"),
      MenuOption(ruta: "card", icono: Icons.credit_card, nombre: "Cards"),
      MenuOption(ruta: "miWidget", icono: Icons.face, nombre: "Mi Widget"),
      MenuOption(ruta: "slider", icono: Icons.slideshow_sharp, nombre: "Sliders && Checks"),
      MenuOption(ruta: "snackbarscreen", icono: Icons.snapchat_outlined, nombre: "SnackBar Screen"),
      MenuOption(ruta: "animatedscreen", icono: Icons.headset_off, nombre: "Animated Screen"),
      MenuOption(ruta: "formularioscreen", icono: Icons.nfc_sharp, nombre: "Formulario Screen"),
    ];


    return Scaffold(
      appBar: AppBar(
        title: Text("Componentes en Flutter"),
        foregroundColor: Colors.white,
        backgroundColor: colors.primary,
      ),
      body: ListView.separated(
        
        itemBuilder: (context, i) => ListTile(
          leading: Icon(menuOptions[i].icono),
          title: Text(menuOptions[i].nombre),
          onTap: () {
            /*
            final route = MaterialPageRoute(
              builder: (context) => Listview2Screen(),
              );
              */
            Navigator.pushNamed(context, menuOptions[i].ruta);
          },
          trailing: Icon(Icons.forward, color: colors.primary)
        ),
        separatorBuilder: (_, _) => Divider(), 
        itemCount: menuOptions.length
      ),
    );
  }
}