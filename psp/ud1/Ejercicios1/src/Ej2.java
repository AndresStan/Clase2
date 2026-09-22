import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Ej2 {
    static void main() {

       try {

           File output = new File("src/output.txt");
           File errors = new File("src/errors.txt");
           File input = new File("src/comandos.bat");

           Process subProceso = new ProcessBuilder("cmd.exe", "/c", input.toPath().toString())
                   .redirectOutput(output)
                   .redirectError(errors)
                   .start();



            subProceso.waitFor();

       } catch (IOException a) {
           System.out.println(a.getMessage());
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

    }
}
