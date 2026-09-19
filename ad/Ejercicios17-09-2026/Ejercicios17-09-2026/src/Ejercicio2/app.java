package Ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class app {
    static void main() {

        List<String> miLista = new ArrayList<>(Arrays.asList("Andres", "Luis", "Gabriel", "Nadia"));

        Predicate<String> predicateEmpezarConA = a -> a.startsWith("A");
        miLista.removeIf(predicateEmpezarConA);
        System.out.println(miLista);


    }
}
