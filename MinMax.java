package exercises.codewars;

import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 21.12.2017
 */
public class MinMax {
    public static int[] minMax(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length-1]};
    }
}
