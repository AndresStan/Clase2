package Ejercicio1;

public class GestorDescargas {

    private int descargasCompletadas = 0;


    public GestorDescargas() {
    }

    public synchronized void registrarDescarga(String nombreArchivo, String nombreHilo){
        descargasCompletadas = descargasCompletadas+1;
        System.out.println("HILO - " + nombreHilo + ", " + nombreArchivo + ", total: " + this.descargasCompletadas );
    }

    public int getDescargasCompletadas(){
        return this.descargasCompletadas;
    }


}
