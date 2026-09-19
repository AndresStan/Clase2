package Ej3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class app {
    public static void main(String[] args) {


        List<Integer> miLista = new ArrayList<>(Arrays.asList(2,4,5,6,7,8,9));
        System.out.println(miLista.stream().map(num -> num*num).collect(Collectors.summingInt(num -> num)));


    }
}
