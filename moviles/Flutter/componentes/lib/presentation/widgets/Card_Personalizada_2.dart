import 'package:flutter/material.dart';




class CardTipo2 extends StatelessWidget {

  final String url;
  final String? texto;

  const new({
    super.key,
    required this.url,
    this.texto
  });


  @override
  Widget build(BuildContext context) {
    return Card(
      clipBehavior: Clip.antiAlias, // Para que la imagen no se salga de la card (BORDER RADIUS)
      shape: RoundedRectangleBorder(borderRadius: BorderRadiusGeometry.circular(15)),
      child: Column(
        children: [
          FadeInImage(
            fit: BoxFit.cover,
            image: NetworkImage(url),
            placeholder: AssetImage("assets/jar-loading.gif"),
            width: double.infinity,
            fadeInDuration: Duration(milliseconds: 800),
            height: 230,
          ),
          if ( texto != null )
            Container(
              child: Text(texto!),
                padding: EdgeInsets.all(20),              
            )
        ],
      ),
    );
  }
}
