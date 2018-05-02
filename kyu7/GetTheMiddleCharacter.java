package exercises.codewars.kyu7;

/**
 * You are going to be given a word. Your job is to return the middle character of the word. If the word's length is
 * odd, return the middle character. If the word's length is even, return the middle 2 characters.
 * <p>
 * #Examples:
 * <p>
 * Kata.getMiddle("test") should return "es"
 * <p>
 * Kata.getMiddle("testing") should return "t"
 * <p>
 * Kata.getMiddle("middle") should return "dd"
 * <p>
 * Kata.getMiddle("A") should return "A"
 * #Input
 * <p>
 * A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases due
 * to an error in the test cases). You do not need to test for this. This is only here to tell you that you do not need to worry about your solution timing out.
 * <p>
 * #Output
 * <p>
 * The middle character(s) of the word represented as a string.
 *
 * @author Ross Khapilov
 * @version 1.0 created on 02.05.2018
 */
public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        int length = word.length();
        return length % 2 == 0 ? word.substring(length / 2 - 1, length / 2 + 1)
                : word.substring(length / 2, length / 2 + 1);
    }
}
