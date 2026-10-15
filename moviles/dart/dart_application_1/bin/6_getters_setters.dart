
void main() {

  var forma = Cuadrado(lado: 3);
  print(' Area: ${forma.area}');
  forma.lado = 4;
  print("asd");
}

class Cuadrado {
   double _lado;

  Cuadrado({
      required double lado
    }):assert(lado >= 0, "El lado debe ser mayor o igual a 0"),
     assert(lado < 10, "El lado debe ser menor que 10"), _lado = lado;


  double get area {
    return _lado * _lado;
  }

  set lado(double valor){
    print('El nuevo valor es $valor');
    if (valor < 0) throw 'El valor debe ser mayor que 0';
    _lado = valor;
  }



}


