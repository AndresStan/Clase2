package RepasoExamen.ej4_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;

public class ColaTrabajos {
    private Queue<Integer> numero = new LinkedList<>();

    private int maximo = 5;

    public synchronized void producir(int tarea){
        try {
            while (numero.size() == 5){
                wait();
            }

                numero.add(tarea);
                notifyAll();
                System.out.println(Thread.currentThread().getName() + " tarea produce: " + tarea);



        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public synchronized void consumir(){
        try {
            while (numero.isEmpty()){
                wait();
            }
                int tarea = numero.poll();
                System.out.println(Thread.currentThread().getName() + " tarea consume: " + tarea);
                notifyAll();


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
