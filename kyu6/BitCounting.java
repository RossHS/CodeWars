package exercises.codewars.kyu6;

/**
 * Write a function that takes an (unsigned) integer as input, and returns the number of bits that are equal to one in
 * the binary representation of that number.
 * <p>
 * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 *
 * @author Ross Khapilov
 * @version 1.0 03.08.2018
 */
public class BitCounting {
    public static int countBits(int n) {
        return Integer.bitCount(n);
    }
}
