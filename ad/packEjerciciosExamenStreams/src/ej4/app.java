package ej4;

import ej3.Persona;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class app {
    public static void main(String[] args) {

        Path ruta = Path.of("src/ej4/datos.csv");
        File archivo = ruta.toFile();
        List<Producto> miLista = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {

            String line;
            reader.readLine(); // Para ignorar la primera fila
            while ((line = reader.readLine()) != null){

                String[] datos = line.split(";");
                datos[1] = datos[1].replace(",", ".");
                miLista.add(new Producto( datos[0], Double.parseDouble(datos[1]), datos[2]));
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        miLista.stream().collect(Collectors.groupingBy(Producto::getCategoria, Collectors.maxBy(Comparator.comparing(Producto::getPrecio)))).forEach((s, producto) -> System.out.println("Categoria: " + s + ", Producto mas caro: " + producto));

        System.out.println("...............");

        System.out.println(miLista.stream().filter(p -> p.getPrecio() >= 10 && p.getPrecio() <= 20).toList());
    }
}
