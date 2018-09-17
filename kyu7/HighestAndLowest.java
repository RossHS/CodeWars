package exercises.codewars.kyu7;

import java.util.Arrays;
import java.util.Comparator;

/**
 * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
 * <p>
 * Example:
 * <p>
 * HighAndLow("1 2 3 4 5") // return "5 1"
 * HighAndLow("1 2 -3 4 5") // return "5 -3"
 * HighAndLow("1 9 3 4 -5") // return "9 -5"
 * Notes:
 * <p>
 * All numbers are valid Int32, no need to validate them.
 * There will always be at least one number in the input string.
 * Output string must be two numbers separated by a single space, and highest number is first.
 *
 * @author Ross Khapilov
 * @version 1.0 17.09.2018
 */
public class HighestAndLowest {
    public static String HighAndLow(String numbers) {
        String[] strs = numbers.split(" ");
        Arrays.sort(strs, Comparator.comparingInt(Integer::parseInt));
        return strs[strs.length - 1] + " " + strs[0];
    }
}
