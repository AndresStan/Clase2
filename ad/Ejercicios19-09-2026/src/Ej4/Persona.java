package Ej4;

import java.util.Comparator;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int Edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        Edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", Edad=" + Edad +
                '}';
    }

    @Override
    public int compareTo(Persona o) {
        return o.getEdad() - this.getEdad();
    }
}
