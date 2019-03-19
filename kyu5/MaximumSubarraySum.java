package exercises.codewars.kyu5;

/**
 * @author Ross Khapilov
 * @version 1.0 19.03.2019
 */
public class MaximumSubarraySum {
    public static int sequence(int[] arr) {
        int maxEndingHere = 0, maxSoFar = 0;
        for (int v : arr) {
            maxEndingHere = Math.max(0, maxEndingHere + v);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
