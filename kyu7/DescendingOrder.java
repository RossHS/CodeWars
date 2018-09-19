package exercises.codewars.kyu7;

import java.util.*;

/**
 * Your task is to make a function that can take any non-negative integer as a argument and return it
 * with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
 * <p>
 * Examples:
 * Input: 21445 Output: 54421
 * <p>
 * Input: 145263 Output: 654321
 * <p>
 * Input: 1254859723 Output: 9875543221
 *
 * @author Ross Khapilov
 * @version 1.0 19.09.2018
 */
public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}
