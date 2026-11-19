import 'package:flutter/material.dart';
import 'package:practica4/screens/home.dart';
import 'package:practica4/screens/login.dart';
import 'package:practica4/provider/acceso_provider.dart';
import 'package:provider/provider.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MultiProvider(
      providers: [
        ChangeNotifierProvider(
          create:(context) => AccesoProvider(),
        )
      ],
      child: MaterialApp(
        title: 'Practica 4',
        debugShowCheckedModeBanner: false,
        initialRoute: "login",
        routes: {
          "login": (context) => LoginScreen(),
          "home": (context) => HomeScreen(),
        },
      ),
    );
  }
}
