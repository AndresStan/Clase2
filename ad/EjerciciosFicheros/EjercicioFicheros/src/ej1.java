import java.io.*;
import java.nio.file.Path;

public class ej1 {
    public static void main(String[] args) {
        Path archivo = Path.of("src/ej1.txt");
        File archivof = archivo.toFile();

        try (BufferedReader reader = new BufferedReader(new FileReader(archivof))) {

            int lines = 0;

            while (reader.readLine() != null){
                lines++;
            }


            System.out.println(lines);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
