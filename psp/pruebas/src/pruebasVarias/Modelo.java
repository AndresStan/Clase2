package pruebasVarias;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class Modelo {

    private int numero;
    private int tamano;

    public synchronized void Incrementar() {
       try {
           while (this.numero == tamano){
               wait();
           }
           numero++;
           System.out.println("Numero aumentado, actualmente "  + this.numero);
           notifyAll();

       } catch (InterruptedException e){
           System.out.println(e);
       }
    }

    public synchronized void Decrementar() {
        try {
            while (this.numero == 0){
                wait();
            }
            numero--;
            System.out.println("Numero Decrementado, actualmente " + this.numero);
            notifyAll();

        } catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public Modelo(int numero, int tamano) {
        this.numero = numero;
        this.tamano = tamano;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
