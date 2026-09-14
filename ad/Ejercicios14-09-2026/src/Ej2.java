import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ej2 {

    public static List<Integer> conseguirPares(List<Integer> a ){



        return a.stream().filter(s -> s % 2 == 0).sorted().toList();
    }

    public static void main(String[] args) {

        List<Integer> miLista = new ArrayList<>(List.of(3, 5, 8, 6, 12));

        List<Integer> miNuevaLista = conseguirPares(miLista);
        System.out.println(miNuevaLista.stream().toList());



    }
}
