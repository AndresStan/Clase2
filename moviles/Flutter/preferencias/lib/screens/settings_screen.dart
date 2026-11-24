import 'package:flutter/material.dart';
import 'package:preferencias/config/preferencias.dart';

class SettingsScreen extends StatefulWidget {
   
  const SettingsScreen({super.key});

  @override
  State<SettingsScreen> createState() => _SettingsScreenState();
}

class _SettingsScreenState extends State<SettingsScreen> {

  // bool _permisoUbicacion = false;
  // bool _permisoCamara = false;
  // bool _temaOscuro = false;
  // String _nombre = "";


  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Preferencias"),
        foregroundColor: Colors.white,
        backgroundColor: Colors.black,
      ),
      body: Column(
         children: [
            CheckboxListTile.adaptive(
              title: Text("Permiso de ubicacion"),
              value: Preferencias.permisoUbicacion, 
              onChanged: (value) {
                setState(() {
                      Preferencias.permisoUbicacion = value!;
                });
              },
              
            ),
            CheckboxListTile.adaptive(
              title: Text("Permiso de camara"),
              value: Preferencias.permisoCamara, 
              onChanged: (value) {
                setState(() {
                      Preferencias.permisoCamara = value!;
                });
              },
            ),
            CheckboxListTile.adaptive(
              title: Text("Tema dark"),
              value: Preferencias.darkMode, 
              onChanged: (value) {
                setState(() {
                      Preferencias.darkMode = value!;
                });
              },  
            ),
            Divider(),
            Padding(
              padding: const EdgeInsets.symmetric(horizontal: 16),
              child: TextFormField(
                
                initialValue: Preferencias.nombre,
                decoration: InputDecoration(
                  label: Text("Nombre"),
                  helperText: "Nombre de usuario",
              
                ),
                onChanged: (value) {
                  Preferencias.nombre = value;

                },
                
              ),
            )
         ],
      ),
    );
  }
}