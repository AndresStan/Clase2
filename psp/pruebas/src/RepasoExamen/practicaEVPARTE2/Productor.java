package RepasoExamen.practicaEVPARTE2;

public class Productor implements Runnable {
    private ColaTareas colaTareas;

    public Productor(ColaTareas colaTareas) {
        this.colaTareas = colaTareas;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {

                System.out.println(Thread.currentThread().getName() + " tarea producida: " + i);
                colaTareas.producir(i);
                Thread.sleep(500);
            }

            colaTareas.producir(-1);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
