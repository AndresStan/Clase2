import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ej1 {

    public static void main(String[] args) {


        List<String> miLista = new ArrayList<>();
        miLista.addAll(List.of("Lunes", "Martes", "Miercoles", "Jueves", "Viernes"));

        for (String s : miLista){
            System.out.println(s);
        }



    }

}
