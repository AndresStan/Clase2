import modelo.Contacto;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorThread implements Runnable{

    private Socket socket;
    private Servidor servidor;

    public ServidorThread(Socket socket, Servidor servidor) {
        this.socket = socket;
        this.servidor = servidor;
    }

    @Override
    public void run() {

                try(
                        PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
                        BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        ObjectOutputStream salidaObjeto = new ObjectOutputStream(socket.getOutputStream());
                        )
                {
                   salida.println("Bienvenido al servidor!!!");
                   while (true){
                       salida.println("(1) Listar Contactos, (2) Buscar Contactos, (3) Salir");
                       salida.println(Servidor.variableDeCambio);
                       int caso;
                       try {
                           caso = Integer.parseInt(entrada.readLine());
                       } catch (NumberFormatException e) {
                           caso = 99;
                       }
                        switch (caso){
                            case 1:
                                salida.println("Lista de contactos guardados en el servidor");
                                for (Contacto c : Servidor.listaContactosServidor){
                                    salida.println(c);
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                salida.println("Hasta luego!");
                                salida.println(Servidor.variableDeParada);
                                return;
                            default:
                                salida.println("Parametro no reconocido");
                                break;
                        }




                   }



                } catch (IOException e) {
                    throw new RuntimeException(e);
                }



    }
}
