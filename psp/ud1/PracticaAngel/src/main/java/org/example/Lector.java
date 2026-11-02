package org.example;

import com.google.gson.Gson;
import org.example.model.Registro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.RecursiveAction;

public class Lector extends RecursiveAction {

    private ArrayList<Path> paths;
    private int start;
    private int end;
    private EstadisticasClima estadisticas;
    private static final int lote = 1500;

    public Lector(int start, int end, ArrayList<Path> paths, EstadisticasClima estadisticas) {
        this.start = start;
        this.end = end;
        this.paths = paths;
        this.estadisticas = estadisticas;
    }

    @Override
    protected void compute() {
        int cantidad = end - start;
        // Si la tarea es mas grande que el lote que le pones se divide en subtareas mas pequeñas
        if (cantidad > lote){
            int mitad = start + (end - start) / 2;

            Lector tarea1 = new Lector(start, mitad, paths, estadisticas);
            Lector tarea2 = new Lector(mitad, end, paths, estadisticas);

            invokeAll(tarea1, tarea2);
        } else {
            // Si la tarea ya es lo suficientemente pequeña crea el registro tras deserealizarlo
                try {
                    for (int i = start; i < end ; i++) {

                        Gson gson = new Gson();
                        String contenido = Files.readString(paths.get(i));
                        // El cabeza de melon de el creador de estos datos de la AEMET no se le ocurrio mejor forma que
                        // En lugar de poner los decimales con . los pone con , y eso rompe todo
                        // Lo parseo en . los numeros para no tener error
                        contenido = contenido.replaceAll("(?<=\\d),(?=\\d)", ".");
                        Registro registro = gson.fromJson(contenido, Registro.class);

                        // Y finalmente llamo a la funcion actualizar que se encarga de actualizar todo bien
                        estadisticas.actualizar(registro);
                    }

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

        }



    }




}
