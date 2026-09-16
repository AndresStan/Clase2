package comparatorComparable;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class tipoSalvaje {

    public static void imprimir(Contenedor<?> c){
        System.out.println(c.getObjeto());
    }

    public static void imprimirConMultiplicador(Contenedor<? extends Integer> c, int multiplicador){
        System.out.println(c.getObjeto().intValue() * multiplicador);
    }

    static void main() {

        Contenedor<String> caja1 = new Contenedor<>("Hola mundo");
        Contenedor<Integer> caja2 = new Contenedor<Integer>(3);

        imprimir(caja1);
        imprimir(caja2);
        imprimirConMultiplicador(caja2, 3);

        List<String> miLista = new ArrayList<>(Arrays.asList("comparatorComparable.Coche", "Casa", "Persona", "Movil"));
        System.out.println(miLista.stream().sorted().toList());

        Coche coche1 = new Coche("9442 RAD", "ASD4GF3423R", "Hector Stan", 455);
        Coche coche2 = new Coche("1991 CBT", "ASD32D3F3F3", "Andres Stan", 135);
        Coche coche3 = new Coche("9931 ABA", "123123D213F34", "Luis Stan", 185);



        List<Coche> miListaCoche = new ArrayList<>(Arrays.asList(coche1, coche2, coche3));



        System.out.println(miListaCoche);
        Collections.sort(miListaCoche);
        System.out.println(miListaCoche);
    }
}
