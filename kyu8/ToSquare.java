package exercises.codewars.kyu8;

import java.util.Arrays;

/**
 * #To square(root) or not to square(root)
 * <p>
 * Write a method, that will get an integer array as parameter and will process every number from this array.
 * Return a new array with processing every number of the input-array like this:
 * <p>
 * If the number has an integer square root, take this, otherwise square the number.
 * <p>
 * [4,3,9,7,2,1] -> [2,9,3,49,4,1]
 * The input array will always contain only positive numbers and will never be empty or null.
 * <p>
 * The input array should not be modified!
 *
 * @author Ross Khapilov
 * @version 1.0 10.10.2018
 */
public class ToSquare {
    public static int[] squareOrSquareRoot(int[] array) {
        return Arrays.stream(array)
                .map(o -> {
                    double d = Math.sqrt(o);
                    return d % 1 == 0 ? (int) d : o * o;
                })
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareOrSquareRoot(new int[]{4, 3, 9, 7, 2, 1})));
    }
}
