package RepasoExamen.ej3_2;

public class hilo implements Runnable{
    @Override
    public void run() {

        String[] lista = {"msg1", "msg2", "msg3", "msg4"};

        int contador = 0;
        try {


            for (contador = 0; contador < 4; contador++) {
                System.out.println("Hilo 1: " + lista[contador]);
                Thread.sleep(4000);
            }

        } catch (InterruptedException e){
            System.out.println("Hilo interrumpido, sacando todos los datos de una");
            for (int i = contador; i < 4; i++) {
                System.out.println(lista[contador]);
            }
        }

        System.out.println("Hilo 1 finalizado");

    }
}
