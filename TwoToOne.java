package exercises.codewars;

import java.util.TreeSet;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 30.03.2018
 */
public class TwoToOne {

    public static String longest(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        TreeSet<Character> characters = new TreeSet<>();
        for (char c : c1) {
            if (!(c >= 'a' && c <= 'z')) return null;
            characters.add(c);
        }
        for (char c : c2) {
            if (!(c >= 'a' && c <= 'z')) return null;
            characters.add(c);
        }
        String result = "";
        for (Character s : characters) {
            result += s;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longest("aretheyhere", "yestheyarehere"));

    }
}