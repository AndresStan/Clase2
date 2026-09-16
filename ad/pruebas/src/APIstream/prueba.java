package APIstream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class prueba {
    static void main() {

        List<Integer> miLista = Arrays.asList(1,2,3,4,5,6,7,8,9, 10);
        calculaCuadrados(miLista);

    }

    public static void calculaCuadrados(List<Integer> lista){

        Predicate<Integer> filtroPar = n -> n%2 == 0;
        Function<Integer, Integer> mapeadoCuadrados = n -> n*n;
        Consumer<Integer> miPrint = s -> System.out.println(s);


        List<Integer> cuadrados = lista.stream()
                                        .filter(filtroPar)
                                        .map(mapeadoCuadrados)
                                        .toList();



        System.out.println(cuadrados);


    }
}
