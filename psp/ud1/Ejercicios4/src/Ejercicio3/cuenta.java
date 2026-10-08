package Ejercicio3;

import java.util.Random;

public class cuenta {

    private double saldo;
    private Object lock1 = new Object();

    public cuenta(double saldo) {
        this.saldo = saldo;

    }

    public double getSaldo() {
        synchronized (lock1){
            return saldo;
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    public void ingresarDinero(int dinero, String nombre){

        synchronized (lock1){
            try {
                Thread.sleep(devolverRandom());
                this.saldo+=dinero;
                System.out.println("Hilo: " + nombre + " Tipo operacion: ingresar, Cantidad: " + dinero + " Saldo anterior: " + this.saldo + " Saldo final: " + (this.getSaldo() + dinero));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void retirarDinero(int dinero, String nombre){

        synchronized (lock1){
            try {
                Thread.sleep(devolverRandom());
                this.saldo-=dinero;
                System.out.println("Hilo: " + nombre + " Tipo operacion: retirar, Cantidad: " + dinero + " Saldo anterior: " + this.saldo + " Saldo final: " + (this.getSaldo() - dinero));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public int devolverRandom(){
        Random random = new Random();
        return random.nextInt(100, 501);
    }

}
