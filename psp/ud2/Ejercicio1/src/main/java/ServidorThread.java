import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.file.Path;

public class ServidorThread implements Runnable{

    private Socket socket;
    private boolean[] parada;
    private Servidor servidor;

    public ServidorThread(Socket socket, boolean[] parada, Servidor servidor) {
        this.socket = socket;
        this.parada = parada;
        this.servidor = servidor;
    }

    @Override
    public void run() {
        // Salida


        try (
                PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            salida.println("Elige una opcion: (1 - Para Listar) (2 - Para mostrar)");


            while (!parada[0]){
                switch (Integer.parseInt(entrada.readLine())){
                    case 1:
                        salida.println("A continuacion te muestro los ficheros:");
                        break;

                    case 2:
                        salida.println("Dime el nombre del fichero");
                        String nombre = entrada.readLine();

                        break;

                    default:

                        break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
