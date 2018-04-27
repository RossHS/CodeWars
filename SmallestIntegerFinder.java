package exercises.codewars;

import java.util.Arrays;

/**
 * Given an array of integers your solution should find the smallest integer.
 * <p>
 * For example:
 * <p>
 * Given [34, 15, 88, 2] your solution will return 2
 * Given [34, -345, -1, 100] your solution will return -345
 * You can assume, for the purpose of this kata, that the supplied array will not be empty.
 *
 * @author Ross Khapilov
 * @version 1.0 created on 27.04.2018
 */
public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}
