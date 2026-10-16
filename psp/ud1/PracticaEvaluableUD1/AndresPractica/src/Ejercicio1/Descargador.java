package Ejercicio1;

import java.util.Random;

public class Descargador implements Runnable{

    private GestorDescargas gestorDescargas;
    private String nombre;
    private String nombreHilo;


    public Descargador(String nombre, GestorDescargas gestorDescargas, String nombreHilo) {
        this.nombre = nombre;
        this.gestorDescargas = gestorDescargas;
        this.nombreHilo = nombreHilo;
    }



    @Override
    public void run() {

        try {
            Random random = new Random();
            int cantidad = random.nextInt(500,1501);
            Thread.sleep(cantidad);
            gestorDescargas.registrarDescarga(nombre, this.nombreHilo);

        } catch (InterruptedException e) {
            System.out.println("La descarga ha sido interrumpida");

            return;
        }

    }

}
