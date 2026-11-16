package RepasoExamen.ej4_1;

public class hola implements Runnable{
    @Override
    public void run() {

        try {
            for (int i = 0; i < 9; i++) {
                System.out.println("HILO HOLA: Hola");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("HILO HOLA INTERRUMPIDO");

        }

    }
}
