package exercises.codewars.kyu7;

/**
 * You will be given an array and a limit value. You must check that all values in the array are below or equal
 * to the limit value. If they are, return true. Else, return false.
 * <p>
 * You can assume all values in the array are numbers.
 *
 * @author Ross Khapilov
 * @version 1.0 01.11.2018
 */
public class SmallEnough {
    public static boolean smallEnough(int[] a, int limit) {
        for (int num : a)
            if (num > limit) return false;
        return true;
    }
}
