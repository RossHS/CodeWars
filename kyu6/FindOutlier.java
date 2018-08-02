package exercises.codewars.kyu6;

import java.util.ArrayList;

/**
 * You are given an array (which will have a length of at least 3, but could be very large) containing integers.
 * The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single
 * integer N. Write a method that takes the array as an argument and returns this "outlier" N.
 * <p>
 * Examples
 * [2, 4, 0, 100, 4, 11, 2602, 36]
 * Should return: 11 (the only odd number)
 * <p>
 * [160, 3, 1719, 19, 11, 13, -21]
 * Should return: 160 (the only even number)
 *
 * @author Ross Khapilov
 * @version 1.0 02.08.2018
 */
public class FindOutlier {
    static int find(int[] integers) {
        ArrayList<Integer> odd = new ArrayList<>();
        for (int n : integers)
            odd.add(n);
        ArrayList<Integer> even = new ArrayList<>(odd);
        odd.removeIf(i -> i % 2 == 0);
        even.removeIf(i -> i % 2 != 0);
        if (odd.size() == 1) return odd.get(0);
        else if (even.size() == 1) return even.get(0);
        return 0;
    }
}
