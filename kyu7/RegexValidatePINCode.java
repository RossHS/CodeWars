package exercises.codewars.kyu7;

/**
 * ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * <p>
 * If the function is passed a valid PIN string, return true, else return false.
 * <p>
 * eg:
 * <p>
 * Solution.validatePin("1234") === true
 * <p>
 * Solution.validatePin("12345") === false
 * Solution.validatePin("a234") === false
 *
 * @author Ross Khapilov
 * @version 1.0 29.03.2019
 */
public class RegexValidatePINCode {
    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }

    public static void main(String[] args) {

    }
}
