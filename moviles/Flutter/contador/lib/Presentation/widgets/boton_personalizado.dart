import 'package:flutter/material.dart';

class boton_personalizado extends StatelessWidget {

  final IconData icono;

  const new({
    super.key,
    required this.icono
  });

  @override
  Widget build(BuildContext context) {
    return FloatingActionButton(
      child: Icon(icono),
      onPressed: () {
        
      },
    );
  }
}
