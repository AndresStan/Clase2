import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ej6 {
    public static void main(String[] args) {

        List<Integer> miLista = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Consumer<Integer> consumer = a -> System.out.println(a*2);

        miLista.forEach(consumer);
    }
}
