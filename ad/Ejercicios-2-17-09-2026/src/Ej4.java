import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Ej4 {
    public static void main(String[] args) {


        Supplier<Integer> supplier = () -> new Random().nextInt(0, 10);

        List<Integer> miLista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println(supplier.get());
        }

    }
}
