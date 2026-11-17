import 'package:componentes/presentation/widgets.dart';
import 'package:flutter/material.dart';


class FormularioScreen extends StatelessWidget {
  const FormularioScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final colors = Theme.of(context).colorScheme;


    final Map<String, String> formValues = {
      'first_name' : '',
      'last_name'  : '',
      'phone'      : '',
      'email'      : '',
      'password'   : '',
      'role'       : ''
    };

    // GlobalKey nos permite controlar y validar el formulario completo
    final GlobalKey<FormState> _formKey = GlobalKey<FormState>();



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
            key: _formKey,
            child: Column(
              spacing: 20,
              children: [
                Text("Formulario para ver a Ciro"),
                CampoPersonalizadoMio(formValues: formValues, formProperty: 'first_name', suffixIcon: Icons.nat ,icon: Icons.nat ,labelText: "Nombre", hintText: "Nombre", counterText: "Indica tu nombre", helperText: "Solo el nombre",),
                CampoPersonalizadoMio(formValues: formValues, formProperty: 'last_name' ,suffixIcon: Icons.near_me , icon: Icons.near_me ,labelText: "Apellidos", hintText: "Apellidos", counterText: "Indica tu apellido", helperText: "Solo el apellido",),
                CampoPersonalizadoMio(formValues: formValues, formProperty: 'phone', suffixIcon: Icons.phone , icon: Icons.phone, labelText: "Telefono", hintText: "Telefono", counterText: "Indica tu telefono", helperText: "Solo el telefono", keyboardType: .phone),
                CampoPersonalizadoMio(formValues: formValues, formProperty: 'email', suffixIcon: Icons.email ,icon: Icons.email, labelText: "Email", hintText: "Correo electronico", counterText: "Indica tu correo", helperText: "Solo el correo", keyboardType: .emailAddress,),
                CampoPersonalizadoMio(formValues: formValues, formProperty: 'password', suffixIcon: Icons.password, icon: Icons.password, labelText: "Contraseña", hintText: "Contraseña", counterText: "Indica tu contraseña", helperText: "Solo la contraseña", keyboardType: .emailAddress, obscureText: true,),
            
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
                    formValues['role'] = value ?? 'empleado';
                  },
                ),
            
                ElevatedButton(
                  
                  onPressed: () {
                    print(formValues);
                    
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
