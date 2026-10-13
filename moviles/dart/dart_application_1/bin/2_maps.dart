
void main() {

    final Map<String, dynamic> pokemon = {
      'nombre': 'ditto',
      'hp': 100,
      'isAlive' : true,
      'sprites' : {
        1: 'ditto/front.jpg',
        2: 'ditto/back.jpg'
      }
    };
  
    print(pokemon);
    print(pokemon['nombre']);
    print(pokemon['sprites']);
    print(pokemon['sprites'][1]);
  
}

