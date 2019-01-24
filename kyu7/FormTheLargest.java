package exercises.codewars.kyu7;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * @author Ross Khapilov
 * @version 1.0 24.01.2019
 */
public class FormTheLargest {
    public static long maxNumber(long n) {
        return Long.parseLong(Arrays.stream((n + "").split(""))
                        .sorted(Collections.reverseOrder())
                        .collect(Collectors.joining())); // Do your magic!
    }

    public static void main(String[] args) {
        System.out.println(maxNumber(63792));
    }
}
