package exercises.codewars.kyu5;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks
 * untouched.
 * <p>
 * Examples
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * pigIt('Hello world !');     // elloHay orldWay !
 *
 * @author Ross Khapilov
 * @version 1.0 13.07.2018
 */
public class PigLatin {
    public static String pigIt(String str) {
        return Pattern.compile(" +").splitAsStream(str)
                .map(s -> s.matches("[a-zA-z]+") ? s.substring(1) + s.charAt(0) + "ay" : s)
                .collect(Collectors.joining(" "));
    }

    public static String pigIt2(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }


    public static void main(String[] args) {
        System.out.println(pigIt("Hello world !"));
        System.out.println("world".matches("[a-z]"));
    }
}
