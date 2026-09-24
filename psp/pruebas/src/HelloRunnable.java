public class HelloRunnable implements Runnable {

    public static int contador = 0;

    public void run() {
        contador++;
        System.out.println(contador);
    }
    public static void main(String args[]) throws InterruptedException {
        new Thread(new HelloRunnable()).start();
        new Thread(new HelloRunnable()).start();
        new Thread(new HelloRunnable()).start();
        Thread.sleep(1000);
        new Thread(new HelloRunnable()).start();
        new Thread(new HelloRunnable()).start();
        new Thread(new HelloRunnable()).start();
        new Thread(new HelloRunnable()).start();
        new Thread(new HelloRunnable()).start();
        new Thread(new HelloRunnable()).start();
        new Thread(new HelloRunnable()).start();
        new Thread(new HelloRunnable()).start();
        new Thread(new HelloRunnable()).start();
        new Thread(new HelloRunnable()).start();
        new Thread(new HelloRunnable()).start();
        new Thread(new HelloRunnable()).start();
        new Thread(new HelloRunnable()).start();
        new Thread(new HelloRunnable()).start();
    }
}