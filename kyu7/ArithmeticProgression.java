package exercises.codewars.kyu7;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 09.05.2018
 */
public class ArithmeticProgression {
    public static String arithmeticSequenceElements(int first, int step, long total) {
        // Solution goes here
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < total; i++, first += step) {
            buffer.append(first);
            if (i != total - 1)
                buffer.append(",");
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(arithmeticSequenceElements(1, 2, 800));
    }
}
