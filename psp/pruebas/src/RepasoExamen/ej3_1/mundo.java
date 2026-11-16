package RepasoExamen.ej3_1;

public class mundo implements Runnable{
    @Override
    public void run() {


        try {

            for (int i = 1; i <= 15; i++) {
                Thread.sleep(2000);
                System.out.print("mundo! \n" );
            }

        } catch (InterruptedException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}
