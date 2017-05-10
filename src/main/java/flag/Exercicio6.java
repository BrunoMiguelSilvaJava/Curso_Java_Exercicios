package flag;

import java.util.Scanner;

/**
 * Created by Formando on 10/05/2017.
 */
public class Exercicio6 {
    public static void main(String[] args) {
        int [][] m = {{1,2,3}, {4,5,6}, {7,8,9}};
        int [][] n = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        String test1 = FlagUtils.printIntArray2(FlagUtils.getDiagonal(m)); // retorna {1,5,9}
        String test2 = FlagUtils.printIntArray2(FlagUtils.getDiagonal(n)); // retorna {1,6,11,16}

        System.out.println(test1);
        System.out.println(test2);
    }
}
