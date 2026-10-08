package Ejercicio2;

import java.util.Arrays;
import java.util.List;

public class app {
    static void main(String[] args) {


        try {

            Thread hilosec = new Thread(new hiloSec());
            hilosec.start();
            int contador = 0;
            while (hilosec.isAlive()){

                System.out.println(Integer.parseInt(args[0]));
                System.out.println(contador);
                if (contador >= Integer.parseInt(args[0])){
                    System.out.println("Tiempo permitido de hilo sobrepasado");
                    hilosec.interrupt();
                    hilosec.join();
                    System.out.println("Tiempo total de ejecuccion de programa " + contador + " segundos");
                    break;
                }
                contador++;
                System.out.println("Hilo principal esperando...");
                Thread.sleep(1000);
            }

            hilosec.join();
        }
        catch (InterruptedException ie) {

        }

    }
}

class hiloSec implements Runnable {


    @Override
    public void run() {

        int i = 0;
        List<String> miLista = List.of("Inicio del programa", "Procesos", "Servicios", "Multihilo", "Sincronizacion", "Fin del programa");

        try {
            for  (i = 0; i < miLista.size(); i++) {
                System.out.println(miLista.get(i));
                Thread.sleep(3000);
            }
        } catch (InterruptedException ie){
            System.out.println("Interrupcion detectada:");
            for (int j = i; j < miLista.size(); j++) {
                System.out.println(miLista.get(j));
            }
            return;
        }

    }
}
