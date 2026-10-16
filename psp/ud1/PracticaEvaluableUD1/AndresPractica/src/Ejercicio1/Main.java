package Ejercicio1;

public class Main {
    static void main() {
        try {

            GestorDescargas gestorDescargas = new GestorDescargas();
            Thread hilo1 = new Thread(new Descargador("torrente.mp4", gestorDescargas, "1"));
            Thread hilo2 = new Thread(new Descargador("cs2", gestorDescargas, "2"));
            Thread hilo3 = new Thread(new Descargador("alyga", gestorDescargas, "3"));
            Thread hilo4 = new Thread(new Descargador("TheDictator", gestorDescargas, "4"));
            Thread hilo5 = new Thread(new Descargador("Alibaba", gestorDescargas, "5"));
            Thread hilo6 = new Thread(new Descargador("Clavin", gestorDescargas, "6"));

            hilo1.start();
            hilo2.start();
            hilo3.start();
            hilo4.start();
            hilo5.start();
            hilo6.start();

            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
            hilo5.join();
            hilo6.join();

            System.out.println(gestorDescargas.getDescargasCompletadas());


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
