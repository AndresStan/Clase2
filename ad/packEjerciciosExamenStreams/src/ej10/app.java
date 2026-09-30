package ej10;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class app {

    public static void main(String[] args) {

        Path products = Path.of("src/ej10/products.csv");
        File productsF = products.toFile();
        List<Product> miLista = new ArrayList<>();


        try (BufferedReader reader = new BufferedReader(new FileReader(productsF))) {

            String line;

            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] valores = line.split(",");
                miLista.add(new Product(Integer.parseInt(valores[0]), valores[1], Integer.parseInt(valores[2]), Integer.parseInt(valores[3]), valores[4], Double.parseDouble(valores[5]), Integer.parseInt(valores[6]), Integer.parseInt(valores[7]), Integer.parseInt(valores[8]), Integer.parseInt(valores[9])));
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //  Imprime la lista de productos.
        // miLista.forEach(System.out::println);

        //  Realiza el equivalente a un select name from productos.
        // miLista.stream().map(Product::getProductName).forEach(System.out::println);

        //  Imprime el nombre de los productos cuyo stock sea menos a 10
        // miLista.stream().filter(p -> p.getUnitsInStock() < 10).forEach(System.out::println);

        //  Imprime el nombre de los productos cuyo stock sea menor a 10, pero ordenado por
        //número de el número de stock de menor a mayor (ayuda: para esta consulta es
        //probable que tengas que usar el método sorted, este método recibe un Comparator.
        //Ésta misma interfaz Comparator tiene algunos métodos que nos serán de gran ayuda)
        //miLista.stream().filter(p -> p.getUnitsInStock() <10).sorted((p1, p2) -> p1.getUnitsInStock() - p2.getUnitsInStock()).forEach(System.out::println);

        //  Realiza la misma consulta anterior pero ahora ordenando de mayor a menor.
        // miLista.stream().filter(p -> p.getUnitsInStock() <10).sorted((p1, p2) -> p2.getUnitsInStock() - p1.getUnitsInStock()).forEach(System.out::println);

        //  Muestra el nombre de los productos con unidades en stock mayor de 10 ordenados
        //ordenar por unidad de stock de forma descendente y por nombre de producto de
        //forma ascendente.
        //miLista.stream().filter(p -> p.getUnitsInStock() > 10).sorted(Comparator.comparing(Product::getUnitsInStock).reversed().thenComparing(Product::getProductName)).map(Product::getProductName).forEach(System.out::println);

        //  Muestra el nombre de los productos con unidades en stock mayor de 10 ordenados
        //ordenar por unidad de stock de forma ascendente y por nombre de producto de forma
        //descendente.
        //miLista.stream().filter(p -> p.getUnitsInStock() > 10).sorted(Comparator.comparing(Product::getUnitsInStock).thenComparing(Comparator.comparing(Product::getProductName).reversed())).map(Product::getProductName).forEach(System.out::println);

        //  Obtener el número de productos agrupados por proveedor.
        //miLista.stream().collect(Collectors.groupingBy(Product::getSupplierID, Collectors.counting())).forEach((s, a) -> System.out.println(s + " " + a));

        //  Obtener la suma del precio unitario de todos los productos agrupados por el número
        //de existencias en el almacén, pero solo obtener aquellos registros cuya suma sea
        //mayor a 100
        //miLista.stream().collect(Collectors.groupingBy(Product::getUnitsInStock, Collectors.summingDouble(Product::getUnitPrice))).entrySet().stream().filter((k) -> k.getValue() > 100).forEach(System.out::println);

        //  Calcula el promedio de existencias en almacén.
        // System.out.println(miLista.stream().mapToDouble(Product::getUnitsInStock).average().orElse(0.0));

        //  Producto con el precio unitario más alto.
        // miLista.stream().sorted(Comparator.comparing(Product::getUnitPrice).reversed()).limit(1).forEach(System.out::println);

        // Imprime la lista de productos, pero limitando el número de productos devueltos a 50
        //(muestra los 50 primeros, operador limit en sql)
        //miLista.stream().limit(50).forEach(System.out::println);
    }

}
