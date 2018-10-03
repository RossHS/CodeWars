package exercises.codewars.kyu7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Simple, given a string of words, return the length of the shortest word(s).
 * <p>
 * String will never be empty and you do not need to account for different data types.
 *
 * @author Ross Khapilov
 * @version 1.0 03.10.2018
 */
public class ShortestWord {
    public static int findShort(String s) {
        return Stream.of(s.split("[, ]"))
                .collect(Collectors.summarizingInt(String::length))
                .getMin();
    }

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
    }
}
