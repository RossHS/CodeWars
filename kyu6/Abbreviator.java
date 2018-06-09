package exercises.codewars.kyu6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The word i18n is a common abbreviation of internationalization in the developer community, used instead of typing the whole word and trying to spell it correctly. Similarly, a11y is an abbreviation of accessibility.
 * <p>
 * Write a function that takes a string and turns any and all "words" (see below) within that string of length 4 or greater into an abbreviation, following these rules:
 * <p>
 * A "word" is a sequence of alphabetical characters. By this definition, any other character like a space or hyphen (eg. "elephant-ride") will split up a series of letters into two words (eg. "elephant" and "ride").
 * The abbreviated version of the word should have the first letter, then the number of removed characters, then the last letter (eg. "elephant ride" => "e6t r2e").
 * Example
 * <p>
 * abbreviate("elephant-rides are really fun!")
 * //          ^^^^^^^^*^^^^^*^^^*^^^^^^*^^^*
 * // words (^):   "elephant" "rides" "are" "really" "fun"
 * //                123456     123     1     1234     1
 * // ignore short words:               X              X
 * <p>
 * // abbreviate:    "e6t"     "r3s"  "are"  "r4y"   "fun"
 * // all non-word characters (*) remain in place
 * //                     "-"      " "    " "     " "     "!"
 * === "e6t-r3s are r4y fun!"
 *
 * @author Ross Khapilov
 * @version 1.0 09.06.2018
 */
public class Abbreviator {
    public String abbreviate(String string) {
        String res = string;
        Pattern p = Pattern.compile("(\\w{4,})");
        Matcher m = p.matcher(string);
        while (m.find()) {
            String part = m.group();
            String repl = "" + part.charAt(0) + (part.length() - 2) + part.charAt(part.length() - 1);
            res = res.replaceFirst(part, repl);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Abbreviator().abbreviate("elephant-rides are really fun"));
    }
}
