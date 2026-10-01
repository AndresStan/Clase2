package Ej3;

public class hilo1 implements Runnable{

    private int cantidad;

    public hilo1( int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < cantidad; i++) {
                System.out.print("Hola");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("HILO 1 FINALIZADO");
            return;
        }



    }
}
