package flag;

import java.util.Scanner;

/**
 * Created by Formando on 08/05/2017.
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a primeira palavra: ");
        String s1 = sc.nextLine();
        System.out.println("Insira a segunda palavra: ");
        String s2 = sc.nextLine();

        String merge = FlagUtils.mergeStrings(s1, s2);

        //FlagUtils.mergeStrings("Ola Mundo", "Flag"); // retorna "OFllaa gMundo"
        //FlagUtils.mergeStrings("Curso", "Java"); // retorna "CJuarvsao"

        String s = String.format("O resultado é: %s", merge);
        System.out.println(s);
    }
}
