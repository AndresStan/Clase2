package RepasoExamen.ej3_3;

public class hilin implements Runnable{

    Saldo sadin;
    double cantidad;

    public hilin(Saldo sadin, double cantidad) {
        this.sadin = sadin;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {



            sadin.anadirSaldo(cantidad);



    }
}
