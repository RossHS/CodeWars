package exercises.codewars.kyu8;

import java.util.Arrays;

/**
 * Can you find the needle in the haystack?
 * <p>
 * Write a function findNeedle() that takes an array full of junk but containing one "needle"
 * <p>
 * After your function finds the needle it should return a message (as a string) that says:
 * <p>
 * "found the needle at position " plus the index it found the needle, so:
 * <p>
 * Python, Ruby & Elixir
 * <p>
 * find_needle(['hay', 'junk', 'hay', 'hay', 'moreJunk', 'needle', 'randomJunk'])
 * JavaScript & TypeScript
 * <p>
 * findNeedle(['hay', 'junk', 'hay', 'hay', 'moreJunk', 'needle', 'randomJunk'])
 * Java
 * <p>
 * findNeedle(new Object[] {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"})
 * should return
 * <p>
 * "found the needle at position 5"
 *
 * @author Ross Khapilov
 * @version 1.0 19.06.2019
 */
public class ANeedleintheHaystack {
    public static String findNeedle(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }
}
