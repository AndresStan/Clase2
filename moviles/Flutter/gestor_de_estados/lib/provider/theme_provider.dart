import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

class ThemeProvider extends ChangeNotifier{
  ThemeData tema = .dark();

  ThemeData get obtenerTema => tema;

  void cambiarTema(){
    tema = tema == ThemeData.light() ? ThemeData.dark() : ThemeData.light();
    notifyListeners();
  }

}