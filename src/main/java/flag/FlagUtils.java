package flag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Formando on 08/05/2017.
 */
public class FlagUtils {
    public static boolean equalStrings(String s1, String s2) {
        if(s1.equals(s2))
            return true;
        else
            return false;
    }

    public static String mergeStrings(String s1, String s2) {
        int min = Math.min(s1.length(), s2.length());

        StringBuilder sb = new StringBuilder(s1.length() + s2.length());
        for(int i = 0; i != min; i++)
        {
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }

        if(s1.length()>min)
            sb.append(s1.substring(min-1));
        else
            sb.append(s2.substring(min-1));

        return sb.toString();
    }

    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s.length());

        for(int i = s.length(); i != 0; i--)
        {
            sb.append(s.charAt(i-1));
        }

        return sb.toString();
    }

    public static int reverseNumber(int number) {
        String s = Integer.toString(number);

        String result = reverseString(s);

        return Integer.parseInt(result.toString());
    }

    public static String printIntArray(int[] ints) {
        return Arrays.toString(ints);
    }

    public static String printIntArray2(int[] ints) {
        StringBuilder sb = new StringBuilder(ints.length + ints.length + ints.length);

        sb.append('{');
        for(int i = 0; i != ints.length; i++)
        {
            sb.append(ints[i]);
            if(i != (ints.length - 1)) {
                sb.append(',');
                sb.append(' ');
            }
        }
        sb.append('}');

        return sb.toString();
    }

    public static int[] removeZeros(int[] array1, int[] array2) {
        StringBuilder sb = new StringBuilder(array1.length + array2.length);

        for(int i = 0; i != array1.length; i++)
        {
            if(array1[i] != 0)
                sb.append(array1[i]);
        }

        for(int i = 0; i != array2.length; i++)
        {
            if(array2[i] != 0)
                sb.append(array2[i]);
        }

        int[] finalArray = new int[sb.length()];

        for(int i = 0; i != sb.length(); i++)
        {
            String temp = String.valueOf(sb.charAt(i));
            finalArray[i] = Integer.parseInt(temp);
        }

        return finalArray;
    }

    public static int[] getDiagonal(int[][] diagonal) {
        int[] finalArray = new int[diagonal.length];

        for(int i=0; i != diagonal.length; i++)
            finalArray[i]=diagonal[i][i];

        return finalArray;
    }
}















