import 'package:flutter/material.dart';
import '../widgets.dart';



class CardScreen extends StatelessWidget {
   
  const CardScreen({super.key});
  
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Tarjetas"),
      ),
      body: ListView(
        padding: EdgeInsetsGeometry.symmetric(horizontal: 20, vertical: 10),
        children: [
          CardTipo1(),
          CardTipo2(url: "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.explicit.bing.net%2Fth%2Fid%2FOIP.6gnCR8SnLpslz7PmV7NfAQAAAA%3Fr%3D0%26pid%3DApi&f=1&ipt=1de7ed8b784f6b380301b159e673ca5fad213599b836d885fdb6eb0a18491312&ipo=images", texto: "Emmanuel",),

        ],
      ),
    );
  }
}

