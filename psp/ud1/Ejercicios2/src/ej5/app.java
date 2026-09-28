package ej5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class app {

    static void main() {


        Path ruta = Path.of("src/ej5/ipconfig.txt");
        File archivo = ruta.toFile();

        Path rutaE = Path.of("src/ej5/hostname.txt");
        Path rutaS = Path.of("src/ej5/ping.txt");

        File archivoS = rutaS.toFile();
        File archivoE = rutaE.toFile();

        try {
            Process process = new ProcessBuilder("cmd", "/c", "hostname").redirectOutput(archivoS).start();
            Process process2 = new ProcessBuilder("cmd", "/c", "ipconfig").redirectOutput(archivoE).start();
            Process process3 = new ProcessBuilder("cmd", "/c", "ping www.google.es").redirectOutput(archivo).start();

            process.waitFor();
            process2.waitFor();
            process3.waitFor();

            System.out.println("Codigo de finalizacion hostname : " + process.exitValue());
            System.out.println("Codigo de finalizacion ipconfig: " + process2.exitValue());
            System.out.println("Codigo de finalizacion ping: " + process3.exitValue());

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }






    }
}
