package RepasoExamen.ej4_4;

import java.util.List;

public class app {
    static void main() {

       try {
           ColaTrabajos colaTrabajos = new ColaTrabajos();

           Thread hiloProductor1  = new Thread(new Productor(colaTrabajos, 1));
           Thread hiloProductor2  = new Thread(new Productor(colaTrabajos, 2));
           Thread hiloConsumidor1 = new Thread(new Consumidor(colaTrabajos));
           Thread hiloConsumidor2 = new Thread(new Consumidor(colaTrabajos));

           hiloProductor1.start();
           hiloProductor2.start();

           hiloConsumidor1.start();
           hiloConsumidor2.start();

           hiloProductor1.join();
           hiloProductor2.join();
           hiloConsumidor1.join();
           hiloConsumidor2.join();

           System.out.println("Main Finalizado");
       } catch (InterruptedException e) {
           System.out.println(e);
       }
    }
}
