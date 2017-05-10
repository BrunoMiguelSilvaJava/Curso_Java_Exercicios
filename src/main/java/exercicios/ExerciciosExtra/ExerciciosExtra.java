package exercicios.ExerciciosExtra;

/**
 * Created by Formando on 05/05/2017.
 */
public class ExerciciosExtra {

    //##############################
    //########## Warmup-1 ##########
    //##############################

    // Warmup-1 > missingChar
    public String missingChar(String str, int n) {
        String previous = str.substring(0, n);
        //String selected = Character.toString(str.charAt(n));
        String following = str.substring(n+1, str.length());
        return previous + following;
    }

    // Warmup-1 > backAround
    public String backAround(String str) {
        String lastChar = Character.toString(str.charAt(str.length()-1));
        return lastChar + str + lastChar;
    }

}