import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Objects;
import java.util.Scanner;

public class Cliente {
    static void main(String[] args) {
        boolean parar = false;
        String variableDeParada = "CAMBIO";
       try(
               Socket socket = new Socket("localhost", 8081);
               // Para enviar
               PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
               // Para recibir
               BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
               Scanner scanner = new Scanner(System.in);
       ) {
          String respuesta = "";
          while (!parar){
              while (!Objects.equals(respuesta = entrada.readLine(), variableDeParada)) {
                  if (Objects.equals(respuesta, "APAGAR")){
                      return;
                  }
                  System.out.println(respuesta);
                  respuesta = "";
              }
              respuesta = "";
              String respuestaEnviada = scanner.nextLine();
              salida.println(respuestaEnviada);
          }
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }
}
