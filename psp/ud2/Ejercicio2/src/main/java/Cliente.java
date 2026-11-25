import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Objects;
import java.util.Scanner;

public class Cliente {
    static void main(String[] args) {

        String variableDeCambio = "CAMBIO";
        String variableDeParada = "CORTO";

        try (
                Socket socket = new Socket("localhost", 8081);
                // Salida
                PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
                // Entrada
                BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                // Scanner
                Scanner sc = new Scanner(System.in);
        ) {

            String respuesta = "";
            String envio = "";
            while (true){
                respuesta = "";
                // Hasta que el servidor no diga cambio
                while (!Objects.equals(respuesta = entrada.readLine(), variableDeCambio)){
                    // Si es de parada paro el cliente
                    if (Objects.equals(respuesta, variableDeParada)){
                        return;
                    } else {
                        System.out.println(respuesta);
                    }
                }

                envio = sc.nextLine();
                salida.println(envio);

            }




        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
