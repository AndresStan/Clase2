package ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ej3 {
    public static void main(String[] args) {


        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Carlos", 17));
        personas.add(new Persona("Beatriz", 34));
        personas.add(new Persona("David", 15));
        personas.add(new Persona("Elena", 42));

        personas.stream().mapToInt(Persona::getEdad).average().stream().forEach(s -> System.out.println("El promedio de edad es " + s));
        System.out.println(personas.stream().sorted((p, p2 )-> p.getEdad() - p2.getEdad() ).limit(1).toList());
        System.out.println(personas.stream().filter(p -> p.getEdad()>30).toList());
    }
}
