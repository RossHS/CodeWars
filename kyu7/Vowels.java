package exercises.codewars.kyu7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ross Khapilov
 * @version 1.0 11.07.2018
 */
public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        Matcher matcher = Pattern.compile("[aeiou]").matcher(str);
        while (matcher.find()){
            vowelsCount++;
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(getCount("Aabracadabra"));
    }
}
