package flag;

import java.util.Scanner;

/**
 * Created by Formando on 08/05/2017.
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a primeira palavra: ");
        String s1 = sc.next();
        System.out.println("Insira a segunda palavra: ");
        String s2 = sc.next();

        boolean equals = FlagUtils.equalStrings(s1, s2);
        String s = String.format("As strings%s sao iguais", equals ? "" : " nao");
        System.out.println(s);
    }
}
