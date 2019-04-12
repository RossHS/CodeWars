package exercises.codewars.kyu8;

/**
 * Simple, remove the spaces from the string, then return the resultant string.
 *
 * @author Ross Khapilov
 * @version 1.0 12.04.2019
 */
public class RemoveStringSpaces {
    static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }
}
