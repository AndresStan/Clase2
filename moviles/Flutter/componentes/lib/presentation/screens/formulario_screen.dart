import 'package:componentes/presentation/widgets.dart';
import 'package:flutter/material.dart';


class FormularioScreen extends StatelessWidget {
  const FormularioScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final colors = Theme.of(context).colorScheme;

    return Scaffold(
      appBar: AppBar(
        title: Text("Formularios"),
        backgroundColor: colors.primary,
        foregroundColor: Colors.white,
      ),
      body: SingleChildScrollView(
        child: Padding(
          padding: EdgeInsetsGeometry.all(20),
          child: Form(
            child: Column(
              spacing: 20,
              children: [
                CampoPersonalizadoMio(suffixIcon: Icons.nat ,icon: Icons.nat ,labelText: "Nombre", hintText: "Nombre", counterText: "Indica tu nombre", helperText: "Solo el nombre",),
                CampoPersonalizadoMio(suffixIcon: Icons.near_me , icon: Icons.near_me ,labelText: "Apellidos", hintText: "Apellidos", counterText: "Indica tu apellido", helperText: "Solo el apellido",),
                CampoPersonalizadoMio(suffixIcon: Icons.phone , icon: Icons.phone, labelText: "Telefono", hintText: "Telefono", counterText: "Indica tu telefono", helperText: "Solo el telefono", keyboardType: .phone),
                CampoPersonalizadoMio(suffixIcon: Icons.email ,icon: Icons.email, labelText: "Email", hintText: "Correo electronico", counterText: "Indica tu correo", helperText: "Solo el correo", keyboardType: .emailAddress,),
                CampoPersonalizadoMio(suffixIcon: Icons.password, icon: Icons.password, labelText: "Contraseña", hintText: "Contraseña", counterText: "Indica tu contraseña", helperText: "Solo la contraseña", keyboardType: .emailAddress, obscureText: true,),
            
                DropdownButtonFormField(
                  initialValue: "empleado",
                  items: [
                    DropdownMenuItem(
                      child: Text("Admin"),
                      value: "admin",
                    ),
            
                    DropdownMenuItem(
                      child: Text("Gerente"),
                      value: "gerente",
                    ),
            
                    DropdownMenuItem(
                      child: Text("Empleado"),
                      value: "empleado",
                    ),
                  ], 
                  onChanged: (value) {
                    print(value);
                  },
                ),
            
                ElevatedButton(
                  
                  onPressed: () {
                    
                  }, 
                  child: Text("Guardar")
                  )
            
              ],
            ),
          ),
        ),
      ),
    );
  }
}
