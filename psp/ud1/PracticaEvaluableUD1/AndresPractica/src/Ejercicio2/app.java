package Ejercicio2;

import java.util.TreeMap;

public class app {
    static void main() {

        ColaTareas colaTareas = new ColaTareas();

        Thread productor1 = new Thread(new Productor(colaTareas));
        Thread consumidor1 = new Thread(new Consumidor(colaTareas));
        Thread consumidor2 = new Thread(new Consumidor(colaTareas));

        productor1.start();
        consumidor1.start();
        consumidor2.start();

        // no me da tiempo a seguir

    }
}

class Productor implements Runnable {

    public Productor(ColaTareas colaTareas) {
        this.colaTareas = colaTareas;
    }

    private ColaTareas colaTareas;


    @Override
    public void run() {
        try {

            colaTareas.producir(1);
            Thread.sleep(500);
            colaTareas.producir(2);
            Thread.sleep(500);
            colaTareas.producir(3);
            Thread.sleep(500);
            colaTareas.producir(4);
            Thread.sleep(500);
            colaTareas.producir(5);
            Thread.sleep(500);
            colaTareas.producir(6);
            Thread.sleep(500);
            colaTareas.producir(7);
            Thread.sleep(500);
            colaTareas.producir(8);
            Thread.sleep(500);
            colaTareas.producir(9);
            Thread.sleep(500);
            colaTareas.producir(10);



        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}


class Consumidor implements Runnable {

    private ColaTareas colaTareas;

    public Consumidor(ColaTareas colaTareas) {
        this.colaTareas = colaTareas;
    }

    @Override
    public void run() {
        try {


            colaTareas.consumir();
            Thread.sleep(800);



        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}