package Ej3;

public class hilo2 implements Runnable{

    private int cantidad;

    public hilo2( int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < cantidad; i++) {
                System.out.println(" Mundo!");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
