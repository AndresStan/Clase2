import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ej6 {

    public static Set<String> originales(List<String> l){
        return new HashSet<>(l);
    }

    public static void main(String[] args) {

        List<String> miLista = List.of("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Martes");
        System.out.println(originales(miLista));



    }
}
