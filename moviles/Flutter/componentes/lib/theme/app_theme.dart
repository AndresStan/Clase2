import 'package:flutter/material.dart';

class AppTheme {

  // Color primario
  static const Color primary = Colors.orange;
  static const Color secondary = Colors.yellow;


  // Tema light
  static final ThemeData lightTheme = ThemeData.light().copyWith(
    useMaterial3: false,
    primaryColor: primary,
    appBarTheme: AppBarTheme(
        backgroundColor: primary,
        elevation: 0,
    )
    
  );


  // Tema Hallowen
  static final ThemeData hallowenTheme = ThemeData.dark().copyWith(
    primaryColor: primary,
    primaryColorDark: Colors.orangeAccent,
    iconTheme: IconThemeData(color: primary),
    scaffoldBackgroundColor: Colors.blueGrey
  );

}