package RepasoExamen.ej4_1;

public class dam implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 9; i++) {
                System.out.println(" HILO DAM: DAM");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("HILO DAM INTERRUMPIDO");

        }
    }
}
