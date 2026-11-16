package RepasoExamen.ej4_5;

public class app {
    static void main(String[] args) {

      try {
          Clasificacion clasificacion = new Clasificacion();
          Thread corredor1 = new Thread(new Corredor(1, clasificacion ));
          Thread corredor2 = new Thread(new Corredor(2, clasificacion ));
          Thread corredor3 = new Thread(new Corredor(3, clasificacion ));
          Thread corredor4 = new Thread(new Corredor(4, clasificacion ));

            corredor1.start();
            corredor2.start();
            corredor3.start();
            corredor4.start();

            corredor1.join();
          corredor2.join();
          corredor3.join();
          corredor4.join();

      } catch (InterruptedException e){
          System.out.println(e);
      }



    }
}
