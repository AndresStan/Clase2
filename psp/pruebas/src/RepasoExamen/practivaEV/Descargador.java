package RepasoExamen.practivaEV;

import java.util.Random;

public class Descargador implements Runnable {


    private GestorDescargas gestorDescargas;
    private String nombre;

    public Descargador(GestorDescargas gestorDescargas, String nombre) {
        this.gestorDescargas = gestorDescargas;
        this.nombre = nombre;
    }

    @Override
    public void run() {

                try {
                    Thread.sleep(new Random().nextInt(1001) + 500);
                    gestorDescargas.registrarDescarga(nombre);
                } catch (InterruptedException e) {
                    System.out.println("La descarga del archivo " + nombre + " NO ha sido completada");
                    Thread.currentThread().interrupt();
                    return;
                }


    }
}
