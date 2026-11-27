package modelo;

import java.io.Serializable;

public class Imagen implements Serializable {

    private byte[] datos;
    private String nombre;

    public Imagen(byte[] datos, String nombre) {

        this.datos = datos;
        this.nombre = nombre;
    }

    public byte[] getDatos() {
        return datos;
    }

    public void setDatos(byte[] datos) {
        this.datos = datos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
