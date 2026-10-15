

void main() {

  final wolverine = Heroe(nombre: 'Andres', poder: 'Psiquico');
  print(wolverine);
  print('${wolverine.nombre} ${wolverine.poder}');
  print(wolverine.toString());
}

class Heroe {

  String nombre;
  String? poder;

  Heroe({
    required this.nombre,
    this.poder
  });

  @override
  String toString() {
    return 'Soy el metodo toString';
  }

  

}