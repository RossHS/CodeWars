package exercises.codewars.kyu4;

import java.util.Arrays;

/**
 * You have to create a function that takes a positive integer number and returns the next bigger number formed by the same digits:
 * <p>
 * Kata.nextBiggerNumber(12)==21
 * Kata.nextBiggerNumber(513)==531
 * Kata.nextBiggerNumber(2017)==2071
 * If no bigger number can be composed using those digits, return -1:
 * <p>
 * Kata.nextBiggerNumber(9)==-1
 * Kata.nextBiggerNumber(111)==-1
 * Kata.nextBiggerNumber(531)==-1
 *
 * @author Ross Khapilov
 * @version 1.0 05.07.2018
 */
public class NextBiggerNumberWithTheSameDigits {
    public static long nextBiggerNumber(long n) {
        String str = n + "";
        char[] chars = str.toCharArray();
        int midIndex = -1;
        for (int i = chars.length - 1; i > 0; i--) {
            if (chars[i - 1] < chars[i]) {
                midIndex = i - 1;
                break;
            }
        }
        if (midIndex == -1) return -1;

        char lowestRightPart = chars[midIndex];
        char mn = 58;
        int mni = 0;
        for (int i = midIndex; i < chars.length; i++) {
            if (lowestRightPart < chars[i]) {
                if (chars[i] < mn) {
                    mn = chars[i];
                    mni = i;
                }
            }
        }
        char temp = chars[midIndex];
        chars[midIndex] = chars[mni];
        chars[mni] = temp;
        Arrays.sort(chars, midIndex + 1, chars.length);
        long lon = Long.parseLong(String.valueOf(chars));
        return lon > n ? lon : -1;
    }

    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(123456789L));
//        System.out.println(nextBiggerNumber(2017));
        System.out.println((char)58);
    }
}
