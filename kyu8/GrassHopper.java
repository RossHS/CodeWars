package exercises.codewars.kyu8;

import java.util.stream.IntStream;

/**
 * @author Ross Khapilov
 * @version 1.0 13.05.2019
 */
public class GrassHopper {
    public static int summation(int n) {
        return IntStream.rangeClosed(1,n).sum();
    }
}
