import 'package:componentes/theme/app_theme.dart';
import 'package:flutter/material.dart';
import 'presentation/screens.dart';


void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Material App',
      //home: Listview2Screen(),
      initialRoute: "/",
      routes: {
        "/"      :(context) => MenuScreen(),
        "listview1" :(context) => MiScreen(),
        "listview2" :(context) => Listview2Screen(),
        "alert"     :(context) => AlertScreen(),
        "card"      :(context) => CardScreen(),
        "buttons"      :(context) => BotonesScreen()
      },
      onGenerateRoute: (settings) => MaterialPageRoute(builder: (context) => CardScreen()),
      theme: AppTheme(colorSeleccionado: 1).getTheme()
      // AppTheme.lightTheme 
    );
  }
}

