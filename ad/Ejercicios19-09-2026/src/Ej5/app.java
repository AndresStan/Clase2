package Ej5;

import Ej4.Persona;

import java.util.*;
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
                new Empleado("Angel", "Terreno")

        ));

        // Apartado 1
        Map<String, List<Empleado>> agrupacionPorDepartamento = miLista.stream().collect(Collectors.groupingBy(Empleado::getDepartamento));
        System.out.println(agrupacionPorDepartamento);

        // Apartado 2
        Map<String, Long> cuentaPorDepartamento = miLista.stream().collect(Collectors.groupingBy(Empleado::getDepartamento, Collectors.counting()));
        System.out.println(cuentaPorDepartamento);

        // Apartado 3
        String departamento = "Informatica";
        Map<String, List<Empleado>> empleadosPorDepartamento = miLista.stream().filter(s -> Objects.equals(s.getDepartamento(), departamento)).collect(Collectors.groupingBy(Empleado::getDepartamento));
        System.out.println(empleadosPorDepartamento);

        // Apartado 4 En forma de map (inconveniente porque pueden repetirse los nombre y daria error al haber dos claves iguales)
        String nombre = "Angel";
        Map<String, List<String>> departamentoPorNombre = miLista.stream().filter(s -> Objects.equals(s.getNombre(), nombre)).collect(Collectors.groupingBy(Empleado::getNombre, Collectors.mapping(Empleado::getDepartamento, Collectors.toList())));
        System.out.println(departamentoPorNombre);

        // Apartado 4 en forma "mejor" ya que muestra solo los departamentos
        String nombre = "Angel";
        miLista.stream().filter(s -> Objects.equals(s.getNombre(), nombre)).map(Empleado::getDepartamento).forEach(System.out::println);
    }

}
