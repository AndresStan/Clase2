package Ej5;

import Ej4.Persona;

import java.security.KeyStore.Entry;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class app {

    public static void main(String[] args) {

        List<Empleado> miLista = new ArrayList<>(Arrays.asList(
                new Empleado("Andres", "Informatica"),
                new Empleado("Luis", "Filosofía"),
                new Empleado("Angel", "Psicología"),
                new Empleado("Marcos", "Geografía"),
                new Empleado("Emmanuel", "Informatica"),
                new Empleado("Julia", "Filosofía"),
                new Empleado("Sara", "Psicología"),
                new Empleado("Angel", "Terreno"),
                new Empleado("Pepe", "Geografía"),
                new Empleado("Antonio", "Filología")

        ));

        
        // Ap1
        Map<String, List<Empleado>> ap1 = miLista.stream().collect(Collectors.groupingBy(Empleado::getDepartamento));
        System.out.println(ap1);

      
        System.out.println("--------------------------------------");
        
        // Ap2
        Map<String, Long> ap2 = miLista.stream().collect(Collectors.groupingBy(Empleado::getDepartamento, Collectors.counting()));
        System.out.println(ap2);

        System.out.println("--------------------------------------");
        // Ap3

        String nombreDep = "Filosofía";
        Map<String, List<Empleado>> ap3 = miLista.stream().filter(n -> n.getDepartamento() == nombreDep).collect(Collectors.groupingBy(Empleado::getDepartamento));
        System.out.println(ap3);
        System.out.println("--------------------------------------");

        // Ap4
        String empleado = "Angel";
        Map<String, List<String>> ap4 = miLista.stream().filter(s -> s.getNombre() == empleado)
        .collect(Collectors.groupingBy(Empleado::getNombre, Collectors.mapping(Empleado::getDepartamento, Collectors.toList())));
        System.out.println(ap4);

        
        System.out.println("--------------------------------------");

        // Mostrar los nombres de los departamentos con sus empleados solo nombres en los que haya mas de una persona
        Map<String, List<String>> sara1 = miLista.stream().collect(Collectors.groupingBy(Empleado::getDepartamento, Collectors.mapping(Empleado::getNombre, Collectors.toList())));
        Map<String, List<String>> sara2 = sara1.entrySet().stream().filter(k -> k.getValue().size() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(sara2);

        System.out.println("--------------------------------------");

        // Mostrar nombres agrupado por departamento y filtrar los departamentos que tengan mas de un empleado y su departamento empiece por F (Con predicados y cosas predefinidas)

        Predicate<Empleado> filtroF = s -> s.getDepartamento().startsWith("F");
        Function<Empleado, String> agruparPorDepartamento = e -> e.getDepartamento();
        Predicate<Map.Entry<String, List<String>>> filtroMayor1 = s -> s.getValue().size() > 1;

        Map<String, List<String>> j1 = miLista.stream().filter(filtroF).collect(Collectors.groupingBy(agruparPorDepartamento, Collectors.mapping(Empleado::getNombre, Collectors.toList())));
        Map<String, List<String>> j2 = j1.entrySet().stream().filter(filtroMayor1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        j2.forEach((key, value) -> System.out.println("Departamento: " + key + ", Empleados: " + value));


        
        
    }

}
