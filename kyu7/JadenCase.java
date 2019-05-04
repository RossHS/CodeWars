package exercises.codewars.kyu7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ross Khapilov
 * @version 1.0 04.05.2019
 */
public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) return null;
        Matcher m = Pattern.compile("\\b[a-zA-Z]").matcher(phrase);
        StringBuilder sb = new StringBuilder();
        int last = 0;
        while (m.find()) {
            sb.append(phrase, last, m.start());
            sb.append(m.group(0).toUpperCase());
            last = m.end();
        }
        sb.append(phrase.substring(last));
        return sb.toString();
    }
}
