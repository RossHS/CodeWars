package exercises.codewars.kyu7;

/**
 * @author Ross Khapilov
 * @version 1.0 22.06.2019
 */
public class DontGiveMeFive {
    public static int dontGiveMeFive(int start, int end) {
        int result = 0;
        for (int i = start; i <= end; i++) {
            if (!(i+"").contains("5")) result++;
        }
        return result;
    }
}
