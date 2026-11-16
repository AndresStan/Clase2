package RepasoExamen.ej4_3;

import pruebasVarias.Restador;

public class app {
    static void main(String[] args) {

       try {
           Cuenta cuenta = new Cuenta(1000);
           Thread hilo1 = new Thread(new ingresador(cuenta, 300));

           Thread hilo2 = new Thread(new ingresador(cuenta, 5000));
           Thread hilo3 = new Thread(new retirador(cuenta, 300));
           Thread hilo4 = new Thread(new retirador(cuenta, 300));

           Thread hilo5 = new Thread(new ingresador(cuenta, 100));

           Thread hilo6 = new Thread(new retirador(cuenta, 300));

           hilo1.start();
           hilo2.start();
           hilo3.start();
           hilo4.start();
           hilo5.start();
           hilo6.start();


           hilo1.join();
           hilo2.join();
           hilo3.join();
           hilo4.join();
           hilo5.join();
           hilo6.join();

           System.out.println(cuenta.getSaldo());

       } catch (Exception e) {
           throw new RuntimeException(e);
       }




    }
}
