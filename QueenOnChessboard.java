package exercises.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * For example when input position is A1 return value should be:
 * <p>
 * ["A2", "A3", "A4", "A5", "A6", "A7", "A8", "B1", "B2", "C1", "C3", "D1", "D4", "E1", "E5", "F1", "F6", "G1", "G7",
 * "H1", "H8"]
 * <p>
 * A   B   C   D   E   F   G   H
 * + - + - + - + - + - + - + - + - +
 * 1  | Q | x | x | x | x | x | x | x |
 * + - + - + - + - + - + - + - + - +
 * 2  | x | x |   |   |   |   |   |   |
 * + - + - + - + - + - + - + - + - +
 * 3  | x |   | x |   |   |   |   |   |
 * + - + - + - + - + - + - + - + - +
 * 4  | x |   |   | x |   |   |   |   |
 * + - + - + - + - + - + - + - + - +
 * 5  | x |   |   |   | x |   |   |   |
 * + - + - + - + - + - + - + - + - +
 * 6  | x |   |   |   |   | x |   |   |
 * + - + - + - + - + - + - + - + - +
 * 7  | x |   |   |   |   |   | x |   |
 * + - + - + - + - + - + - + - + - +
 * 8  | x |   |   |   |   |   |   | x |
 * + - + - + - + - + - + - + - + - +
 * <p>
 * Q = queen
 * x = available move
 * Input:
 * input position can be any type (array, number, string and so on). If input position is not a string then return
 * empty array. valid input position is one letter from A to H with number from 1 to 8, for example A1, C8, B3. If
 * input is invalid (for example A10 or H0) then return empty array.
 *
 * @author Ross Khapilov
 * @version 1.0 created on 29.04.2018
 */
public class QueenOnChessboard {
    public static List<String> availableMoves(String position) {
        ArrayList<String> list = new ArrayList<>();
        if (position == null || !position.matches("^[A-H][1-8]$")) return list;
        String[] strings = {"A", "B", "C", "D", "E", "F", "G", "H"};
        String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8"};
        int sIndex = position.charAt(0) - 'A';
        int nIndex = position.charAt(1) - '1';
        for (int i = 0; i < nums.length; i++) {
            list.add(position.charAt(0) + nums[i]);
            list.add(strings[i] + position.charAt(1));
        }
        for (int i = sIndex - 1, j = nIndex - 1; i >= 0 && j >= 0; i--, j--) {
            list.add(strings[i] + nums[j]);
        }
        for (int i = sIndex - 1, j = nIndex + 1; i >= 0 && j < nums.length; i--, j++) {
            list.add(strings[i] + nums[j]);
        }
        for (int i = sIndex + 1, j = nIndex - 1; i < strings.length && j >= 0; i++, j--) {
            list.add(strings[i] + nums[j]);
        }
        for (int i = sIndex + 1, j = nIndex + 1; i < strings.length && j < nums.length; i++, j++) {
            list.add(strings[i] + nums[j]);
        }
        list.removeIf(e -> e.equals(position));
        Collections.sort(list);
        return list;
    }
}
