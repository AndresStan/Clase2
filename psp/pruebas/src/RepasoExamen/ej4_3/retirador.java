package RepasoExamen.ej4_3;

public class retirador implements Runnable{

    private Cuenta cuenta;
    private double cantidad;



    public retirador(Cuenta cuenta, double cantidad) {
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
            cuenta.retirarDinero(cantidad);

    }
}
