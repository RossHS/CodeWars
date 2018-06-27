package exercises.codewars.kyu6;

import java.util.Arrays;

/**
 * Given an array, find the int that appears an odd number of times.
 * <p>
 * There will always be only one integer that appears an odd number of times.
 *
 * @author Ross Khapilov
 * @version 1.0 27.06.2018
 */
public class FindOdd {
    public static int findIt(int[] a) {
        Arrays.sort(a);
        if (a.length == 1) return a[0];
        int counter = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1])
                counter++;
            else {
                if (counter % 2 == 1) return a[i - 1];
                counter = 1;
            }
        }
        return a[a.length - 1];
    }

    public static int findIt2(int[] a) {
        int xor = 0;
        for (int s: a) {
            xor ^= s;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] a = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        System.out.println(findIt2(a));
    }
}
