package RepasoExamen.practivaEV;

public class GestorDescargas {

    private int descargasCompletadas = 0;

    public synchronized void registrarDescarga(String nombreArchivo){

        descargasCompletadas++;
        System.out.println("HILO: " + Thread.currentThread().getName() + "Descarga: " + nombreArchivo + " completada, total:" +this.descargasCompletadas);

    }

    public int getDescargasCompletadas(){
        return this.descargasCompletadas;
    }



}
