package ej2;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class app {
    public static void main(String[] args) {


        String patron = "es";

        Path ruta = Path.of("src/ej2/origen.txt");
        File archivo = ruta.toFile();

        Path rutaD = Path.of("src/ej2/destino.txt");
        File archivoD = rutaD.toFile();

        String palabraParaRemplazar = "NIGGA";


        reemplazar(archivo, patron, archivoD, palabraParaRemplazar);



    }

    public static void reemplazar(File archivo , String patron, File archivoD, String palabraParaRemplazar){

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo));
        BufferedWriter writer = new BufferedWriter(new FileWriter(archivoD))) {

            String line;

            while ((line = reader.readLine()) != null){

                String[] palabras = line.split("\\b");

                for (String s : palabras){
                    if (s.matches(patron)){
                        s = palabraParaRemplazar;
                    }
                    writer.write(s);
                }
                writer.newLine();


            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
