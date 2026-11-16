package RepasoExamen.ej4_4;

import java.util.List;
import java.util.Random;

public class Consumidor implements Runnable{



    ColaTrabajos colaTrabajos;


    public Consumidor(ColaTrabajos colaTrabajos) {
        this.colaTrabajos = colaTrabajos;
    }

    @Override
    public void run() {
        try {


            for (int i = 0; i < 10; i++) {
                colaTrabajos.consumir();
                Thread.sleep(800); // 800 ms exactos entre consumos
            }


        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


    }

}
