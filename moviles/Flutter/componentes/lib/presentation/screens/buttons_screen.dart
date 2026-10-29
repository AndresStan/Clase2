import 'package:componentes/theme/app_theme.dart';
import 'package:flutter/material.dart';

class BotonesScreen extends StatelessWidget {
   
  const BotonesScreen({super.key});
  
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Botones"),
      ),

      body: _buttons(),
      floatingActionButton: FloatingActionButton(
        child: Icon(Icons.arrow_back),
        onPressed: () {
          
        },
        ),
    );
  }
}

class _buttons extends StatelessWidget {
  const new({
    super.key,
  });

  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      child: SizedBox(
        width: double.infinity,
        child: Padding(
          padding: EdgeInsetsGeometry.symmetric(horizontal: 10, vertical: 20),
          child: Column(
            children: [
            ElevatedButton(
              onPressed: () {
                
              },
              child: Text("Elevated Button")
            ),
            ElevatedButton(
              onPressed: null , // Para disablear un button tanto graficamente como funcionalmente
              child: Text("Elevated Button Disabled")
            ),
            ElevatedButton.icon(
              onPressed: () {
                
              }, 
              label: Text("Elevated Icon button"),
              icon: Icon(Icons.ads_click),
              iconAlignment: .end,
            ),
            FilledButton(
              onPressed: () {
                
              }, 
              child: Text("Filled")
            ),
      
            FilledButton.icon(
              onPressed: () {
                
              }, 
              label: Text("FilledButton Icon"),
              icon: Icon(Icons.abc_outlined),
              iconAlignment: .end,
            ),
            OutlinedButton(
              onPressed: () {
                
              }, 
              child: Text("Outlined")
            ),
            OutlinedButton.icon(
              onPressed: () {
                
              }, 
              label: Text("Outlined Button Icon"),
              icon: Icon(Icons.add_circle_outlined),
            ),
            TextButton(
              onPressed: () {
                
              }, 
              child: Text("TextButton")
            ),
            TextButton.icon(
              onPressed: () {
                
              }, 
              label: Text("TextButton Icon"),
              icon: Icon(Icons.abc),
            ),
            IconButton(
              onPressed: () {
                
              }, 
              icon: Icon(Icons.one_x_mobiledata)
            ),
            IconButton.outlined(
              onPressed: () {
                
              }, 
              icon: Icon(Icons.one_x_mobiledata)
            ),
            IconButton(
              onPressed: () {
                
              }, 
              icon: Icon(Icons.access_alarm, size: 42,),
              style: ButtonStyle(
                backgroundColor: WidgetStatePropertyAll(Colors.amber)
              )
            ),
            SizedBox(height: 10,)
            ,
            _BotonPersonalizado(
      
            ),
            SizedBox(height: 10,),
      
            _BotonPersonalizado(
              
            ),
            SizedBox(height: 10,),
            
            _BotonPersonalizado(
              
            ),
            SizedBox(height: 10,),
            
            _BotonPersonalizado(
              
            )
      
          ],
          ),
        ),
      ),
    );
  }
}

class _BotonPersonalizado extends StatelessWidget {
  
  @override
  Widget build(BuildContext context) {
    return ClipRRect(
      borderRadius: .circular(20),
      child: Material(
        color: Colors.green,
        child: InkWell(
          onTap: () {
            
          },
          splashColor: Colors.blueAccent,
          child: Padding(
            padding: const EdgeInsets.all(20.0),
            child: Text("Mi propio boton"),
          ),
        ),
      ),
    );
  }

}