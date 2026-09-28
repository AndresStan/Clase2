package ej3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class ej3 {
    static void main() {

        Path ruta = Path.of("src/ej3/comandos.txt");
        File archivo = ruta.toFile();

        Path rutaE = Path.of("src/ej3/errores.txt");
        Path rutaS = Path.of("src/ej3/salida.txt");

        File archivoS = rutaS.toFile();
        File archivoE = rutaE.toFile();

        try {
            Process process = new ProcessBuilder("cmd").redirectInput(archivo).redirectError(archivoE).redirectOutput(archivoS).start();
            process.waitFor();

            System.out.println("Codigo de finalizacion: " + process.exitValue());

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
