package flag;

import java.util.Scanner;

import static flag.FlagUtils.printIntArray2;

/**
 * Created by Formando on 08/05/2017.
 */
public class Exercicio4 {
    public static void main(String[] args) {
        //FlagUtils.printIntArray(new int[]{1, 2, 3, 4}); // imprime {1, 2, 3, 4}
        //FlagUtils.printIntArray(new int[]{4, 7, 8, 9}); // imprime {4, 7, 8, 9}

        System.out.println(FlagUtils.printIntArray2(new int[]{1, 2, 3, 4})); // imprime {1, 2, 3, 4}
        System.out.println(FlagUtils.printIntArray2(new int[]{4, 7, 8, 9})); // imprime {4, 7, 8, 9}
        System.out.println(FlagUtils.printIntArray2(new int[]{4, 7, 8, 9, 7, 4, 2, 4, 5})); // imprime {4, 7, 8, 9}

        Scanner sc = new Scanner(System.in);

        int[] arr2 = new int[3];
        for(int i=0; i != arr2.length; i++){
            System.out.println("Introduza um número: ");
            arr2[i] = sc.nextInt();
        }

        System.out.println(FlagUtils.printIntArray2(arr2));
    }
}
