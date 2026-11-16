package RepasoExamen.ej3_1;

import java.util.Random;

public class hola implements Runnable{


    @Override
    public void run() {

        Random random = new Random();


        try {

            for (int i = 1; i <= 15; i++) {
                Thread.sleep(2000);
                System.out.print("hola " );
            }

        } catch (InterruptedException e) {
            System.out.println("Hilo hola finalizado");

        }

    }
}
