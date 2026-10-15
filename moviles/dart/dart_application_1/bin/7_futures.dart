void main() {  
  print("Inicio del programa");
  httpGet("https://wwww.google.com").then((value) {
    print(value); 
  }).catchError((err) => print( "OH NOO ERROR $err"));
  print("Final del programa");
}

Future<String> httpGet (String url){
  return Future.delayed(Duration(seconds: 2), () {
    throw Exception("nigga");
  });
}
