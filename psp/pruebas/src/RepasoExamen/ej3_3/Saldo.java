package RepasoExamen.ej3_3;

import java.util.Random;

public class Saldo {

    private double saldo;

    public Saldo(double saldo) {
        this.saldo = saldo;
    }

    public synchronized void anadirSaldo(double cantidad){

        System.out.println("Operacion realizada por: " + Thread.currentThread().getName() + ", por una cantidad de " + cantidad + ", con un saldo incial de " + this.saldo + ", acabando con un saldo de " + (getSaldo()+cantidad));
        this.saldo = this.saldo+cantidad;

    }

    public double getSaldo() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            return saldo;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
