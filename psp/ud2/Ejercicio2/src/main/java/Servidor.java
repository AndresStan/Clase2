import java.io.IOException;
import java.net.ServerSocket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;


public class Servidor {


    static String variableDeCambio= "CAMBIO";
    static String variableDeParada= "CORTO";
    static String variableDeImagen = "IMAGEN";
    static String variableDeImagenStop = "IMAGENSTOP";
    static String directorioDeTrabajo = "src/main/java/media";

    static boolean[] parada = {false};

    static void main(String[] args) {

        Servidor servidor = new Servidor();

        try (ServerSocket serverSocket = new ServerSocket(8081)) {
            // Aqui explico que el servidor ha sido inicializado
            System.out.println("Servidor inicializado en puerto " + serverSocket.getLocalPort() + ". " + LocalDateTime.now());
            while (!parada[0]){
                new Thread(new ServidorThread(serverSocket.accept(), servidor)).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public List<Path> listarFicheros() throws IOException {

            return Files.list( Path.of(Servidor.directorioDeTrabajo)).toList();

    }

    public Path enviarImagen(String nombre){
            return Path.of(Servidor.directorioDeTrabajo + "/" + nombre);
    }
}
