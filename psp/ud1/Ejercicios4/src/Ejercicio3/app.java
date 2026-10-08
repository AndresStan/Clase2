package Ejercicio3;

public class app {
    static void main() {



        try {
            cuenta cuenta = new cuenta(1000);

            Thread hilo1 = new Thread(new hilo1(cuenta));
            Thread hilo2 = new Thread(new hilo2(cuenta));
            Thread hilo3 = new Thread(new hilo3(cuenta));
            Thread hilo4 = new Thread(new hilo4(cuenta));
            Thread hilo5 = new Thread(new hilo5(cuenta));

            hilo1.start();
            hilo2.start();
            hilo3.start();
            hilo4.start();
            hilo5.start();

            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
            hilo5.join();

            System.out.println(cuenta.getSaldo());
        } catch (InterruptedException ie){

        }


    }
}

class hilo1 implements Runnable {

    private cuenta cuentapropia;

    public hilo1(cuenta cuentapropia) {
        this.cuentapropia = cuentapropia;
    }



    @Override
    public void run() {

        try {

            cuentapropia.ingresarDinero(3000, "hilo1");
            cuentapropia.ingresarDinero(2000, "hilo1");
            cuentapropia.ingresarDinero(1000, "hilo1");
            cuentapropia.ingresarDinero(4000, "hilo1");
            cuentapropia.ingresarDinero(5530, "hilo1");



        } catch (Exception e) {


        }


    }

}


class hilo5 implements Runnable {

    private cuenta cuentapropia;

    public hilo5(cuenta cuentapropia) {
        this.cuentapropia = cuentapropia;
    }



    @Override
    public void run() {

        try {

            cuentapropia.retirarDinero(2500, "hilo5");
            cuentapropia.retirarDinero(1500, "hilo5");
            cuentapropia.retirarDinero(500, "hilo5");
            cuentapropia.retirarDinero(200, "hilo5");
            cuentapropia.retirarDinero(160, "hilo5");



        } catch (Exception e) {


        }


    }

}


class hilo4 implements Runnable {

    private cuenta cuentapropia;

    public hilo4(cuenta cuentapropia) {
        this.cuentapropia = cuentapropia;
    }



    @Override
    public void run() {

        try {

            cuentapropia.ingresarDinero(300, "hilo4");
            cuentapropia.ingresarDinero(2030, "hilo4");
            cuentapropia.ingresarDinero(100, "hilo4");
            cuentapropia.ingresarDinero(450, "hilo4");
            cuentapropia.ingresarDinero(580, "hilo4");



        } catch (Exception e) {


        }


    }

}


class hilo3 implements Runnable {

    private cuenta cuentapropia;

    public hilo3(cuenta cuentapropia) {
        this.cuentapropia = cuentapropia;
    }



    @Override
    public void run() {

        try {

            cuentapropia.ingresarDinero(4500, "hilo3");
            cuentapropia.ingresarDinero(2400, "hilo3");
            cuentapropia.ingresarDinero(1200, "hilo3");
            cuentapropia.ingresarDinero(4200, "hilo3");
            cuentapropia.ingresarDinero(5130, "hilo3");



        } catch (Exception e) {


        }


    }

}


class hilo2 implements Runnable {

    private cuenta cuentapropia;

    public hilo2(cuenta cuentapropia) {
        this.cuentapropia = cuentapropia;
    }



    @Override
    public void run() {

        try {

            cuentapropia.retirarDinero(1500, "hilo2");
            cuentapropia.retirarDinero(2500, "hilo2");
            cuentapropia.retirarDinero(100, "hilo2");
            cuentapropia.retirarDinero(500, "hilo2");
            cuentapropia.retirarDinero(265, "hilo2");



        } catch (Exception e) {


        }


    }

}


