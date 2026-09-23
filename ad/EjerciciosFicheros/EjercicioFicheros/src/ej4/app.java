package ej4;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class app {
    public static void main(String[] args) {


        List<String> miLista = new ArrayList<>(Arrays.asList("src/ej4/a.txt", "src/ej4/b.txt", "src/ej4/c.txt"));

        Path ruta = Path.of("src/ej4/destino.txt");
        File archivo = ruta.toFile();



        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo)))  {
            for (String a : miLista){
                try (BufferedReader reader = new BufferedReader(new FileReader(Path.of(a).toFile()))) {

                    String line;

                    while ((line = reader.readLine()) != null){
                        writer.write(line);
                        writer.newLine();
                    }


                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
