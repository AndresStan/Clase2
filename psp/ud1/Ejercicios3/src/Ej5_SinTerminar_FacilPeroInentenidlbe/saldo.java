package Ej5_SinTerminar_FacilPeroInentenidlbe;

public class saldo {

    private double saldo;

    public saldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) throws InterruptedException {
        this.saldo = saldo;
        Thread.sleep(3000);
    }

    private synchronized void  sumarCantidad(double cantidad){
        System.out.println("Operacion realizada por: " + Thread.currentThread());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Saldo inicial: " + this.saldo);
        this.saldo += cantidad;
        System.out.println("Saldo final: " + this.saldo);
    }
}
