import 'package:flutter/material.dart';
import 'package:practica4/provider/acceso_provider.dart';
import 'package:provider/provider.dart';


class HomeScreen extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Home"),
        leading: Icon(Icons.home),
        centerTitle: true,
        backgroundColor: Colors.black,
        foregroundColor: Colors.white,
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: .center,
          crossAxisAlignment: .center,
          spacing: 20,
          children: [
            Text("Has introducido el email", style: TextStyle(fontWeight: .w900, fontSize: 30)),
            Text(context.read<AccesoProvider>().cogerEmail),
            Text("Has introducido la contraseña", style: TextStyle(fontWeight: .w900, fontSize: 30),),
            Text(context.read<AccesoProvider>().cogerPassword),
            FloatingActionButton(
              onPressed: () {
                Navigator.pushNamedAndRemoveUntil(context, "login", (route) => false);
              },
              child: Text("Volver"),
              backgroundColor: Colors.black,
              foregroundColor: Colors.white,
            )
          ],
        ),
      )
   );
  }
}