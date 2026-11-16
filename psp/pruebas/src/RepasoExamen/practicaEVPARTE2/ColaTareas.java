package RepasoExamen.practicaEVPARTE2;

import java.util.LinkedList;
import java.util.Queue;

public class ColaTareas {
    Queue<Integer> cola = new LinkedList<>();
    int max = 3;
    int ultimaTarea = 0;
    boolean finalizado = false;

    public synchronized void producir(int tarea){
      try {
          while (cola.size() == max){
              wait();
          }
          cola.add(tarea);
          notifyAll();
      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }
    }

    public synchronized int consumir(){


            if (ultimaTarea == -1){
                return -1;
            }

          try {
             while (!finalizado){

                 while (cola.isEmpty()){
                     wait();
                 }
                 notifyAll();
                 int tareaConsumida = cola.poll();

                 if (tareaConsumida != -1){
                     ultimaTarea = tareaConsumida;
                     return tareaConsumida;
                 } else {
                     finalizado = true;

                 }
             }




          } catch (InterruptedException e) {
                throw new RuntimeException(e);
          }
          return -1;


    }
}
