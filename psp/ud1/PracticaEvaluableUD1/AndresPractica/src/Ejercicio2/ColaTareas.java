package Ejercicio2;

import java.util.Queue;

public class ColaTareas {

    private Queue<Integer> cola;


    public synchronized void producir(int tarea){
        try {
            while (cola.size() > 3){
                wait();
            }
            cola.add(tarea);
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
            System.out.println("CONSUMIDOR - TAREA CONSUMIDA: " + cola.peek());
            cola.poll();
            notifyAll();
        } catch (InterruptedException e){

        }
    }

}
