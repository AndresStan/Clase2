package RepasoExamen.practivaEV;

public class app {

    static void main(String[] args) {

       try {
           GestorDescargas gestorDescargas = new GestorDescargas();

           Thread descargador1 = new Thread(new Descargador(gestorDescargas, "app1"));
           Thread descargador2 = new Thread(new Descargador(gestorDescargas, "app2"));
           Thread descargador3 = new Thread(new Descargador(gestorDescargas, "app3"));
           Thread descargador4 = new Thread(new Descargador(gestorDescargas, "app4"));

           descargador1.start();
           descargador2.start();
           descargador3.start();
           descargador4.start();

           descargador1.join();
           descargador2.join();
           descargador3.join();
           descargador4.join();
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
    }

}
