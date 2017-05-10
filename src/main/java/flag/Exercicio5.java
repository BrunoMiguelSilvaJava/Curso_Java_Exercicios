package flag;

/**
 * Created by Formando on 08/05/2017.
 */
public class Exercicio5 {
    public static void main(String[] args) {
        int[] array1 = {0,0,1,2,0,0,3,4};
        int[] array2 = {5,0,6,0,0,0,7,0};
        int[] array3 = {5,6,0};

        String teste1 = FlagUtils.printIntArray2(FlagUtils.removeZeros(array1, array2)); // retorna {1,2,3,4,5,6,7}
        String teste2 = FlagUtils.printIntArray2(FlagUtils.removeZeros(array1, array3)); // retorna {1,2,3,4,5,6}
        String teste3 = FlagUtils.printIntArray2(FlagUtils.removeZeros(array2, array3)); // retorna {5,6,7,5,6}

        System.out.println(teste1);
        System.out.println(teste2);
        System.out.println(teste3);
    }
}
