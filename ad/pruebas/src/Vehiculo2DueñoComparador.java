import java.util.Comparator;

public class Vehiculo2DueñoComparador implements Comparator<Vehiculo2> {

    @Override
    public int compare(Vehiculo2 o1, Vehiculo2 o2) {
        return o1.matricula.compareTo(o2.matricula);
    }
}
