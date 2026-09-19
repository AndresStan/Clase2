import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ej5 {
    public static void main(String[] args) {


        List<String> miLista = new ArrayList<>(Arrays.asList("Lunes", "Miercoles", "Viernes", "Sol", "Andres"));

        Predicate<String> predicate = a -> a.startsWith("A");
        miLista = miLista.stream().filter(predicate).toList();
        System.out.println(miLista);

    }
}
