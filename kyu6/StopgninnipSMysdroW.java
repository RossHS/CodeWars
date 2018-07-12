package exercises.codewars.kyu6;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Write a function that takes in a string of one or more words, and returns the same string, but with all five or more
 * letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces.
 * Spaces will be included only when more than one word is present.
 * <p>
 * <p>
 * Examples:
 * <p>
 * spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 * spinWords( "This is a test") => returns "This is a test"
 * spinWords( "This is another test" )=> returns "This is rehtona test"
 *
 * @author Ross Khapilov
 * @version 1.0 12.07.2018
 */
public class StopgninnipSMysdroW {
    public String spinWords(String sentence) {
        return Pattern.compile(" +").splitAsStream(sentence)
                .map(word -> word.length() < 5 ? word : new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }
}
