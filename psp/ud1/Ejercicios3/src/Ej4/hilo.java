package Ej4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hilo implements Runnable{

    private int segundos;
    private int ms;

    public hilo(int segundos) {
        this.segundos = segundos;
        this.ms = segundos*1000;
    }

    @Override




    public void run() {


        List<String> textos = new ArrayList<>(Arrays.asList(" 2 Programas", "2 Procesos", "2 Servicios", "2 Hilos"));
        int i = 0;

       try {
           for (i = 0; i < textos.size(); i++) {
               System.out.println(textos.get(i));
               Thread.sleep(ms);
           }

       } catch (InterruptedException e){
           System.out.println("Hilo 2 interrumpido, escupiendo todo sin esperas");
           for (int j = i; i < textos.size(); i++) {
               System.out.println(textos.get(i));
           }
       }
    }
}
