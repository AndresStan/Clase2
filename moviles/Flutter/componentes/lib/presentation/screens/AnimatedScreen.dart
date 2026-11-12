
import 'dart:math';
import 'package:flutter/material.dart';

class AnimatedScreen extends StatefulWidget {
  const AnimatedScreen({super.key});

  @override
  State<AnimatedScreen> createState() => _AnimatedScreenState();
}

class _AnimatedScreenState extends State<AnimatedScreen> {
  double _width = 50;
  double _height = 50;
  Color _color = Colors.indigo;
  BorderRadiusGeometry _radio = .circular(25);

  void cambiarShape(){

    final random = Random();
    _width = random.nextInt(300).toDouble()+70;
    _height = random.nextInt(300).toDouble()+70;

    _color = Color.fromRGBO(
      random.nextInt(255), 
      random.nextInt(255), 
      random.nextInt(255), 
      1
    );

    _radio = BorderRadius.circular(random.nextInt(100).toDouble() + 10);

  }

  @override
  Widget build(BuildContext context) {
    final colors = Theme.of(context).colorScheme;
    

    return Scaffold(
      appBar: AppBar(
        title: Text("Animated Screen"),
        foregroundColor: Colors.white,
        backgroundColor: colors.primary,
      ),
      body: Center(
        child: AnimatedContainer(
          curve: Curves.bounceOut,
          duration: Duration(milliseconds: 500),
          width: _width,
          height: _height,
          decoration: BoxDecoration(
            color: _color,
            borderRadius: _radio,
          ),
        ),
      ),
      floatingActionButton: FloatingActionButton.extended(
        label: Text("Click"),
        onPressed: () {
          setState(() {
            cambiarShape();
          });
        },
        icon: Icon(Icons.zoom_out_sharp),
      ),
    );
  }
}
