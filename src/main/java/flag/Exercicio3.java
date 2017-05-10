package flag;

import java.util.Scanner;

/**
 * Created by Formando on 08/05/2017.
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a palavra: ");
        String s1 = sc.nextLine();

        String revertedString = FlagUtils.reverseString(s1);
        String s = String.format("O resultado é: %s", revertedString);
        System.out.println(s);

        System.out.println("Insira o número: ");
        int i1 = sc.nextInt();
        int revertedInt = FlagUtils.reverseNumber(i1);
        System.out.println(revertedInt);
    }
}
