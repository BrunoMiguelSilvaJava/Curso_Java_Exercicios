package exercicios;


import java.util.Scanner;

/**
 * Created by Formando on 03/05/2017.
 */
public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza o 1º número");
        int firstNumber = scanner.nextInt();
        System.out.println("Introduza o 2º número");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println(String.format("O total da soma é igual a: %d", sum));

        int subtraction = firstNumber - secondNumber;
        System.out.println(String.format("O total da subtração é igual a: %d", subtraction));

        int multiplication = firstNumber * secondNumber;
        System.out.println(String.format("O total da multiplicação é igual a: %d", multiplication));

        float division = (float)firstNumber / secondNumber;
        System.out.println(String.format("O total da divisão é igual a: %f", division));
    }
}
