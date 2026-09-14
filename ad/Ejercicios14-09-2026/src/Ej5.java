import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ej5 {

    public static Set<Integer> originales(List<Integer> l){

        return new HashSet<>(l);

    }

    public static void main(String[] args) {

        List<Integer> miLista = new ArrayList<>(List.of(3, 5, 6, 3, 4, 1, 1));

        System.out.println(originales(miLista));

    }
}
