package RepasoExamen.ej4_2;

public class app {
    static void main(String[] args) {

       try {
           int contador = 0;
           Thread hilo = new Thread(new hlihn());
           hilo.start();

           while (hilo.isAlive()){
               Thread.sleep(1000);
               contador++;
               System.out.println("hilo principal esperando");
               if (contador >= Integer.parseInt(args[0])){
                   hilo.interrupt();
                   hilo.join();
               }
           }
           System.out.println(contador);







       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

    }
}
