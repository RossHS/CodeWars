package exercises.codewars.kyu4;

/**
 * This kata is blatantly copied from inspired by This Kata
 * <p>
 * Welcome
 * this is the second in the series of the string iterations kata!
 * <p>
 * Here we go!
 * <p>
 * We have a string s
 * <p>
 * Let's say you start with this: "String"
 * <p>
 * The first thing you do is reverse it: "gnirtS"
 * <p>
 * Then you will take the string from the 1st position and reverse it again: "gStrin"
 * <p>
 * Then you will take the string from the 2nd position and reverse it again: "gSnirt"
 * <p>
 * Then you will take the string from the 3rd position and reverse it again: "gSntri"
 * <p>
 * Continue this pattern until you have done every single position, and then you will return the string you have created. For this particular string, you would return: "gSntir"
 * <p>
 * now,
 * <p>
 * The Task:
 * In this kata, we also have a number x
 * <p>
 * take that reversal function, and apply it to the string x times.
 * <p>
 * return the result of the string after applying the reversal function to it x times.
 * <p>
 * example where s = "String" and x = 3:
 * <p>
 * after 0 iteration  s = "String"
 * after 1 iteration  s = "gSntir"
 * after 2 iterations s = "rgiStn"
 * after 3 iterations s = "nrtgSi"
 * <p>
 * so you would return "nrtgSi".
 *
 * @author Ross Khapilov
 * @version 1.0 29.06.2018
 */
public class JomoPipi {
    public static String stringFunc(String s, long x) {
        if (x == 0) return s;
        char[] in = s.toCharArray();
        for (int i = 0; i < in.length; i++) {
            for (int j = i, k = in.length - 1; j < k; j++, k--) {
                char temp = in[j];
                in[j] = in[k];
                in[k] = temp;
            }
        }
        return stringFunc(String.valueOf(in), x - 1);
    }
}
