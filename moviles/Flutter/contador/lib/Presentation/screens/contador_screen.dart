import 'package:contador/Presentation/widgets/boton_personalizado.dart';
import 'package:flutter/material.dart';

class ContadorScreen extends StatefulWidget {
  const new({super.key});

  @override
  State<ContadorScreen> createState() => _ContadorScreenState();
}

class _ContadorScreenState extends State<ContadorScreen> {
  int contador = 0;
  String texto = "Clicks";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Contador App"),
        backgroundColor: Colors.red.shade900,
        centerTitle: true,
        /*
        leading: IconButton(
          onPressed: () {
            contador = 0;
            setState(() {});
          },
          icon: Icon(Icons.refresh_rounded),
        ),*/
        actions: [
          IconButton(
            onPressed: () {
              contador = 0;
              setState(() {});
            },
            icon: Icon(Icons.refresh_rounded),
          ),
          IconButton(
            onPressed: () {
              contador = 0;
              setState(() {});
            },
            icon: Icon(Icons.refresh_rounded),
          ),
        ],
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: .center,
          children: [
            Text(
              contador.toString(),
              style: TextStyle(fontSize: 160, fontWeight: .w100),
            ),
            Text(
              contador == 1 ? "Click" : "Clicks",
              style: TextStyle(fontSize: 25),
            ),
          ],
        ),
      ),
      floatingActionButton: Column(
        mainAxisAlignment: .end,
        children: [
          CustomButton(
            icono: Icons.exposure_minus_1,
              onPressedd: () {
                setState(() {
                  contador--;
                });
              },
            ),
          SizedBox(height: 10),
          CustomButton(
            icono: Icons.add,
            onPressedd: () {
              setState(() {
                contador++;
              });
            },
            ),
          SizedBox(height: 10),
          CustomButton(
            icono: Icons.refresh_rounded,
            onPressedd: () {
              setState(() {
                contador = 0;
              });
            },
            )
        ],
      ),
    );
  }
}

class CustomButton extends StatelessWidget {

  final IconData icono;
  final VoidCallback onPressedd;

  const new({
    super.key,
    required this.icono,
    required this.onPressedd
  });

  @override
  Widget build(BuildContext context) {
    return FloatingActionButton(
      onPressed: onPressedd,
      child: Icon(icono),
    );
  }
}
