package Ej4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class app {
    public static void main(String[] args) {

        List<Persona> miLista = new ArrayList<>(Arrays.asList(
                new Persona("Andres", 18),
                new Persona("Luis", 23),
                new Persona("Sergio", 17),
                new Persona("Luisillo", 12)
        ));

        // Ejercicio 1 (.sorted busca la clase compareTo de la interfaz Comparable que hemos implementado en Persona
        // para que compare por edad descendente)
        miLista = miLista.stream().sorted().toList();
        System.out.println(miLista);

        // Ejercicio 2
        miLista.stream().sorted(Comparator.comparing(Persona::getNombre)).forEach(System.out::println);

    }
}
