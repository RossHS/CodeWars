package exercises.codewars.kyu7;

/**
 * Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most
 * secret question is still correct. However, since someone could look over your shoulder, you don't want that
 * shown on your screen. Instead, we mask it.
 * <p>
 * Your task is to write a function maskify, which changes all but the last four characters into '#'.
 * <p>
 * Examples
 * Maskify.Maskify("4556364607935616"); // should return "############5616"
 * Maskify.Maskify("64607935616");      // should return "#######5616"
 * Maskify.Maskify("1");                // should return "1"
 * Maskify.Maskify("");                 // should return ""
 * <p>
 * // "What was the name of your first pet?"
 * Maskify.Maskify("Skippy");                                   // should return "##ippy"
 * Maskify.Maskify("Nananananananananananananananana Batman!"); // should return "####################################man!"
 *
 * @author Ross Khapilov
 * @version 1.0 06.05.2019
 */
public class Maskify {
    public static String maskify(String str) {
        if (str.length() <= 4) return str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 4; i++) {
            sb.append("#");
        }
        sb.append(str.substring(str.length() - 4));
        return sb.toString();
    }
}
