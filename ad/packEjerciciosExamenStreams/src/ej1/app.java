package ej1;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[] args) {

        Path ruta = Path.of("src/ej1/fichero.txt");
        File archivo = ruta.toFile();

        List<Producto> productos = new ArrayList<>();

        Producto p1 = new Producto(1, "Portátil Asus ZenBook", 899.99, true, 'E');
        Producto p2 = new Producto(2, "Monitor LG 27", 199.50, false, 'E');
        Producto p3 = new Producto(3, "Camiseta Algodón M", 15.99, true, 'R');
        Producto p4 = new Producto(4, "Leche Desnatada 1L", 1.05, false, 'A');
        Producto p5 = new Producto(5, "Cafetera Express", 79.90, false, 'E');

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {

            for (Producto p : productos){
                String line = p.toString();
                writer.write(line);
                writer.newLine();
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader reader = new BufferedReader( new FileReader(archivo))) {

            String line;

            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
