package Ejercicio1;

import java.beans.Expression;

public class Ej1  {
    static void main() {

        Calculator suma = (a, b) -> a+b;
        Calculator resta = ( (a, b) -> a-b);
        Calculator division = ((a, b) -> a/b);
        Calculator multiplicacion = ((a, b) -> a*b);

        int num1 = 6;
        int num2 = 3;

        System.out.println(suma.calculate(num1,num2));
        System.out.println(resta.calculate(num1,num2));
        System.out.println(division.calculate(num1,num2));
        System.out.println(multiplicacion.calculate(num1,num2));




    }
}


