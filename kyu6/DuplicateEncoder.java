package exercises.codewars.kyu6;

import java.util.stream.Collectors;

/**
 * @author Ross Khapilov
 * @version 1.0 29.09.2018
 */
public class DuplicateEncoder {
    static String encode(String word) {
        return word.toLowerCase()
                .chars()
                .mapToObj(i -> String.valueOf((char) i))
                .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
                .collect(Collectors.joining());
    }
}
