package exercises.codewars.kyu8;

/**
 * In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?
 * <p>
 * Example:
 * <p>
 * Kata.makeNegative(1); // return -1
 * Kata.makeNegative(-5); // return -5
 * Kata.makeNegative(0); // return 0
 * Notes:
 * <p>
 * The number can be negative already, in which case no change is required.
 * Zero (0) can't be negative, see examples above.
 *
 * @author Ross Khapilov
 * @version 1.0 01.07.2018
 */
public class ReturnNegative {
    public static int makeNegative(final int x) {
        return x > 0 ? -x : x;
    }
}
