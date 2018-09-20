package exercises.codewars.kyu6;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.LongBinaryOperator;

import static java.lang.Math.*;

/**
 * Data: an array of integers, a function f of two variables and an init value.
 * <p>
 * Example: a = [2, 4, 6, 8, 10, 20], f(x, y) = x + y; init = 0
 * <p>
 * Output: an array of integers, say r, such that
 * <p>
 * r = [r[0] = f(init, a[0]), r[1] = f(r[0], a[1]), r[2] = f(r[1], a[2]), ...]
 * <p>
 * With our example: r = [2, 6, 12, 20, 30, 50]
 * <p>
 * #Task: Write the following functions of two variables
 * <p>
 * som : (x, y) -> x + y
 * mini : (x, y) -> min(x, y)
 * maxi : (x, y) -> max(x, y)
 * lcmu : (x, y) -> lcm(abs(x), abs(y) (see note for lcm)
 * gcdi : (x, y) -> gcd(abs(x), abs(y) (see note for gcd)
 * and
 * <p>
 * function oper_array(fct, arr, init) (or operArray or oper-array) where
 * <p>
 * fct is the function of to variables to apply to the array arr (fct will be one of som, mini, maxi, lcmu or gcdi)
 * init is the initial value
 * #Examples:
 * <p>
 * a = [18, 69, -90, -78, 65, 40]
 * oper_array(gcd, a, a[0]) => [18, 3, 3, 3, 1, 1]
 * oper_array(lcm, a, a[0]) => [18, 414, 2070, 26910, 26910, 107640]
 * oper_array(sum, a, 0) => [18, 87, -3, -81, -16, 24]
 * oper_array(min, a, a[0]) => [18, 18, -90, -90, -90, -90]
 * oper_array(max, a, a[0]) => [18, 69, 69, 69, 69, 69]
 * Notes:
 * The form of the parameter fct in oper_array (or operArray or oper-array) changes according to the language.
 * You can see each form according to the language in "Your test cases".
 * AFAIK there are no corner cases, everything is as nice as possible.
 * lcm and gcd see: https://en.wikipedia.org/wiki/Least_common_multiple https://en.wikipedia.org/wiki/Greatest_common_divisor
 * you could google "reduce function (your language)" to have a general view about the reduce functions.
 * <p>
 * In Shell bash, arrays are replaced by strings.
 *
 * @author Ross Khapilov
 * @version 1.0 20.09.2018
 */
public class ReducingBySteps {
    public static long gcdi(long x, long y) {
        while (y != 0) {
            long temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static long lcmu(long a, long b) {
        return abs(a) * (abs(b) / gcdi(a, b));
    }

    public static long som(long a, long b) {
        return a + b;
    }

    public static long maxi(long a, long b) {
        return max(a, b);
    }

    public static long mini(long a, long b) {
        return min(a, b);
    }

    public static long[] operArray(BiFunction<Long, Long, Long> operator, long[] arr, long init) {
        long[] result = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = operator.apply(i - 1 < 0 ? init : result[i - 1], arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        long[] a = new long[]{18, 69, -90, -78, 65, 40};
        System.out.println(lcmu(414, -90));
    }
}
