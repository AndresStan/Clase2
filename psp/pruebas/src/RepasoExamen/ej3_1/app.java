package RepasoExamen.ej3_1;

public class app {
    static void main(String[] args) {

     try {
         Thread hilo1 = new Thread(new hola());
         Thread hilo2 = new Thread(new mundo());

         hilo1.start();
         hilo2.start();

         Thread.sleep(5000);
         hilo1.interrupt();


     } catch (InterruptedException e) {
         System.out.println(e);
     }

    }
}


