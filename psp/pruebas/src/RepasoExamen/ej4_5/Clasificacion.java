package RepasoExamen.ej4_5;

public class Clasificacion {


    private int contador = 1;




    public synchronized void ponerPuesto(int numero){
        System.out.println("El corredor: " + numero + " ha llegado el " + contador++);
    }

}
