package exercises.codewars;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 18.01.2018
 */
public class NumberInExpandedForm {
    public static String expandedForm(int num) {
        String outs = "";
        for (int i = 10; i < num; i *= 10) {
            int rem = num % i;
            outs = (rem > 0) ? " + " + rem + outs : outs;
            num -= rem;
        }
        outs = num + outs;
        return outs;
    }
}
