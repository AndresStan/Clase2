import java.util.Random;
import java.util.Scanner;

public class ej2 {
    static void main() {

        // Aqui declaro las variables
        Scanner sc = new Scanner(System.in);
        int random = new Random().nextInt(1, 101);
        int respuesta = 0;
        int intentos = 1;



        while (true){

            System.out.println("Intenta adivinar el numero!");
            // Aqui realizo la lectura
            respuesta = sc.nextInt();


            // Aqui hago los calculos
            if (respuesta == random){
                System.out.println("Enhorabuena, has acertado, te ha tomado " + intentos + " intentos");
                break;
            } else {
                // Aqui devuelvo las respuestas
                if (respuesta > random){
                    System.out.println("Casi, el numero es menor ");
                } else {
                    System.out.println("Casi, el numero es mayor");
                }
                intentos++;
            }

        }

        sc.close();

    }
}
