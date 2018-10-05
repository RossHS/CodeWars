package exercises.codewars.kyu6;

import java.util.Arrays;

/**
 * Count the number of Duplicates
 * Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
 * <p>
 * Example
 * "abcde" -> 0 # no characters repeats more than once
 * "aabbcde" -> 2 # 'a' and 'b'
 * "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
 * "indivisibility" -> 1 # 'i' occurs six times
 * "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
 * "aA11" -> 2 # 'a' and '1'
 * "ABBA" -> 2 # 'A' and 'B' each occur twice
 *
 * @author Ross Khapilov
 * @version 1.0 05.10.2018
 */
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        char[] chars = text.toLowerCase().toCharArray();
        int counter = 0;
        boolean same = false;
        System.out.println(Arrays.toString(chars));
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i] && !same) {
                counter++;
                same = true;
            } else if (chars[i - 1] != chars[i] && same) same = false;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcde"));
        System.out.println(duplicateCount("aabbcde"));
        System.out.println(duplicateCount("aabBcde"));
    }
}
