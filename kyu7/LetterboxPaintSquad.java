package exercises.codewars.kyu7;

import java.util.Arrays;

/**
 * Kata Task
 * Given the start and end letterbox numbers, write a method to return the frequency of all 10 digits painted.
 * <p>
 * Example
 * For start = 125, and end = 132
 * <p>
 * The letterboxes are
 * <p>
 * 125 = 1, 2, 5
 * 126 = 1, 2, 6
 * 127 = 1, 2, 7
 * 128 = 1, 2, 8
 * 129 = 1, 2, 9
 * 130 = 1, 3, 0
 * 131 = 1, 3, 1
 * 132 = 1, 3, 2
 * The digit frequencies are 1 x 0, 9 x 1, 6 x 2 etc...
 * <p>
 * and so the method would return [1,9,6,3,0,1,1,1,1,1]
 * <p>
 * Notes
 * 0 < start <= end
 *
 * @author Ross Khapilov
 * @version 1.0 09.06.2018
 */
public class LetterboxPaintSquad {
    public static int[] paintLetterboxes(final int start, final int end) {
        if (start < 0 || start >= end) throw new IllegalArgumentException("0 < start <= end");
        int[] result = new int[10];
        for (int i = start; i <= end; i++) {
            var val = i;
            while (val > 0) {
                result[val%10]++;
                val/=10;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(paintLetterboxes(125, 132)));
    }
}
