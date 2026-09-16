package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class prueba {

    interface Greeting {
        void sayhello(String name);
    }

    public static void ordena(){
        List<String> list = Arrays.asList("Dog", "Elephant", "Cataclysm", "Rabbit");

        //Ordenamos alfabeticamente
        Collections.sort(list);
        System.out.println(list);

        //Ordenamos por longitud
        Collections.sort(list, (a, b) -> a.length() - b.length());
        System.out.println(list);

        // Con comparator
        Collections.sort(list, new stringLengthComparator());
        System.out.println(list);
    }

    static void main() {
        Greeting greeting = (name -> System.out.println("Hello, " + name));
        greeting.sayhello("Andres");
        ordena();


    }
}

class stringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}