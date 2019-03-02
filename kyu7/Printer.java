package exercises.codewars.kyu7;

import java.util.Arrays;

/**
 * In a factory a printer prints labels for boxes. For one kind of boxes the printer has to use colors which, for the sake of simplicity, are named with letters from a to m.
 * <p>
 * The colors used by the printer are recorded in a control string. For example a "good" control string would be aaabbbbhaijjjm meaning that the printer used three times color a, four times color b, one time color h then one time color a...
 * <p>
 * Sometimes there are problems: lack of colors, technical malfunction and a "bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm with letters not from a to m.
 * <p>
 * You have to write a function printer_error which given a string will output the error rate of the printer as a string representing a rational whose numerator is the number of errors and the denominator the length of the control string. Don't reduce this fraction to a simpler expression.
 * <p>
 * The string has a length greater or equal to one and contains only letters from ato z.
 * <p>
 * #Examples:
 * <p>
 * s="aaabbbbhaijjjm"
 * error_printer(s) => "0/14"
 * <p>
 * s="aaaxbbbbyyhwawiwjjjwwm"
 * error_printer(s) => "8/22"
 *
 * @author Ross Khapilov
 * @version 1.0 02.03.2019
 */
public class Printer {

    public static String printerError(String s) {
        // your code
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }

    public static void main(String[] args) {
        System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
    }
}
