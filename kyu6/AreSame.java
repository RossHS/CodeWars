package exercises.codewars.kyu6;

import java.util.Arrays;

/**
 * Given two arrays a and b write a function comp(a, b) (compSame(a, b) in Clojure) that checks whether the two arrays
 * have the "same" elements, with the same multiplicities. "Same" means, here, that the elements in b are the elements
 * in a squared, regardless of the order.
 * <p>
 * Examples
 * Valid arrays
 * a = [121, 144, 19, 161, 19, 144, 19, 11]
 * b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
 * comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 20736 the square of 144,
 * 361 the square of 19, 25921 the square of 161, and so on. It gets obvious if we write b's elements in terms of squares:
 * <p>
 * a = [121, 144, 19, 161, 19, 144, 19, 11]
 * b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
 * Invalid arrays
 * If we change the first number to something else, comp may not return true anymore:
 * <p>
 * a = [121, 144, 19, 161, 19, 144, 19, 11]
 * b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
 * comp(a,b) returns false because in b 132 is not the square of any number of a.
 * <p>
 * a = [121, 144, 19, 161, 19, 144, 19, 11]
 * b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]
 * comp(a,b) returns false because in b 36100 is not the square of any number of a.
 * <p>
 * Remarks
 * a or b might be [] (all languages except R, Shell). a or b might be nil or null or None or nothing
 * (except in Haskell, Elixir, C++, Rust, R, Shell, PureScript).
 * <p>
 * If a or b are nil (or null or None), the problem doesn't make sense so return false.
 * <p>
 * If a or b are empty then the result is self-evident.
 *
 * @author Ross Khapilov
 * @version 1.0 19.04.2019
 */
public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) return false;
        if (a.length != b.length) return false;
        int[] aA = Arrays.stream(a).map(i -> i * i).toArray();
        Arrays.sort(aA);
        Arrays.sort(b);
        return Arrays.equals(aA, b);
    }
}
