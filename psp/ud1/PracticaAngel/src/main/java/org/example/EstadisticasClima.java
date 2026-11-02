package org.example;

import org.example.model.Registro;

import java.time.LocalDate;

public class EstadisticasClima {

    // Aqui me creo un registro vacio por mes para ver el minimo y maximo de cada mes
    private final Registro[] maximosPorMes = new Registro[12];
    private final Registro[] minimosPorMes = new Registro[12];

    // y los contenedores de la maxabsoluta y min
    private Registro maxAbsoluta = null;
    private Registro minAbsoluta = null;

    // Metodo sincronizado para que varios hilos puedan escribir aquí a la vez sin liarla
    public synchronized void actualizar(Registro r) {
        if (r == null || r.getFecha() == null) return;

        // Calculo el mes que es el registro (0 a 11)
        int mesIndex = LocalDate.parse(r.getFecha()).getMonthValue() - 1;

        // Guardo o actualizo la máxima de ese mes
        if (maximosPorMes[mesIndex] == null || r.getTmax() > maximosPorMes[mesIndex].getTmax()) {
            maximosPorMes[mesIndex] = r;
        }

        // Guardo o actualizo la mínima de ese mes
        if (minimosPorMes[mesIndex] == null || r.getTmin() < minimosPorMes[mesIndex].getTmin()) {
            minimosPorMes[mesIndex] = r;
        }

        // Actualizo o creo la máxima absoluta global
        if (maxAbsoluta == null || r.getTmax() > maxAbsoluta.getTmax()) {
            maxAbsoluta = r;
        }

        // Actuializo o creo la mínima absoluta global
        if (minAbsoluta == null || r.getTmin() < minAbsoluta.getTmin()) {
            minAbsoluta = r;
        }
    }

    // para imprimir los resultados
    public synchronized void mostrarResultados() {
        String[] nombresMeses = {
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        System.out.println("TEMPERATURAS MAXIMAS POR MES");
        for (int i = 0; i < 12; i++) {
                System.out.println(nombresMeses[i] + ": " + maximosPorMes[i].getTmax() + "ºC " + " Fecha: " + maximosPorMes[i].getFecha() + " Hora: " +maximosPorMes[i].getHoratmax() + " Estacion: " +maximosPorMes[i].getIndicativo() + "(" + maximosPorMes[i].getNombre() + ")");
        }

        System.out.println("TEMPERATURAS MINIMAS POR MES");
        for (int i = 0; i < 12; i++) {
            System.out.println(nombresMeses[i] + ": " + minimosPorMes[i].getTmax() + "ºC " + " Fecha: " + minimosPorMes[i].getFecha() + " Hora: " +minimosPorMes[i].getHoratmax() + " Estacion: " +minimosPorMes[i].getIndicativo() + "(" + minimosPorMes[i].getNombre() + ")");
        }

        System.out.println("Maxima total: " + maxAbsoluta.getTmax() + " ºC el " + maxAbsoluta.getFecha()+ " a las " + maxAbsoluta.getHoratmax() + " en la estacion " + maxAbsoluta.getIndicativo() + "(" + maxAbsoluta.getNombre() + ")");

        System.out.println("Minima total: " + minAbsoluta.getTmax() + " ºC el " + minAbsoluta.getFecha()+ " a las " + minAbsoluta.getHoratmax() + " en la estacion " + minAbsoluta.getIndicativo() + "(" + minAbsoluta.getNombre() + ")");


    }
}