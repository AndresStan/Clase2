import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    static void main(String[] args) {

        boolean parar = false;

       try(
               Socket socket = new Socket("localhost", 8081);
               // Para enviar
               PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
               // Para recibir
               BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
               Scanner scanner = new Scanner(System.in);
       ) {



          while (socket.getKeepAlive()){

              System.out.println(entrada.readLine());
              String respuesta = scanner.nextLine();
              salida.println(respuesta);

          }








       } catch (IOException e) {
           throw new RuntimeException(e);
       }

    }
}
