package exercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Formando on 05/05/2017.
 */
public class exercicio2 {
    public static void main(String[] args) {
        int[] values = new int[10];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < values.length; i++) {
            System.out.println(String.format("Introduza o %dº número:", i+1));
            values[i] = sc.nextInt();
        }

        int lastValueInserted = values[values.length-1];
        System.out.println(String.format("O último valor introduzido foi: %d", lastValueInserted));

        int subtraction;
        for(int i = 0; i < values.length; i++) {
            subtraction = lastValueInserted - values[i];
            System.out.println(String.format("A diferença entre %dº número e o último é: %d", i+1, subtraction));
        }

        System.out.println("\n");

        for(int i = 0; i < values.length; i++) {
            subtraction = lastValueInserted - values[i];
            System.out.println(String.format("A resultado de %d-%d é igual a: %d", lastValueInserted, values[i], subtraction));
        }

        System.out.println(Arrays.toString(values));
    }
}