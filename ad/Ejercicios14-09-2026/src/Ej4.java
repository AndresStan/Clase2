import java.util.HashSet;
import java.util.Set;

public class Ej4 {
    public static void main(String[] args) {


        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");

        System.out.println(miSet);

        // Se puede observar que SET automaticamente los
        // ordena por su hash interno para mayor rendimiento y
        // se eliminan duplicados automaticamente




    }
}
