import java.util.ArrayList;
import java.util.Scanner;

public class ej3 {
    static void main() {

        // Aqui declaro las variables
        ArrayList<Integer> miArray = new ArrayList<>();
        int contador = 1;
        Scanner sc = new Scanner(System.in);
        int numMayor;
        int numMenor;
        int suma = 0;

        // Aqui realizo la lectura
        while (miArray.size() < 10){
            System.out.println("Indica el numero " + contador);
            miArray.add(sc.nextInt());
            contador++;
        }

        // Aqui hago los calculos
        numMayor = miArray.getFirst();
        numMenor = miArray.getLast();
        for (int i : miArray){
            suma = suma + i;
            if (i > numMayor){
                numMayor = i;
            }

        }

        for (int i : miArray){

            if (i < numMenor){
                numMenor = i;
            }

        }
    // Aqui devuelvo las respuestas
        System.out.println("El numero mayor es " + numMayor);
        System.out.println("El numero menor es " + numMenor);
        System.out.println("La suma es " + suma);
        System.out.println("La media es " + suma/miArray.size());



    sc.close();

    }



}
