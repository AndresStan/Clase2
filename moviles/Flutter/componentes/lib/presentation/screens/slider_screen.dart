import 'dart:ffi';

import 'package:flutter/material.dart';

class SliderScreen extends StatefulWidget {
  const SliderScreen({super.key});

  @override
  State<SliderScreen> createState() => _SliderScreenState();
}

class _SliderScreenState extends State<SliderScreen> {
  double _valorSlider = 30;
  bool _puede = true;
  int duracion = 200;

  @override
  Widget build(BuildContext context) {
    final colors = Theme.of(context).colorScheme;

    return Scaffold(
      appBar: AppBar(
        title: Text("Sliders & Checks"),
        foregroundColor: Colors.white,
        backgroundColor: colors.primary,
      ),
      body: Column(
        children: [
          Slider.adaptive(
            min: 30,
            max: 400,
            value: _valorSlider,
            onChanged: _puede
                ? (value) {
                    _valorSlider = value;
                    setState(() {});
                  }
                : null,
          ),
          AnimatedPadding(
            padding: EdgeInsetsGeometry.all(_puede ? 1 : 0),
            duration: Duration(milliseconds: duracion),
          ),
          Checkbox.adaptive(
            value: _puede,
            onChanged: (value) {
              _puede = value ?? true;
              setState(() {});
            },
          ),
          AnimatedPadding(
            padding: EdgeInsetsGeometry.all(_puede ? 1 : 0),
            duration: Duration(milliseconds: duracion),
          ),
          Switch.adaptive(
            value: _puede,
            onChanged: (value) {
              _puede = value;
              setState(() {});
            },
          ),
          AnimatedPadding(
            padding: EdgeInsetsGeometry.all(_puede ? 1 : 0),
            duration: Duration(milliseconds: duracion),
          ),
          CheckboxListTile.adaptive(
            title: Text("Habilitar Slider"),
            secondary: Icon(Icons.access_alarm),
            titleAlignment: .center,
            tileColor: colors.primary,
            subtitle: Text("Esto es el subtitulo"),
            value: _puede,
            onChanged: (value) {
              _puede = value ?? true;
              setState(() {});
            },
          ),
          AnimatedPadding(
            padding: EdgeInsetsGeometry.all(_puede ? 1 : 0),
            duration: Duration(milliseconds: duracion),
          ),
          SwitchListTile.adaptive(
            title: Text("Habilitar Slider"),
            secondary: Icon(Icons.abc),
            subtitle: Text("Subtitlo"),
            value: _puede,
            onChanged: (value) {
              _puede = value;
              setState(() {});
            },
          ),
          AnimatedPadding(
            padding: EdgeInsetsGeometry.all(_puede ? 1 : 0),
            duration: Duration(milliseconds: duracion),
          ),

          Expanded(
            child: SingleChildScrollView(
              child: Image(
                image: NetworkImage("https://cdn.pixabay.com/photo/2020/07/06/17/51/batman-5377804_1280.png"),
                fit: BoxFit.contain,
                width: _valorSlider,
              ),
            ),
          ),

          AnimatedPadding(
            padding: EdgeInsetsGeometry.all(_puede ? 1 : 0),
            duration: Duration(milliseconds: duracion),
          ),
        ],
      ),
    );
  }
}
