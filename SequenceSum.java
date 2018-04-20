package exercises.codewars;

/**
 * We want to generate a function that computes the series starting from 0 and ending until the given number following the sequence:
 * <p>
 * 0 1 3 6 10 15 21 28 36 45 55 ....
 * <p>
 * which is created by
 * <p>
 * 0, 0+1, 0+1+2, 0+1+2+3, 0+1+2+3+4, 0+1+2+3+4+5, 0+1+2+3+4+5+6, 0+1+2+3+4+5+6+7 etc..
 * <p>
 * Input:
 * <p>
 * LastNumber
 * <p>
 * Output:
 * <p>
 * series and result
 *
 * @author Ross Khapilov
 * @version 1.0 created on 21.12.2017
 */
public class SequenceSum {
    public static String showSequence(int value) {
        if (value < 0) return value + "<0";
        int sum = 0;
        String str = "";
        for (int i = 0; i <= value; i++) {
            sum += i;
            str += i;
            if (i != value) str += "+";
        }
        return str + " = " + sum;
    }

    public static void main(String[] args) {
        System.out.println(showSequence(6));
    }
}

