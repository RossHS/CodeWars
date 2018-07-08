package exercises.codewars.kyu4;

import java.util.Arrays;

/**
 * Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.
 * <p>
 * array = [[1,2,3],
 * [4,5,6],
 * [7,8,9]]
 * snail(array) #=> [1,2,3,6,9,8,7,4,5]
 * For better understanding, please follow the numbers of the next array consecutively:
 * <p>
 * array = [[1,2,3],
 * [8,9,4],
 * [7,6,5]]
 * snail(array) #=> [1,2,3,4,5,6,7,8,9]
 * This image will illustrate things more clearly:
 * <p>
 * <p>
 * <p>
 * NOTE: The idea is not sort the elements from the lowest value to the highest; the idea is to traverse the 2-d array
 * in a clockwise snailshell pattern.
 * <p>
 * NOTE 2: The 0x0 (empty matrix) is represented as [[]]
 *
 * @author Ross Khapilov
 * @version 1.0 06.07.2018
 */
public class Snail {
    public static int[] snail(int[][] array) {
        int[] result = new int[array.length * array[0].length];
        int x = 0;
        int y = -1;
        int index = 0;
        int j = 0;
        while (true) {
            int thisLength;
            if (index % 2 == 0)
                thisLength = array[0].length - (index / 2);
            else thisLength = array.length - (index / 2) - 1;
            if (thisLength == 0) return result;
            int xInc = 0;
            int yInc = 0;
            switch (index % 4) {
                case 0:
                    yInc = 1;
                    break;
                case 1:
                    xInc = 1;
                    break;
                case 2:
                    yInc = -1;
                    break;
                case 3:
                    xInc = -1;
                    break;
            }
            for (int i = 0; i < thisLength; i++, j++) {
                result[j] = array[x + (i + 1) * xInc][y + (i + 1) * yInc];
            }
            x += thisLength * xInc;
            y += thisLength * yInc;
            index++;
        }
    }

    public static int[] snail2(int[][] array) {
        if (array[0].length == 0) return new int[0];
        int n = array.length;
        int[] answer = new int[n * n];
        int index = 0;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i; j++) answer[index++] = array[i][j];
            for (int j = i + 1; j < n - i; j++) answer[index++] = array[j][n - i - 1];
            for (int j = i + 1; j < n - i; j++) answer[index++] = array[n - i - 1][n - j - 1];
            for (int j = i + 1; j < n - i - 1; j++) answer[index++] = array[n - j - 1][i];
        }
        if (n % 2 != 0) answer[index++] = array[n / 2][n / 2];
        return answer;
    }

    public static void main(String[] args) {
        int[] ar = snail2(new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}});
        System.out.println(Arrays.toString(ar));
    }
}
