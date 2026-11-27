import modelo.Contacto;
import java.io.IOException;
import java.net.ServerSocket;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Servidor {
    static String variableDeParada = "CORTO";
    static String variableDeCambio = "CAMBIO";
    static List<Contacto> listaContactosServidor = new ArrayList<>();
    static void main(String[] args) {
        // Meto contactos para simular que hay
        Contacto contacto1 = new Contacto("Andres", "643633410", "aastan@iesch.org");
        Contacto contacto2 = new Contacto("Iker", "676767676", "ilozanor@iesch.org");
        Contacto contacto3 = new Contacto("Alfonso", "610610610", "asorianom@iesch.org");
        listaContactosServidor.addAll(Arrays.asList(contacto1,contacto2,contacto3));
        Servidor servidor = new Servidor();

            try (ServerSocket serverSocket = new ServerSocket(8081)) {
                System.out.println("Servidor encendido en puerto " + serverSocket.getLocalPort() + " " + LocalDateTime.now());
                while (true){
                    new Thread(new ServidorThread(serverSocket.accept(), servidor)).start();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }
}
