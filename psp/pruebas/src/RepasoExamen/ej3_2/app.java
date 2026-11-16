package RepasoExamen.ej3_2;

public class app {
    static void main(String[] args) {

        Thread hilo = new Thread(new hilo());
        hilo.start();
        int contador = 1;

        while (true){
            try {
                Thread.sleep(1000);
                System.out.println("Hilo principal esperando finalizacion de hilo hijo " + contador++ + " segundos");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }



    }
}
