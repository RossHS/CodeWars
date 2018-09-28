package exercises.codewars.kyu7;

import java.util.List;

/**
 * Given an array of one's and zero's convert the equivalent binary value to an integer.
 * <p>
 * Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
 * <p>
 * Examples:
 * <p>
 * Testing: [0, 0, 0, 1] ==> 1
 * Testing: [0, 0, 1, 0] ==> 2
 * Testing: [0, 1, 0, 1] ==> 5
 * Testing: [1, 0, 0, 1] ==> 9
 * Testing: [0, 0, 1, 0] ==> 2
 * Testing: [0, 1, 1, 0] ==> 6
 * Testing: [1, 1, 1, 1] ==> 15
 * Testing: [1, 0, 1, 1] ==> 11
 * However, the arrays can have varying lengths, not just limited to 4.
 *
 * @author Ross Khapilov
 * @version 1.0 28.09.2018
 */
public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }
}
