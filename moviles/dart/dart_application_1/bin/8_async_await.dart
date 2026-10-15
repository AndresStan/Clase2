void main() async {  
  print("Inicio del programa");

  try { 
    final value =  await httpGet("Esta url");
    print(value);
  } catch (err) {
    print("Tenemos un error: $err");
  }

  /*
  httpGet("https://wwww.google.com").then((value) {
    print(value); 
  }).catchError((err) => print( "critical error: $err"));
  */
  print("Final del programa");
}

Future<String> httpGet (String url) async {

  await Future.delayed(Duration(seconds: 3));
  throw "Error de la peticion http";
  return "Respuesta de la peticion http";

  /*
  await Future.delayed(Duration(seconds: 2), () {
    throw Exception("nigga");
  });
  */
}

