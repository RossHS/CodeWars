package exercises.codewars;

import java.util.HashMap;

/**
 * Given an array with exactly 5 strings "a", "b" or "c" (chars in Java, characters in Fortran), check if the array contains three and two of the same values.
 * <p>
 * Examples
 * ["a", "a", "a", "b", "b"] ==> true  // 3x "a" and 2x "b"
 * ["a", "b", "c", "b", "c"] ==> false // 1x "a", 2x "b" and 2x "c"
 * ["a", "a", "a", "a", "a"] ==> false // 5x "a"
 *
 * @author Ross Khapilov
 * @version 1.0 created on 20.04.2018
 */
public class CheckThreeAndTwo {
    public boolean checkThreeAndTwo(char[] chars) {
        if (chars.length != 5) return false;
        HashMap<Character, Integer> integerHashMap = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            integerHashMap.put(chars[i], integerHashMap.getOrDefault(chars[i], 0) + 1);
        }
        return integerHashMap.containsValue(2) && integerHashMap.containsValue(3);
    }

    public boolean checkThreeAndTwoV2(char[] chars) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        for (char c : chars)
            switch (c) {
                case 'a':
                    countA++;
                    break;
                case 'b':
                    countB++;
                    break;
                case 'c':
                    countC++;
                    break;
                default:
                    return false;
            }
        return (countA == 2 || countB == 2 || countC == 2) && (countA == 3 || countB == 3 || countC == 3);
    }

    public static void main(String[] args) {
        new CheckThreeAndTwo().checkThreeAndTwoV2(new char[]{'a', 'a', 'b', 'b', 'b'});
    }
}
