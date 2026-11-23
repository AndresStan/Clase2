import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.nio.file.Path;
import java.time.LocalDateTime;

public class Servidor {


    int port = 8081;
    static Path directorio = Path.of("src/main/java/media");
    static boolean[] parada = {false};


    static void main() {


        try (ServerSocket serverSocket = new ServerSocket(8081)) {

            // variable que indica la parada

            // Servidor saca que inicializa
            System.out.println("Server Started on " + serverSocket.getLocalPort() + " at " + LocalDateTime.now());

            while (!parada[0]){
                try {

                    new Thread(new ServidorThread(serverSocket.accept(), parada, new Servidor())).start();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public synchronized String mostrarFichero(String nombreFichero){
        String rutaCompleta = directorio.toString() + "/" + nombreFichero;
        File file = new File(rutaCompleta);
        System.out.println(file.exists());
        return "";
    }

}
