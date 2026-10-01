package Ej4;
public class app {

    static void main(String[] args) {
        Thread hilo = new Thread(new hilo(Integer.parseInt(args[0])));
        hilo.start();
        int s = 1;



        try {
            while (hilo.isAlive()){

                if (s==Integer.parseInt(args[1])){
                    hilo.interrupt();
                    break;
                }

                Thread.sleep(1000);
                System.out.println("Hilo principal esperando " + s + " segundos");
                s++;
            }

        } catch (Exception e){

        }


        System.out.println("Programa principal finalizado");
    }

}
