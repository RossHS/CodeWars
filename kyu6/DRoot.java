package exercises.codewars.kyu6;

/**
 * In this kata, you must create a digital root function.
 * <p>
 * A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n.
 * If that value has two digits, continue reducing in this way until a single-digit number is produced. This is only
 * applicable to the natural numbers.
 * <p>
 * Here's how it works (Ruby example given):
 * <p>
 * digital_root(16)
 * => 1 + 6
 * => 7
 * <p>
 * digital_root(942)
 * => 9 + 4 + 2
 * => 15 ...
 * => 1 + 5
 * => 6
 * <p>
 * digital_root(132189)
 * => 1 + 3 + 2 + 1 + 8 + 9
 * => 24 ...
 * => 2 + 4
 * => 6
 * <p>
 * digital_root(493193)
 * => 4 + 9 + 3 + 1 + 9 + 3
 * => 29 ...
 * => 2 + 9
 * => 11 ...
 * => 1 + 1
 * => 2
 *
 * @author Ross Khapilov
 * @version 1.0 06.07.2018
 */
public class DRoot {
    public static int digital_root(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum / 10 == 0 ? sum : digital_root(sum);
    }

    public static void main(String[] args) {
        System.out.println(digital_root(36));
        System.out.println(digital_root(1238));
    }
}
