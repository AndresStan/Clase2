package org.example.model;

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

    public  String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public  String getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(String indicativo) {
        this.indicativo = indicativo;
    }

    public  float getTmed() {
        return tmed;
    }

    public  void setTmed(float tmed) {
        this.tmed = tmed;
    }


    public float getTmin() {
        return tmin;
    }

    public  void setTmin(float tmin) {
        this.tmin = tmin;
    }

    public  String getHoratmin() {
        return horatmin;
    }

    public  void setHoratmin(String horatmin) {
        this.horatmin = horatmin;
    }

    public  float getTmax() {
        return tmax;
    }

    public  void setTmax(float tmax) {
        this.tmax = tmax;
    }

    public  String getHoratmax() {
        return horatmax;
    }

    public  void setHoratmax(String horatmax) {
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
