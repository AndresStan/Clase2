import java.util.ArrayList;
import java.util.Scanner;

public class ej1 {

    static void main() {

        // Aqui declaro las variables
        Scanner sc = new Scanner(System.in);
        int asignatura = 1;
        double respuesta = 0.0;
        ArrayList<Double> miArray = new ArrayList<Double>();
        double suma = 0.0;



        // Aqui realizo la lectura
            try {
                while (true) {
                    System.out.println("Indica la nota de la asignatura " + asignatura + " o 99 para salir");
                    respuesta = Double.parseDouble(sc.nextLine());
                    if (respuesta == 99){
                        break;
                    }
                    asignatura++;
                    miArray.add(respuesta);
                }
            } catch (Exception a){
                System.out.println("Ha ocurrido una excepcion controlada " + a.getMessage());
            }


        // Aqui hago los calculos
        for (Double e : miArray){
            suma = suma + e;
        }


        // Aqui devuelvo las respuestas
        System.out.println("La nota media es de " + suma/miArray.size());

        if (suma/miArray.size()<5){
            System.out.println("El alumno esta suspenso");
        } else {
            System.out.println("El alumno esta aprobado");
        }

        if (suma/miArray.size()>9){
            System.out.println("La media es de sobresaliente");
        } else {
            System.out.println("La media no es de sobresaliente");
        }


        sc.close();
    }


}
