package exercises.codewars.kyu6;

/**
 * You are given an array strarr of strings and an integer k. Your task is to return the first longest string
 * consisting of k consecutive strings taken in the array.
 * <p>
 * #Example: longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
 * <p>
 * n being the length of the string array, if n = 0 or k > n or k <= 0 return "".
 *
 * @author Ross Khapilov
 * @version 1.0 05.07.2018
 */
public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length || k <= 0)
            return "";

        String longestStr = "";
        for (int index = 0; index < strarr.length - k + 1; index++) {
            StringBuilder sb = new StringBuilder();
            for (int i = index; i < index + k; i++) {
                sb.append(strarr[i]);
                System.out.println(sb);
            }
            if (sb.toString().length() > longestStr.length()) {
                longestStr = sb.toString();
                System.out.println(longestStr);
            }
        }
        return longestStr;
    }


    public static void main(String[] args) {
        longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2);
    }
}
