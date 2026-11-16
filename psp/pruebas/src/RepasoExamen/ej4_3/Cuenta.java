package RepasoExamen.ej4_3;

import java.util.Random;

public class Cuenta {
    private double Saldo;

    public Cuenta(double saldo) {
        Saldo = saldo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void ingresarDinero(double cantidad){
        try {

            Thread.sleep(new Random().nextInt(400)+100);
            this.Saldo+=cantidad;

            System.out.println(Thread.currentThread().getName() + " ingresar dinero " + cantidad + getSaldo() + (getSaldo()+cantidad));


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void retirarDinero(double cantidad){

        Random random = new Random();
        this.Saldo-=cantidad;

        System.out.println(Thread.currentThread().getName() + " retirar dinero " + cantidad + getSaldo() + (getSaldo()-cantidad));

    }

}
