package exercises.codewars.kyu7;

/**
 * Given a number, write a function to output its reverse digits. (e.g. given 123 the answer is 321)
 * <p>
 * Numbers should preserve their sign; i.e. a negative number should still be negative when reversed.
 * <p>
 * Examples
 * 123 ->  321
 * -456 -> -654
 * 1000 ->    1
 *
 * @author Ross Khapilov
 * @version 1.0 18.04.2019
 */
public class ReverseNumber {
    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            result *= 10;
            result += number % 10;
            number /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
}
