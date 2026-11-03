package org.example.model;

import java.time.LocalDate;


public class Registro {

    private String fecha;
    private String indicativo;
    private String nombre;
    private float tmed;
    private float tmin;
    private String horatmin;
    private float tmax;
    private String horatmax;


    public Registro() {
    }

    public Registro(String fecha, String indicativo, String nombre, String provincia, float altitud, float tmed, float prec, float tmin, String horatmin, float tmax, String horatmax, float dir, float velmedia, float racha, String horaracha, float sol, float presmax, String horapresmax, float presmin, String horapresmin) {
        this.fecha = fecha;
        this.indicativo = indicativo;
        this.nombre = nombre;
        this.tmed = tmed;
        this.tmin = tmin;
        this.horatmin = horatmin;
        this.tmax = tmax;
        this.horatmax = horatmax;
    }

    public synchronized String getNombre() {
        return nombre;
    }

    public synchronized void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public synchronized String getFecha() {
        return fecha;
    }

    public synchronized void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public  synchronized String getIndicativo() {
        return indicativo;
    }

    public synchronized void setIndicativo(String indicativo) {
        this.indicativo = indicativo;
    }

    public synchronized float getTmed() {
        return tmed;
    }

    public synchronized void setTmed(float tmed) {
        this.tmed = tmed;
    }


    public synchronized float getTmin() {
        return tmin;
    }

    public synchronized void setTmin(float tmin) {
        this.tmin = tmin;
    }

    public synchronized String getHoratmin() {
        return horatmin;
    }

    public synchronized void setHoratmin(String horatmin) {
        this.horatmin = horatmin;
    }

    public synchronized float getTmax() {
        return tmax;
    }

    public synchronized void setTmax(float tmax) {
        this.tmax = tmax;
    }

    public synchronized String getHoratmax() {
        return horatmax;
    }

    public synchronized void setHoratmax(String horatmax) {
        this.horatmax = horatmax;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "fecha='" + fecha + '\'' +
                ", indicativo='" + indicativo + '\'' +
                ", tmed=" + tmed +
                ", tmin=" + tmin +
                ", horatmin='" + horatmin + '\'' +
                ", tmax=" + tmax +
                ", horatmax='" + horatmax + '\'' +
                '}';
    }
}
