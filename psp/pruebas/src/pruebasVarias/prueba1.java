package pruebasVarias;

import java.util.concurrent.atomic.AtomicInteger;

public class prueba1 {
    static void main() {

        Modelo numero = new Modelo(0, 10);
        try {

            Thread hiloSumador = new Thread(new Sumador(numero, 100));
            hiloSumador.start();

            Thread hiloSumador2 = new Thread(new Sumador(numero, 100));
            hiloSumador2.start();

            Thread hiloRestador = new Thread(new Restador(numero, 100));
            hiloRestador.start();

            hiloSumador.join();
            hiloSumador2.join();
            hiloRestador.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(numero.getNumero());

    }
}
