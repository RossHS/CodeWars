package exercises.codewars.kyu6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which
 * are substrings of strings of a2.
 * <p>
 * #Example 1: a1 = ["arp", "live", "strong"]
 * <p>
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * <p>
 * returns ["arp", "live", "strong"]
 * <p>
 * #Example 2: a1 = ["tarp", "mice", "bull"]
 * <p>
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * <p>
 * returns []
 * <p>
 * Notes:
 * Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
 * <p>
 * In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
 * <p>
 * Beware: r must be without duplicates.
 * Don't mutate the inputs.
 *
 * @author Ross Khapilov
 * @version 1.0 07.09.2018
 */
public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        List<String> stringList = new ArrayList<>();
        for (String s : array1)
            for (String s1 : array2) {
                if (s1.contains(s) && !stringList.contains(s)) {
                    stringList.add(s);
                    break;
                }
            }
        Collections.sort(stringList);
        return stringList.toArray(new String[0]);
    }
}
