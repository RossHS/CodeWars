package exercises.codewars.kyu8;

/**
 * Convert number to reversed array of digits
 * Given a random number:
 * <p>
 * C#: long;
 * C++: unsigned long;
 * You have to return the digits of this number within an array in reverse order.
 * <p>
 * Example:
 * 348597 => [7,9,5,8,4,3]
 *
 * @author Ross Khapilov
 * @version 1.0 21.04.2019
 */
public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
