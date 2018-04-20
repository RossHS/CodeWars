package exercises.codewars;

import java.util.List;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 25.12.2017
 */
public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        int count = 0;
        String[] smiles = {":)", ":D", ";-D", ":~)", ";-)", ":~D"};
        for (String a : arr) {
            for (String s : smiles) {
                if (a.equals(s)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
