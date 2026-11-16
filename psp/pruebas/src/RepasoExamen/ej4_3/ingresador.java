package RepasoExamen.ej4_3;

public class ingresador implements Runnable{

    private Cuenta cuenta;
    private double cantidad;

    public ingresador(Cuenta cuenta, double cantidad) {
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        cuenta.ingresarDinero(cantidad);

    }
}
