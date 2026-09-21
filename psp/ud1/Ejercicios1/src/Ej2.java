import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;

public class Ej2 {
    static void main() {

     try {
         Process ej2 = new ProcessBuilder("cmd.exe", "C:\\Users\\dam2\\Documents\\ej2ud1.bat").start();
         System.out.println( ej2.getOutputStream());

     } catch (IOException a){
         System.out.println(a);
     }

    }
}
