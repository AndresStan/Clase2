import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Indica la ruta del programa que desea ejecutar");

        // ruta para copiar:

        try {

            String ruta = sc.nextLine();

            Process process = new ProcessBuilder(ruta).start();
            process.waitFor();

            System.out.println("Proceso finalizado " + process.exitValue() );



        }catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }


    }
}
