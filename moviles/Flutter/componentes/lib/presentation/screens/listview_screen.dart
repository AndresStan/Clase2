import 'package:flutter/material.dart';

class MiScreen extends StatelessWidget {
  final games = [
    "Sonic",
    "Rocket night adventures",
    "cool spot",
    "Micromachines",
    "Street fighter II",
    "Street os Rage 2",
  ];

  MiScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Listview Tipo 1")),
      body: ListView(
        children: [
          ...games.map(
            (juego) => ListTile(
              leading: Icon(Icons.access_alarm),
              onTap: () {},
              title: Text(juego),
              subtitle: Text("Juegazo"),
              trailing: Icon(Icons.arrow_forward_ios_rounded),
            ),
          ),
          Divider()
        ],
      ),
    );
  }
}
