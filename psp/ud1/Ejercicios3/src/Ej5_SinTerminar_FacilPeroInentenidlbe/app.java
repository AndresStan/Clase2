package Ej5_SinTerminar_FacilPeroInentenidlbe;
// 5. Crea una clase llamada Saldo, con un atributo que indique el saldo disponible.
//El constructor dará valor inicial al saldo. Crea los métodos get (público) y set
//(privado) para el saldo incluyendo un sleep() aleatorio. Crea otro método que
//reciba una cantidad y se la añada al saldo, este método debe informar de
//quién realiza la operación, la cantidad, el saldo inicial y el final. Este método
//debe ser definido como synchronized. Crea una clase que implemente
//Runnable, desde el método run hemos de usar el método que añade la
//cantidad al saldo. Crea el método main un objeto saldo con un valor inicial.
//Visualiza el valor inicial. Crea varios hilos que compartan el objeto Saldo, a
//cada hilo le asignamos un nombre y una cantidad. Lanzamos los hilos y
//esperamos que finalicen para visualizar el saldo final. Comprueba el
//funcionamiento de la aplicación si quitando synchronized de la declaración del
//método.

public class app {

    static void main() {


        saldo saldo1 = new saldo(10);

        Thread n1 = new Thread(new ejercicio());
        System.out.println(saldo1.getSaldo());

        n1.start();

    }

}
