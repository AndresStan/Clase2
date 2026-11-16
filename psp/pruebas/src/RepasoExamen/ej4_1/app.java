package RepasoExamen.ej4_1;

public class app {
    static void main() {

        try {


            Thread hhola = new Thread(new hola());


            Thread hdam = new Thread(new dam());

            hhola.start();
            Thread.sleep(50);
            hdam.start();

            Thread.sleep(5000);
            hhola.interrupt();
            hdam.interrupt();


            hhola.join();
            hdam.join();

            System.out.println("Programa principal finalizado");



        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
