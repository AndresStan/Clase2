package Ej1y2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class app {
    public static void main(String[] args) {

        List<Fruta> fruteria = new ArrayList<>(Arrays.asList(new Fruta("Manzana", "Roja"),
                                                            new Fruta("Naranja", "Naranja"),
                                                            new Fruta("Pera", "Verde"),
                                                            new Fruta("Kiwi", "Verde")));

        fruteria.forEach(System.out::println);
        HashSet<String> colores = fruteria.stream().map(Fruta::getColor).collect(Collectors.toCollection(HashSet::new));
        System.out.println(colores);

    }
}
