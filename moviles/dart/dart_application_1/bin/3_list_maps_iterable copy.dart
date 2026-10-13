
void main() {

    final numbers = [1,2,3,4,5,5,5,5,6,6,6,6,7,7,8,9,10];

    print('Lista original:  $numbers');

    print('Tamaño:  ${numbers.length}');

    print('Index 0: ${numbers[0]}');

    print('First: ${numbers.first}');

    print('IsEmpty?: ${numbers.isEmpty}');

    //print('Reverse: ${numbers.reversed}');

    final reversedNumbers = numbers.reversed;
    print('Iterable: ${reversedNumbers.toList()}');
    print('Set: ${reversedNumbers.toSet()}');

    final numberMasQue5 = numbers.where((int num) {
      return num > 5;
    } );

    print(' Numeros mayores que 5 (Iterable) : $numberMasQue5');

    print(' Numeros mayores que 5 (Set) : ${numberMasQue5.toSet()}');


}
    

