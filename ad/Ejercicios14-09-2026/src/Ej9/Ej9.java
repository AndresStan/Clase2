package Ej9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ej9 {

    public static Map<?,?> devolucion(List<Estudiante> lista){

        Map<String, Estudiante> miMapa = new HashMap<>();

        for (Estudiante e : lista){
            miMapa.put(e.getNombre(), e);
        }

        return miMapa;

    }

    public static void main(String[] args) {

        List<Estudiante> miLista =
                new ArrayList<>(List.of(
                        new Estudiante("Andres", 18, "DAM2"),
                        new Estudiante("Luis", 24, "Marmoles"),
                        new Estudiante("Sara", 19, "Peluqueria")));

        System.out.println(miLista);
        System.out.println("--------------------------------------------");
        System.out.println(devolucion(miLista));


    }
}


