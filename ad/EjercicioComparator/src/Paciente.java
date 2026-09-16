import java.time.LocalDateTime;
import java.util.Comparator;

public class Paciente implements Comparable<Paciente> {

    private String nombre;
    private int gravedad;
    private LocalDateTime llegada;


    public Paciente() {
    }

    public Paciente(String nombre, int gravedad, LocalDateTime llegada) {
        this.nombre = nombre;
        this.gravedad = gravedad;
        this.llegada = llegada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    public LocalDateTime getLlegada() {
        return llegada;
    }

    public void setLlegada(LocalDateTime llegada) {
        this.llegada = llegada;
    }

    @Override
    public String toString() {
        return "Nombre='" + nombre + '\'' +
                ", Gravedad=" + gravedad +
                ", Llegada=" + llegada;
    }




    @Override
    public int compareTo(Paciente o) {
        int comparacionG = o.getGravedad()-this.getGravedad();
        if (comparacionG == 0){
            return this.getLlegada().compareTo(o.getLlegada());
        }

        return comparacionG;
    }
}
