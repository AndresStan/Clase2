package RepasoExamen.ej4_5;

import java.util.Random;

public class Corredor implements Runnable{

    private int numero;
    private Clasificacion clasificacion;
    private boolean llegado = false;
    private int metros = 0;
    private int metrosMaximos = 20;

    public Corredor(int numero, Clasificacion clasificacion) {
        this.numero = numero;
        this.clasificacion = clasificacion;
    }

    @Override
    public void run() {
        try {


            while (!llegado){

                Random random = new Random();
                int aumento = random.nextInt(3)+1;
                this.metros+=aumento;
                System.out.println("El corredor " + numero + " ha avanzado " + aumento + " metros (" + this.metros + "/" + this.metrosMaximos + ")");
                Thread.sleep(random.nextInt(400)+200);

                        if (metros >= metrosMaximos){
                            llegado = true;
                            clasificacion.ponerPuesto(numero);
                        }
            }




        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException a) {
            throw new RuntimeException(a);
        }
    }
}
