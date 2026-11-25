import java.io.IOException;
import java.net.ServerSocket;
import java.time.LocalDateTime;

public class Servidor {


    static String variableDeCambio= "CAMBIO";
    static String variableDeParada= "CORTO";

    static boolean[] parada = {false};

    static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8081)) {
            // Aqui explico que el servidor ha sido inicializado
            System.out.println("Servidor inicializado en puerto " + serverSocket.getLocalPort() + ". " + LocalDateTime.now());
            while (!parada[0]){
                new Thread(new ServidorThread(serverSocket.accept(), new Servidor()));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }






}
