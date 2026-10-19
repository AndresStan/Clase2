package Ejercicio2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ColaTareas {

    private Queue<Integer> cola = new LinkedList<>();


    public synchronized void producir(int tarea){
        try {
            while (cola.size() >= 3){
                wait();
            }
            cola.offer(tarea);

            System.out.println("PRODUCTOR - TAREA PRODUCIDA: " + tarea);
            notifyAll();
        } catch (InterruptedException e){

        }
    }

    public synchronized void consumir(){
        try {
            while (cola.isEmpty()){
                wait();
            }

            if (cola.peek() == -1){
                return;
            }

            Random random = new Random();
            Thread.sleep(random.nextInt(800));
            System.out.println("CONSUMIDOR - TAREA CONSUMIDA: " + cola.peek());
            cola.poll();
            notifyAll();
        } catch (InterruptedException e){

        }
    }

}
