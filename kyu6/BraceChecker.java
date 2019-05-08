package exercises.codewars.kyu6;

import java.util.Stack;

/**
 * Write a function that takes a string of braces, and determines if the order of the braces is valid.
 * It should return true if the string is valid, and false if it's invalid.
 * <p>
 * This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}.
 * Thanks to @arnedag for the idea!
 * <p>
 * All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
 * <p>
 * What is considered Valid?
 * A string of braces is considered valid if all braces are matched with the correct brace.
 * <p>
 * Examples
 * "(){}[]"   =>  True
 * "([{}])"   =>  True
 * "(}"       =>  False
 * "[(])"     =>  False
 * "[({})](]" =>  False
 *
 * @author Ross Khapilov
 * @version 1.0 08.05.2019
 */
public class BraceChecker {
    public boolean isValid(String braces) {
        Stack<Character> bracer = new Stack<>();
        for (char b : braces.toCharArray()) {
            if ("{[(".contains(b + "")) bracer.add(b);
            else if ("}])".contains(b + "") && (bracer.isEmpty() || !compare(bracer.pop(), b))) {
                return false;
            }
        }
        return bracer.isEmpty();
    }

    private static boolean compare(char braceLeft, char braceRight) {
        String str = "" + braceLeft + braceRight;
        return str.equals("()") || str.equals("{}") || str.equals("[]");
    }
}
