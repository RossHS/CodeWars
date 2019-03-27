package exercises.codewars.kyu8;

/**
 * @author Ross Khapilov
 * @version 1.0 27.03.2019
 */
public class ConvertToBinary {
    public static int toBinary(int n) {
        int multiplier = 1;
        int result = 0;
        do {
            result += (n % 2) * multiplier;
            n /= 2;
            multiplier *= 10;
        } while (n > 0);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(toBinary(42));
    }
}
