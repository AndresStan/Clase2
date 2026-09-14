import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class Ej3 {

    public static int longitudString(List<String> a){

       int longitud = a.getFirst().length();

       for (String s : a){
           if (longitud < s.length()){
               longitud = s.length();
           }
       }

       return longitud;
    }

    public static void main(String[] args) {

        List<String> miLista = new ArrayList<>(List.of("Lunes", "Miercoles", "Jueves", "Sabado", "Xilofonazo", "caretatomica", "encuesta"));

        System.out.println(longitudString(miLista));

    }
}
