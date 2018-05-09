package exercises.codewars.kyu6;

import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 09.05.2018
 */
public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {
        int sumRight = Arrays.stream(arr).sum() - arr[0];
        int sumLeft = 0;
        for (int i = 1; i < arr.length; i++) {
            sumLeft += arr[i - 1];
            sumRight -= arr[i];
            if (sumLeft == sumRight) return i;
        }
        return -1;
    }
}
