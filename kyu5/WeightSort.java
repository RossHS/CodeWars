package exercises.codewars.kyu5;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried because each month a
 * list with the weights of members is published and each month he is the last on the list which means he
 * is the heaviest.
 * <p>
 * I am the one who establishes the list so I told him: "Don't worry any more, I will modify the order of
 * the list". It was decided to attribute a "weight" to numbers. The weight of a number will be from now on
 * the sum of its digits.
 * <p>
 * For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99.
 * Given a string with the weights of FFC members in normal order can you give this string ordered by "weights"
 * of these numbers?
 * <p>
 * Example:
 * "56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes: "100 180 90 56 65 74 68 86 99"
 * <p>
 * When two numbers have the same "weight", let us class them as if they were strings and not numbers:
 * 100 is before 180 because its "weight" (1) is less than the one of 180 (9) and 180 is before 90 since,
 * having the same "weight" (9) it comes before as a string.
 * <p>
 * All numbers in the list are positive numbers and the list can be empty.
 *
 * @author Ross Khapilov
 * @version 1.0 06.10.2018
 */
public class WeightSort {
    public static String orderWeight(String strng) {
        return Stream.of(strng.split(" "))
                .sorted(Comparator.comparingLong(WeightSort::helper).thenComparing(WeightSort::helper2))
                .collect(Collectors.joining(" "));
    }

    private static long helper(String str) {
        long n = Long.parseLong(str);
        int result = 0;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }

    private static int helper2(String str1, String str2) {
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            int res = str1.charAt(i) - str2.charAt(i);
            if (res != 0) return res;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(orderWeight("103 123 4444 99 2000"));
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 2 123 200"));
    }
}
