package exercises.codewars.kyu8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write a function called repeatStr which repeats the given string string exactly n times.
 * <p>
 * repeatStr(6, "I") // "IIIIII"
 * repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
 *
 * @author Ross Khapilov
 * @version 1.0 01.10.2018
 */
public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        if (repeat <= 0 || string.equals("")) return "";
        return Stream.generate(() -> string)
                .limit(repeat)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(3, "Aa"));
        System.out.println(repeatStr(-2, "Aa"));
    }
}
