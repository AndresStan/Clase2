import modelo.Contacto;

import java.io.*;
import java.net.Socket;
import java.util.Objects;
import java.util.Scanner;

public class Cliente {
    static void main(String[] args) {
        String variableDeParada = "CORTO";
        String variableDeCambio = "CAMBIO";
        String variableDeObjeto = "OBJETO";
        String respuesta = "";
        try {
          Socket socket = new Socket("localhost", 8081);
          try (
                  PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
                  BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                  ObjectInputStream entradaObjeto = new ObjectInputStream(socket.getInputStream());
                  Scanner sc = new Scanner(System.in);
          ) {
              while (true){
                  while (!Objects.equals(respuesta = entrada.readLine(), variableDeCambio)){
                      if (Objects.equals(respuesta, variableDeParada)){
                          return;
                      }
                      if (Objects.equals(respuesta, variableDeObjeto)){
                          Contacto contacto = (Contacto) entradaObjeto.readObject();
                          System.out.println(contacto);
                      } else {
                          System.out.println(respuesta);
                      }
                  }
                  String envio = sc.nextLine();
                  salida.println(envio);
              }
          } catch (ClassNotFoundException e) {
              throw new RuntimeException(e);
          }
        } catch (IOException e) {
          throw new RuntimeException(e);
      }
    }
}
