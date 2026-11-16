package RepasoExamen.ej4_2;

public class hlihn implements Runnable {

    String[] lista = {"Inicio del programa",
            "Procesos",
            "Servicios",
            "Multihilo",
            "Sincronización",
            "Fin del programa"};
    int contador = 0;

    @Override
    public void run() {
        try {
            for (contador = 0; contador < lista.length ; contador++) {
                System.out.println(lista[contador]);
                Thread.sleep(3000);

            }


        } catch (InterruptedException e) {
            for (int i = contador; i < lista.length ; i++) {
                System.out.println(lista[contador++]);
            }
        }
    }
}
