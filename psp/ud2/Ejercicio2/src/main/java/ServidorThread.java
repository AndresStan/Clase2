import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class ServidorThread implements Runnable {


    private Socket socket;
    private Servidor servidor;
    private boolean seguir = false;

    public ServidorThread(Socket socket, Servidor servidor) {
        this.socket = socket;
        this.servidor = servidor;
    }

    @Override
    public void run() {

        try (
                PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()))


                ) {

                while (seguir){
                    salida.println("Hola!");
                }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
