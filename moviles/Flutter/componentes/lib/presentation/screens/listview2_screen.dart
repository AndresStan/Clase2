import 'package:flutter/material.dart';

class Listview2Screen extends StatelessWidget {
  final games = [
    "Sonic",
    "Rocket night adventures",
    "cool spot",
    "Micromachines",
    "Street fighter II",
    "Street os Rage 2",
    "Fifa 94",
    "Italia 90"
  ];

  Listview2Screen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Listview Tipo 2")),
      body: ListView.separated(
        itemBuilder:(context, index) {
          return ListTile(
              leading: Icon(Icons.access_alarm),
              onTap: () {},
              title: Text(games[index]),
              subtitle: Text("Juegazo"),
              trailing: Icon(Icons.arrow_forward_ios_rounded),
            );
        } ,
        separatorBuilder:(_, _) {
          return Divider();
        } ,
        itemCount: games.length,
      ),
    );
  }
}
