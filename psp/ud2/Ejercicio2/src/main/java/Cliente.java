import modelo.Imagen;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Scanner;

public class Cliente {
    static void main(String[] args) {

        String variableDeCambio = "CAMBIO";
        String variableDeParada = "CORTO";
        String variableDeImagen = "IMAGEN";
        String variableDeImagenStop = "IMAGENSTOP";


        try (
                Socket socket = new Socket("localhost", 8081);
                // Salida
                PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
                // Entrada
                BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                // Entrada objeto
                ObjectInputStream entradaObjeto = new ObjectInputStream(socket.getInputStream());

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

                        if (respuesta.equals(variableDeImagen)){
                            Imagen imagen = (Imagen) entradaObjeto.readObject();
                            Path archivo = Path.of("src/main/java/mediaCliente").resolve(imagen.getNombre());
                            Files.write(archivo, imagen.getDatos());
                        } else {
                            System.out.println(respuesta);
                        }

                    }
                }

                envio = sc.nextLine();
                salida.println(envio);

            }




        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Ha ocurrido un error al guardar la imagen");
            throw new RuntimeException(e);
        }

    }
}
