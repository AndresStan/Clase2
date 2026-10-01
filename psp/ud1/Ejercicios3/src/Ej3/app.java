package Ej3;

public class app{
    static void main() {

        Thread hilo1 = new Thread(new hilo1(15));
        Thread hilo2 = new Thread(new hilo2(15));


        try {

            hilo1.start();
            hilo2.start();

            Thread.sleep(5000);
            hilo1.interrupt();


        } catch (Exception e) {

        }
    }
}
