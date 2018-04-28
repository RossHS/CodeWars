package exercises.codewars;

/**
 * In this Kata, you will be given a string with brackets and an index of an opening bracket and your task will be to return the index of the matching closing bracket. Both the input and returned index are 0-based except in Fortran where it is 1-based. An opening brace will always have a closing brace. Return -1 if there is no answer (Haskell return Nothing, Fortran: return 0)
 * <p>
 * For example, in JS, Python, Ruby...
 * <p>
 * solve("((1)23(45))(aB)", 0) = 10 -- the opening brace at index 0 matches the closing brace at index 10
 * solve("((1)23(45))(aB)", 1) = 3
 * solve("((1)23(45))(aB)", 2) = -1 -- there is no opening bracket at index 2, so return -1
 * solve("((1)23(45))(aB)", 6) = 9
 * solve("((1)23(45))(aB)", 11) = 14
 * solve("((>)|?(*'))(yZ)", 11) = 14
 *
 * @author Ross Khapilov
 * @version 1.0 created on 28.04.2018
 */
public class Indice {
    public static int solve(String str, int index) {
        int openBrackets = 0;
        if (!(str.charAt(index) == '('))
            return -1;
        for (int i = index; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                openBrackets++;
            if (str.charAt(i) == ')')
                openBrackets--;
            if (openBrackets == 0)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solve("0(a)1", 1));
    }
}
