package exercises.codewars.kyu7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
 * <p>
 * Examples
 * "This is an example!" ==> "sihT si na !elpmaxe"
 * "double  spaces"      ==> "elbuod  secaps"
 *
 * @author Ross Khapilov
 * @version 1.0 16.10.2018
 */
public class ReverseWords {
    public static String reverseWords(final String original) {
        return Stream.of(original.split(" "))
                .map(v->{
                    StringBuilder s = new StringBuilder();
                    for (int i = v.length()-1; i >= 0; i--) {
                        s.append(v.charAt(i));
                    }
                    return s.toString();
                })
                .collect(Collectors.joining(" "));
    }
}
