package RepasoExamen.practicaEVPARTE2;

public class Consumidor implements Runnable{

    private ColaTareas colaTareas;
    int tareaConsumida = 0;

    public Consumidor(ColaTareas colaTareas) {
        this.colaTareas = colaTareas;
    }

    @Override
    public void run() {
        try {

            while (tareaConsumida != -1){
                tareaConsumida = colaTareas.consumir();
                if (tareaConsumida == -1){

                } else {
                    System.out.println(Thread.currentThread().getName() + " ha consumido tarea: " + tareaConsumida);
                }

                Thread.sleep(800);
            }


        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
