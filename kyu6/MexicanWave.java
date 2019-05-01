package exercises.codewars.kyu6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ross Khapilov
 * @version 1.0 01.05.2019
 */
public class MexicanWave {
    public static String[] wave(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') continue;
            list.add(str.substring(0, i) + Character.toUpperCase(c) + str.substring(i + 1));
        }
        return list.toArray(new String[0]);
    }
}
