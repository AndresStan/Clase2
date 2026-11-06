package org.example;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static void main() {



        // Segun mi cabeza lo que tiene mas sentido es hacer lo siguiente:
        // Creo una lista de hilos lectores
        // Cada hilo de ese "pool" de hilos leera la el archivo que le toca, y creara un nuevo registro de el en su clase Registro
        // Seguidamente cuando la lectura nos aseguremos de que haya terminado tendremos todos los registros creados,
        // Para posteriormente con otro gestor de hilos ir recorriendo los registros creados y ir controlando las variables pedidas

        // Problema, la he creado con cachedpool y como intenta meter + 100k archivos future nunca terminaba por saturacion
        // Voy a crear el forkJoin dividiendo en dos siempre y si son lo suficientemente pequeñas las hace el hilo si no se divide en mas en lugar de 100k de golpe
        // Problema, tarda mucho unos 5-10 segundos en leer los archivos

        // Primero de todo me creo este long para despues calcular en cuanto tiempo a terminado el programa
        long inicio = System.currentTimeMillis();

        // Me creo la lista de paths
        ArrayList<Path> listaRutas = new ArrayList<>();

        Path dir = Path.of("src/main/java/org/example/items");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path path: stream) {
                listaRutas.add(path);

            }
        } catch (IOException | DirectoryIteratorException x) {
            // IOException can never be thrown by the iteration.
            // In this snippet, it can only be thrown by newDirectoryStream.
            System.err.println(x);
        }

        // Creo la clase estadistias para llevar el conteo y la logica de TODAS las estadisticas
        EstadisticasClima estadisticasClima = new EstadisticasClima(); // Este obj estadisticas sera el que recorra todos los registros

        // CON FORK JOIN RECURSIVO evita la saturacion
        try (ForkJoinPool forkJoinPool = new ForkJoinPool()) {
            Lector tareaPrincipal = new Lector(0, listaRutas.size(), listaRutas, estadisticasClima);
            forkJoinPool.invoke(tareaPrincipal);
            forkJoinPool.shutdown();
            System.out.println(forkJoinPool.awaitTermination(100, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        // Finalmente calculo cuanto tiempo a tardado el programa restando
        long fin = System.currentTimeMillis();
        System.out.println(fin-inicio + " milisegundos");

        // Y muesto las estadisticas
        estadisticasClima.mostrarResultados();
        // MAL CON CACHED
//        // Me creo el pool que ira creando hilos como el prefiera segun los disponibles
//        try (ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool()) {
//
//           //Creamos la lista para los resultados, contendrá objetos de tipo Future
//            List<Future<String>> DatosPedidosString;
//            DatosPedidosString = executor.invokeAll(listaLectores);
//
//            for (Future<String> datos : DatosPedidosString){
//
//                System.out.println(datos.get());
//            }
//
//
//
//        } catch (InterruptedException | ExecutionException e) {
//            throw new RuntimeException(e);
//        }


    }
}
