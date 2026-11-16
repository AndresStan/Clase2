package RepasoExamen.practicaEVPARTE2;

public class app {

    static void main(String[] args) {

     try {
         ColaTareas colaTareas = new ColaTareas();

         Thread productor1 = new Thread(new Productor(colaTareas));
         Thread consumidor1 = new Thread(new Consumidor(colaTareas));
         Thread consumidor2 = new Thread(new Consumidor(colaTareas));


         productor1.start();
         consumidor1.start();
         consumidor2.start();

         productor1.join();
         consumidor1.join();
         consumidor2.join();


     } catch (InterruptedException e) {
         throw new RuntimeException(e);
     }

    }
}
