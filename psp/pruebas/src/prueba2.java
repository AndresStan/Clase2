public class prueba2 implements Runnable{

    public static int contador = 0;

    public void run(){
        contador++;
        System.out.println(contador);
    }


    static void main() {


        for (int i = 0; i < 10000; i++){
            new Thread(new prueba2()).start();
        }



    }


}
