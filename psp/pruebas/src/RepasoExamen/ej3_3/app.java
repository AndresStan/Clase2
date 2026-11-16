package RepasoExamen.ej3_3;

import RepasoExamen.ej3_2.hilo;

public class app {
    static void main() {

        double valorInicial = 0;
        Saldo sadin = new Saldo(valorInicial);


        Thread thread1 = new Thread(new hilin(sadin, 100));
        Thread thread2 = new Thread(new hilin(sadin, 100));
        Thread thread3 = new Thread(new hilin(sadin, 100));
        Thread thread4 = new Thread(new hilin(sadin, 100));
        Thread thread5 = new Thread(new hilin(sadin, 100));
        Thread thread6 = new Thread(new hilin(sadin, 100));
        Thread thread7 = new Thread(new hilin(sadin, 100));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();


    }
}
