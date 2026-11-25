import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.file.Path;

public class ServidorThread implements Runnable{

    private Socket socket;

    private Servidor servidor;

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
            salida.println("Elige una opcion: (1 - Para Listar) (2 - Para mostrar) (3 - Para Salir)");
            salida.println("CAMBIO");
            while (!Servidor.parada[0]){

                int caso;
                try {
                    caso = Integer.parseInt(entrada.readLine());
                } catch (NumberFormatException e) {
                    caso = 99;
                }

                switch (caso){
                    case 1:
                        salida.println("A continuacion te muestro los ficheros:");
                        for (Path nombre : servidor.listarFicheros()){
                            salida.println(nombre);
                        }
                        salida.println("Elige una opcion: (1 - Para Listar) (2 - Para mostrar) (3 - Para Salir)");
                        salida.println("CAMBIO");
                        break;

                    case 2:
                        salida.println("Dime el nombre del fichero");
                        salida.println("CAMBIO");
                        String nombre = entrada.readLine();
                        salida.println(servidor.mostrarFichero(nombre));
                        salida.println("Elige una opcion: (1 - Para Listar) (2 - Para mostrar) (3 - Para Salir)");
                        salida.println("CAMBIO");
                        break;

                    case 3:
                        salida.println("Hasta luego!");
                        salida.println("APAGAR");
                        this.socket.close();


                    default:
                        salida.println("Porfavor indica un valor valido");
                        salida.println("Elige una opcion: (1 - Para Listar) (2 - Para mostrar) (3 - Para Salir)");
                        salida.println("CAMBIO");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Comunicacion cerrado");
        }
    }
}
