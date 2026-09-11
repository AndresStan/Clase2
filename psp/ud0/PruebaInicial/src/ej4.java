import java.util.Scanner;

public class ej4 {

    static void main() {

        // Aqui declaro las variables
        Scanner sc = new Scanner(System.in);
        int respuesta;
        double numero;
        boolean seguir = true;
        System.out.println("Bienvenido");
        while (seguir){



            System.out.println(" 1. Saludar");
            System.out.println(" 2. Calcular cuadrado de un numero");
            System.out.println(" 3. Comprobar si un numero es par");
            System.out.println(" 4. Salir");
            // Aqui realizo la lectura
            respuesta = sc.nextInt();


            switch (respuesta){

                case 1:
                    Saludo();
                    break;
                case 2:
                    System.out.println("Digame el numero");
                    numero = sc.nextDouble();
                    Cuadrado(numero);
                    break;
                case 3:
                    System.out.println("Digame el numero");
                    numero = sc.nextDouble();
                    Paroimpar(numero);
                    break;
                case 4:
                    Salir();
                    seguir = false;
                    break;
                default:
                    System.out.println("Error, vuelva a intentar con un numero valido");

            }
        }
    sc.close();

    }


    // Aqui hago los calculos y todos los metodos junto a la devolucion de respuestas (en este caso "souts")

    public static void Saludo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, digame su nombre");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
    }

    public static void Cuadrado(double a){
        System.out.println(a*a);
    }

    public static void Paroimpar(double a){
        if (a % 2 == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }

    public static void Salir(){
        System.out.println("Hasta luego!!");
    }


}
