package hecprooll;

public class Persona {

    static private int edad = 22;
    static private int idSiguiente;
    private int id;


    public static int getIdSiguiente() {
        return idSiguiente;
    }

    public static void setIdSiguiente(int idSiguiente) {
        Persona.idSiguiente = idSiguiente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persona() {
        id=idSiguiente;
        idSiguiente++;
    }

    public static int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                '}';
    }
}
