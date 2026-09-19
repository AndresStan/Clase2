import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ej1 {
    public static void main(String[] args) {

        List<Integer> miLista = new ArrayList<>(Arrays.asList(3,4,5,76,7,8,2,34,2345,2135));

        Predicate<Integer> predicado = a -> a%2 == 0;
        System.out.println(miLista.stream().filter(predicado).toList());


    }
}
