package RepasoExamen.ej4_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Productor implements Runnable{

    ColaTrabajos colaTrabajos;
    int idProd;

    public Productor(ColaTrabajos colaTrabajos, int idProd) {
        this.colaTrabajos = colaTrabajos;
        this.idProd = idProd;
    }

    @Override
    public void run() {
        try {

            for (int i = 0; i < 10; i++) {
                colaTrabajos.producir(new Random().nextInt(100)*idProd);
                Thread.sleep(new Random().nextInt(500));
            }


        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


    }


}


