package exercises.codewars.kyu5;

import java.util.ArrayList;
import java.util.List;

/**
 * Divisors of 42 are : 1, 2, 3, 6, 7, 14, 21, 42. These divisors squared are: 1, 4, 9, 36, 49, 196, 441, 1764.
 * The sum of the squared divisors is 2500 which is 50 * 50, a square!
 * <p>
 * Given two integers m, n (1 <= m <= n) we want to find all integers between m and n whose sum of squared divisors
 * is itself a square. 42 is such a number.
 * <p>
 * The result will be an array of arrays or of tuples (in C an array of Pair) or a string, each subarray having
 * two elements, first the number whose squared divisors is a square and then the sum of the squared divisors.
 * <p>
 * #Examples:
 * <p>
 * list_squared(1, 250) --> [[1, 1], [42, 2500], [246, 84100]]
 * list_squared(42, 250) --> [[42, 2500], [246, 84100]]
 * The form of the examples may change according to the language, see Example Tests: for more details.
 * <p>
 * Note
 * <p>
 * In Fortran - as in any other language - the returned string is not permitted to contain any redundant trailing
 * whitespace: you can use dynamically allocated character strings.
 *
 * @author Ross Khapilov
 * @version 1.0 24.09.2018
 */
public class SumSquaredDivisors {
    public static String listSquared(long m, long n) {
        List<List<Long>> lists = new ArrayList<>();
        for (; m <= n; m++) {
            long sum = 0;
            for (long i = 1; i <= m; i++)
                if (m % i == 0) sum += i * i;
            if (Math.sqrt(sum) % 1 == 0) {
                List<Long> list = new ArrayList<>();
                list.add(m);
                list.add(sum);
                lists.add(list);
            }
        }
        return lists.toString();
    }

    public static void main(String[] args) {
        System.out.println(listSquared(40, 44));
    }
}
