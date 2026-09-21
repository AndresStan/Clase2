import java.io.IOException;

public class Ej1 {
    static void main() {

       try {
           Process ej1 = new ProcessBuilder("C:\\Program Files\\Notepad++\\notepad++.exe", "C:\\Users\\dam2\\Documents\\ej1ud1.txt").start();
       }catch (IOException error){
           System.out.println(error.getMessage());
       }



    }
}
