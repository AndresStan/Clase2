import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ej8 {

    public static Map<?, ?> devolucion(List<String> l){

        Map<String, Integer> devol = new HashMap<>();
        for (String s : l){
            devol.put(s, devol.getOrDefault(s, 0) +1);
        }
        return devol;
    }

    public static void main(String[] args) {

        List<String> miLista = new ArrayList<>(List.of("Lunes", "Martes", "Lunes", "Miercoles", "Jueves", "Viernes"));
        System.out.println(devolucion(miLista));


    }
}
