package pruebasVarias;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class prueba1 {
    public static void main(String[] args) {
        // Creamos el modelo compartido (igual que el tuyo)
        Modelo numero = new Modelo(0, 10);


        ExecutorService executor = Executors.newFixedThreadPool(3);


        List<Future<?>> futures = new ArrayList<>();

        // 2. Enviamos las tareas al executor usando submit()
        futures.add(executor.submit(new Sumador(numero, 100)));
        futures.add(executor.submit(new Sumador(numero, 100)));
        futures.add(executor.submit(new Restador(numero, 100)));

        // 3. Solicitamos el apagado ordenado del executor (no acepta más tareas, pero termina las actuales)
        executor.shutdown();

        try {
            // 4. Equivalente al join(): esperamos a que todas las tareas del pool finalicen
            for (Future<?> future : futures) {
                future.get(); // Se bloquea hasta que esa tarea concreta termine
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Mostramos el resultado final
        System.out.println("Valor final del número: " + numero.getNumero());
    }
}
