package exercises.codewars.kyu7;

/**
 * In your class, you have started lessons about arithmetic progression. Since you are also a programmer, you have
 * decided to write a function that will return the first n elements of the sequence with the given common difference d
 * and first element a. Note that the difference may be zero!
 * <p>
 * The result should be a string of numbers, separated by comma and space.
 * <p>
 * Example
 * # first element: 1, difference: 2, how many: 5
 * arithmetic_sequence_elements(1, 2, 5) == "1, 3, 5, 7, 9"
 *
 * @author Ross Khapilov
 * @version 1.0 created on 09.05.2018
 */
public class ArithmeticProgression {
    public static String arithmeticSequenceElements(int first, int step, long total) {
        // Solution goes here
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < total; i++, first += step) {
            buffer.append(first);
            if (i != total - 1)
                buffer.append(",");
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(arithmeticSequenceElements(1, 2, 800));
    }
}
