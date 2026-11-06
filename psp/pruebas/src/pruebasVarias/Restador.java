package pruebasVarias;

import java.util.Random;

public class Restador implements Runnable{

    private Modelo numero;
    private int cantidad;

    public Restador(Modelo numero, int cantidad) {
        this.numero = numero;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < cantidad; i++) {

                    numero.Decrementar();
                    Random random = new Random();
                    Thread.sleep(random.nextInt(1000));

            }


        } catch (InterruptedException e) {
            System.out.println(e);
        }


    }
}
