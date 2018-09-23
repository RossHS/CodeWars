package exercises.codewars.kyu7;

import java.util.ArrayList;

/**
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive.
 * Implement a function that determines whether a string that contains only letters is an isogram.
 * Assume the empty string is an isogram. Ignore letter case.
 * <p>
 * isIsogram "Dermatoglyphics" == true
 * isIsogram "moose" == false
 * isIsogram "aba" == false
 *
 * @author Ross Khapilov
 * @version 1.0 23.09.2018
 */
public class Isograms {
    public static boolean isIsogram(String str) {
        ArrayList<Character> characters = new ArrayList<>();
        for (char c : str.toLowerCase().toCharArray()) {
            if (characters.contains(c)) return false;
            characters.add(c);
        }
        return true;
    }
}
