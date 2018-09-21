package exercises.codewars.kyu7;

/**
 * This time no story, no theory. The examples below show you how to write function accum:
 * <p>
 * Examples:
 * <p>
 * Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
 * Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 *
 * @author Ross Khapilov
 * @version 1.0 21.09.2018
 */
public class Accumul {
    public static String accum(String s) {
        String upperCase = s.toUpperCase();
        String lowerCase = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(upperCase.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            sb.append("-").append(upperCase.charAt(i));
            for (int j = 0; j < i; j++) {
                sb.append(lowerCase.charAt(i));
            }
        }
        return sb.toString();
    }
}
