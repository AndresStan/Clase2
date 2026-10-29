import 'package:flutter/material.dart';

const listaColores = <Color>[
  Color.fromARGB(255, 11, 109, 190),
  Color.fromARGB(255, 167, 185, 199),
  Color.fromARGB(255, 212, 243, 33),
  Color.fromARGB(255, 243, 33, 96),
  Color.fromARGB(255, 243, 110, 33),
  Color.fromARGB(255, 145, 243, 33),
  Color.fromARGB(255, 68, 243, 33),
  Color.fromARGB(255, 96, 33, 243),
];

class AppTheme {
  final int colorSeleccionado;

  new({
      this.colorSeleccionado = 0
  }): assert(colorSeleccionado >= 0, 'El color seleccionado debe ser mayor o igual que 0'),
    assert(colorSeleccionado < listaColores.length-1, 'El color seleccionado debe ser valido');


  ThemeData getTheme() => ThemeData(
    useMaterial3: true,
    colorSchemeSeed: listaColores[colorSeleccionado],
    hoverColor: listaColores[colorSeleccionado],
    appBarTheme: AppBarTheme(
      centerTitle: true,
    )
  );


  // Color primario
  static const Color primary = Colors.orange;
  static const Color secondary = Colors.yellow;

  // Tema light
  static final ThemeData lightTheme = ThemeData.light().copyWith(
    useMaterial3: false,
    primaryColor: primary,
    appBarTheme: AppBarTheme(backgroundColor: primary, elevation: 0),
  );

  // Tema Hallowen
  static final ThemeData hallowenTheme = ThemeData.dark().copyWith(
    primaryColor: primary,
    primaryColorDark: Colors.orangeAccent,
    iconTheme: IconThemeData(color: primary),
    scaffoldBackgroundColor: Colors.blueGrey,
  );
}
