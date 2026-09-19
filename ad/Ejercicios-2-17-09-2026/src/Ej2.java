import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ej2 {

    public static void main(String[] args) {

        List<String> miLista = new ArrayList<>(Arrays.asList("Lunes", "Miercoles", "Viernes", "Sol"));
        Consumer<String> consumer = System.out::println;

        miLista.forEach(consumer);

    }




}
