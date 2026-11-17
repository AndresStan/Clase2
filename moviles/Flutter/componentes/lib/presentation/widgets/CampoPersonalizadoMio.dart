import 'package:flutter/material.dart';

class CampoPersonalizadoMio extends StatelessWidget {
  final String? hintText;
  final String? labelText;
  final String? helperText;
  final IconData? icon;
  final IconData? suffixIcon;
  final String? counterText;
  final TextInputType? keyboardType;
  final bool obscureText;
  final Map<String, String> formValues;
  final String formProperty;

  const new({
    super.key,
    this.hintText,
    this.labelText,
    this.helperText,
    this.icon,
    this.suffixIcon,
    this.counterText,
    this.keyboardType,
    this.obscureText = false,
    required this.formValues,
    required this.formProperty,
  });

  @override
  Widget build(BuildContext context) {
    return TextFormField(
      obscureText: obscureText,
      keyboardType: keyboardType,
      initialValue: "",
      textCapitalization: .words,
      onChanged: (value) {
        formValues[formProperty] = value;
      },
      validator: (value) {
        if (value == null) {
          return "Este campo es requerido";
        } else if (value.length < 3) {
          return "Este campo necesita minimo 3 caracteres";
        }
      },
      autovalidateMode: .onUserInteraction,
      decoration: InputDecoration(
        hintText: hintText,
        labelText: labelText,
        helperText: helperText,
        counterText: counterText,
        suffixIcon: suffixIcon == null ? null : Icon(suffixIcon),
        //prefixIcon: Icon(Icons.group),
        icon: icon == null ? null : Icon(icon),
        /*  Esto comentadico porque lo hago en AppTheme
    
        border: OutlineInputBorder(
          borderRadius: BorderRadius.only(
            bottomLeft: Radius.circular(10),
            topRight: Radius.circular(10),
          ),
        ),
        focusedBorder: OutlineInputBorder(
          borderSide: BorderSide(color: Colors.pinkAccent),
        ),
        */
      ),
    );
  }
}
