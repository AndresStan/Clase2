import 'package:flutter/material.dart';

class Pagina2 extends StatefulWidget {
  const new({super.key});

  @override
  State<Pagina2> createState() => _Pagina2State();
}

class _Pagina2State extends State<Pagina2> {


  int _contador = 0;

  @override
  Widget build(BuildContext context) {
    return Container(
      color: Colors.lightBlue,
      child: Center(
        child: Column(
         children: [
          Padding(padding: .all(10)),
          Center(child: Text("Pagina 2 Hecha con statefull y variables (malo)" , style: TextStyle(fontSize: 20), textAlign: .center)),
          Text(_contador.toString(), style: TextStyle(fontSize: 120),),
          ElevatedButton(
            onPressed: () {
              _contador++;
              setState(() {
                
              });
            }, 
            child: Text("Incrementar")
          ),
          ElevatedButton(
            onPressed: () {
              _contador--;
              setState(() {
                
              });
            }, 
            child: Text("Decrementar")
          )
         ],
         
         
        ),
      ),
    );
  }
}