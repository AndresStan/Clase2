package pruebasVarias;

import java.util.Random;

public class Sumador implements Runnable{

    private Modelo numero;
    private int cantidad;


    public Sumador(Modelo numero, int cantidad) {
        this.numero = numero;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < cantidad; i++) {
                    numero.Incrementar();
                    Random random = new Random();
                    Thread.sleep(random.nextInt(1000));
            }


        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {

        }




    }
}
