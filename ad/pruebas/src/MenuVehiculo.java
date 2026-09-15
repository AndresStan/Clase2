import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MenuVehiculo {

    public static void main(String[] args) {

        List<Vehiculo2> misVehiculos = new ArrayList<>();

        misVehiculos.add( new Vehiculo2(42344234, "3434 ASD", "Xilo")  );
        misVehiculos.add( new Vehiculo2(12344234, "0118 CBT", "Anndo")  );
        misVehiculos.add( new Vehiculo2(32344234, "1111 AFS", "Reticula")  );


        System.out.println(misVehiculos);
        Collections.sort(misVehiculos, new Vehiculo2DueñoComparador());
        System.out.println(misVehiculos);






    }

}



