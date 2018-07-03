package exercises.codewars.kyu7;

/**
 * Covfefe
 * Your are given a string. You must replace the word(s) coverage by covfefe, however, if you don't find the word
 * coverage in the string, you must add covfefe at the end of the string with a leading space.
 * <p>
 * For the languages where the string is not immutable (such as ruby), don't modify the given string, otherwise this
 * will break the test cases.
 *
 * @author Ross Khapilov
 * @version 1.0 03.07.2018
 */
public class Covfefe {
    public static String covfefe(String tweet) {
        return tweet.contains("coverage") ?
                tweet.replaceAll("coverage", "covfefe") : tweet + " covfefe";
    }
}
