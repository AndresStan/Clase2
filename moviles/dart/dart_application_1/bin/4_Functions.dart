
void main() {
  print(saludar());
  print(saludar2());
  print(sumar(6, 7));
  print(sumar2(6, 7));
  print(sumarOpcional(6));
  print(saludoCompleto(mensaje: 'Que te den', nombre: 'Javi'));
}

String saludar(){
  return 'Hola alberto';
}  

String saludar2() => 'Hola alberto';

int sumar (a,b) => 2+3;
int sumar2 (int a, int b) => a+b;

int sumarOpcional(int a, [int b = 3]){
  return a + b;
}

String saludoCompleto({required String nombre, String mensaje = 'Buenos dias'}){
  return 'Hola ${nombre}, ${mensaje.toUpperCase()}';
}