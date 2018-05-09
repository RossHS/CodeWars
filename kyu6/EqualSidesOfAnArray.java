package exercises.codewars.kyu6;

import java.util.Arrays;

/**
 * You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of
 * the integers to the left of N is equal to the sum of the integers to the right of N. If there is no index that would
 * make this happen, return -1.
 * <p>
 * For example:
 * <p>
 * Let's say you are given the array {1,2,3,4,3,2,1}:
 * Your function will return the index 3, because at the 3rd position of the array, the sum of left side of the index
 * ({1,2,3}) and the sum of the right side of the index ({3,2,1}) both equal 6.
 * <p>
 * Let's look at another one.
 * You are given the array {1,100,50,-51,1,1}:
 * Your function will return the index 1, because at the 1st position of the array, the sum of left side of the index
 * ({1}) and the sum of the right side of the index ({50,-51,1,1}) both equal 1.
 * <p>
 * Last one:
 * You are given the array {20,10,-80,10,10,15,35}
 * At index 0 the left side is {}
 * The right side is {10,-80,10,10,15,35}
 * They both are equal to 0 when added. (Empty arrays are equal to 0 in this problem)
 * Index 0 is the place where the left side and right side are equal.
 * <p>
 * Note: Please remember that in most programming/scripting languages the index of an array starts at 0.
 *
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
