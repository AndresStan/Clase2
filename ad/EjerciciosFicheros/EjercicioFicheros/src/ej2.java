import java.io.*;
import java.nio.file.Path;

public class ej2 {
    public static void main(String[] args) throws FileNotFoundException {

        Path ruta = Path.of("src/ej2a.txt");
        File archivo = ruta.toFile();

        Path ruta2 = Path.of("src/ej2b.txt");
        File archivo2 = ruta2.toFile();



        try (BufferedReader reader = new BufferedReader(new FileReader(archivo));
             BufferedWriter writer = new BufferedWriter(new FileWriter(archivo2))) {

            String line;

            while ((line = reader.readLine()) != null){
                writer.write(line);
                writer.newLine();
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
