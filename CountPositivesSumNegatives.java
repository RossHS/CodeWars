package exercises.codewars;

/**
 * Given an array of integers.
 * <p>
 * Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
 * <p>
 * If the input array is empty or null, return an empty array:
 *
 * @author Ross Khapilov
 * @version 1.0 created on 21.12.2017
 */
public class CountPositivesSumNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        int count = 0;
        int sumNegatives = 0;
        for (int num : input) {
            if (num > 0) count++;
            else if (num < 0) sumNegatives += num;
        }
        return new int[]{count, sumNegatives};
    }
}
