import '../models/post.dart';
import 'package:http/http.dart' as http;

class PostService {

  // Hacemos la peticion al API para solicitar la Lista de Posts  
  Future<List<Post>?> obtenerPosts() async{
      // Cremos un cliente HTTP que nos va a permitr enviar la peticion
      var client = http.Client();
      // Convertimos la direccion o endpoint en un objeto Uri
      var uri = Uri.parse('https://jsonplaceholder.typicode.com/posts');
      // Enviamos la peticion GET y esperamos la respuesta del Servidor
      var response = await client.get(uri);
      // El codigo 200 indica que la peticion se ha realizado correctamente
      if (response.statusCode == 200) {
        var json = response.body;
        // Decodificamos el texto y transformamos cada elemento JSON en un objeto Post
        return postFromJson(json);
      } else {
        return null;
      }
      // Si no es 200 no se devuelve inguna lista (null)
  } 

}