import modelo.Imagen;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

public class ServidorThread implements Runnable {


    private Socket socket;
    private Servidor servidor;
    private boolean seguir = true;

    public ServidorThread(Socket socket, Servidor servidor) {
        this.socket = socket;
        this.servidor = servidor;
    }

    @Override
    public void run() {

        try (
                PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                ObjectOutputStream salidaObjeto = new ObjectOutputStream(socket.getOutputStream())

                ) {

                while (seguir){
                    salida.println("(1) Para Listar, (2) Para Descargar Imagen, (3) Para salir");
                    salida.println(Servidor.variableDeCambio);

                    int caso;
                    try {
                        caso = Integer.parseInt(entrada.readLine());
                    } catch (NumberFormatException e){
                        caso = 99;
                    }

                    switch (caso){
                        case 1:


                            List<Path> listaFicheros = servidor.listarFicheros();
                            if (listaFicheros.isEmpty()){
                                salida.println("No se ha encontrado ningun fichero");
                            } else {
                                for (Path p : listaFicheros)
                                    salida.println(p);
                            }

                            break;

                        case 2:
                            salida.println("Porfavor indica el nombre del fichero que deseas descargar");
                            salida.println(Servidor.variableDeCambio);
                            try {
                                String nombre = entrada.readLine();
                                Path ruta = servidor.enviarImagen(nombre);
                                File file = ruta.toFile();
                                if (file.exists()){
                                    salida.println(Servidor.variableDeImagen);
                                    salidaObjeto.writeObject(new Imagen(Files.readAllBytes(ruta), nombre));
                                    salidaObjeto.flush();
                                    salida.println("Archivo " + nombre + " descargado correctamente");
                                } else {
                                    salida.println("EL fichero solicitado no existe");
                                }
                            } catch (Exception e){
                                salida.println("A ocurrido un error o no se encuentra la imagen");
                            }


                            break;

                        case 3:
                            salida.println("Hasta luego!");
                            salida.println(Servidor.variableDeParada);
                            seguir=false;
                            break;

                        default:
                            salida.println("Digito no listado");
                            break;

                    }
                }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
