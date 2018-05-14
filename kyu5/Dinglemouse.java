package exercises.codewars.kyu5;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Hey You !
 * Sort these integers for me ...
 * <p>
 * By name ...
 * <p>
 * Do it now !
 * <p>
 * Input
 * Range is 0-999
 * <p>
 * There may be duplicates
 * <p>
 * The array may be empty
 *
 * @author Ross Khapilov
 * @version 1.0 created on 13.05.2018
 */
public class Dinglemouse {
    private static String[] UNITS = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static String[] TENS = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static int[] sort(final int array[]) {
        return Arrays.stream(array)
                .boxed()
                .sorted(Comparator.comparing(Dinglemouse::toName))
                .map(String::valueOf)
                .mapToInt(Integer::valueOf)
                .toArray();
    }

    private static String toName(int i) {
        return i == 0 ? "zero" : toWords((i / 100) % 10, " hundred") + ((i / 100) % 10 != 0 ? " " : "") + toWords(i % 100);
    }

    private static String toWords(int i, String toAppend) {
        return toWords(i) + (i > 0 ? toAppend : "");
    }

    private static String toWords(int i) {
        return i > 19 ? TENS[i / 10] + (i / 10 != 0 ? " " : "") + UNITS[i % 10] : UNITS[i];
    }
}