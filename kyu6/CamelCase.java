package exercises.codewars.kyu6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ross Khapilov
 * @version 1.0 24.04.2019
 */
public class CamelCase {

    public static String camelCase(String str) {
        Matcher m = Pattern.compile("\\b[a-zA-Z]").matcher(str);
        StringBuilder sb = new StringBuilder();
        int last = 0;
        while (m.find()) {
            sb.append(str, last, m.start());
            sb.append(m.group(0).toUpperCase());
            last = m.end();
        }
        sb.append(str.substring(last));
        return sb.toString().replaceAll(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(camelCase("test case"));
    }
}
