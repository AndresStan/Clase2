import 'package:flutter/material.dart';
import 'package:gestor_de_estados/provider/contador_provider.dart';
import 'package:gestor_de_estados/provider/theme_provider.dart';
import 'package:gestor_de_estados/screens/home_screen.dart';
import 'package:provider/provider.dart';

void main() => runApp(MultiProvider(
  providers: [
        ChangeNotifierProvider(create: (context) => ContadorProvider()),
        ChangeNotifierProvider(create: (context) => ThemeProvider()),
  ],
  child: MyApp())
);

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'Material App',
        home: HomeScreen(),
        debugShowCheckedModeBanner: false,
        theme: context.watch<ThemeProvider>().tema,
        // themeMode
      
    );
  }
}
