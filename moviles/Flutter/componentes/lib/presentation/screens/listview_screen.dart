import 'package:flutter/material.dart';

class MiScreen extends StatelessWidget {
   
  const MiScreen({super.key});
  
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Listview Tipo 1"),),
      body: ListView(
        children: [
          ListTile(
            leading: Icon(Icons.access_alarm),
            onTap: () {
              
            },
            title: Text("Hola a DAM 2"),
            subtitle: Text("no se que"),
            trailing: Icon(Icons.arrow_forward_ios_rounded),
          ),
          
          
        ],
      )
    );
  }
}