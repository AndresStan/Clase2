package Ejercicio1;

import org.w3c.dom.html.HTMLDOMImplementation;

public class app {
    static void main() {

        Thread hilo1 = new Thread(new hilo1());
        Thread hilo2 = new Thread(new hilo2());


        try {

            hilo1.start();
            Thread.sleep(50);
            hilo2.start();

            Thread.sleep(5000);
            hilo1.interrupt();
            hilo2.interrupt();

            hilo1.join();
            hilo2.join();

        } catch (InterruptedException interruptedException) {
            System.out.println(interruptedException);
        }

        System.out.println("Hilo principal finalizado");
    }
}


class hilo1 implements Runnable {

    @Override
    public void run() {

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hilo-Hola: Hola");
                Thread.sleep(1000);
            }

        } catch (InterruptedException interruptedException) {
            System.out.println(interruptedException);
            System.out.println("HILO HOLA FINALIZADO");
            return;
        }


    }
}

class hilo2 implements Runnable {

    @Override
    public void run() {

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hilo-DAM: DAM");
                Thread.sleep(1000);
            }

        } catch (InterruptedException interruptedException) {
            System.out.println(interruptedException);
            System.out.println("HILO DAM FINALIZADO");
            return;
        }

    }
}
