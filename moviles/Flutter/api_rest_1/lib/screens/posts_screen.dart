import 'package:api_rest_1/models/post.dart';
import 'package:api_rest_1/services/posts_service.dart';
import 'package:flutter/material.dart';

class PostsScreen extends StatefulWidget {
   
  const PostsScreen({super.key});

  @override
  State<PostsScreen> createState() => _PostsScreenState();
}

class _PostsScreenState extends State<PostsScreen> {

  // La lista de Post: La inicializo a NULL mientras no haya datos disponibles
  List<Post>? listaPosts;
  // Indicador para decir si esta cargando o ha terminado la carga
  bool isLoading = false;

  @override
  void initState() {
    super.initState();
    // TODO: implement initState
    void obtenerPosts() async{
        listaPosts = await PostService().obtenerPosts();
        // Aqui solo marcaremos la carga como completada si se recibio una respuesta valida
        if (listaPosts!=null) {
          setState(() {
            isLoading = true;
          });
        }
    }
    obtenerPosts();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Posts"),
        backgroundColor: Colors.black,
        foregroundColor: Colors.white,
        leading: Icon(Icons.abc),
      ),
      body: Visibility(
        visible: isLoading,
        replacement: Center(child: CircularProgressIndicator.adaptive(),),
        child: ListView.builder(
          itemCount: listaPosts?.length,
          itemBuilder: (context, index) {
            return Padding(
              padding: const EdgeInsets.all(8.0),
              child: Row(
                children: [
                  Container(
                      height: 50,
                      width: 50,
                      decoration: BoxDecoration(
                        borderRadius: .circular(12),
                        color: Colors.lightBlueAccent
                      ),
                     
                  ),
                  SizedBox(
                    width: 16,
                  ),
                  Expanded(
                    child: Column(
                      crossAxisAlignment: .start,
                      children: [
                        Text(listaPosts![index].title, maxLines: 2, overflow: .ellipsis, style: TextStyle(fontSize: 20, fontWeight: .bold),),
                        Text(listaPosts![index].body ?? "", maxLines: 3, overflow: .ellipsis,),
                      ],
                    ),
                  ),
                ],
              ),
            );
          },
        )
      )
    );
  }
}