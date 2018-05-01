package exercises.codewars.kyu6;

/**
 * Write Number in Expanded Form
 * You will be given a number and you will need to return it as a string in Expanded Form. For example:
 * <p>
 * Kata.expandedForm(12); # Should return "10 + 2"
 * Kata.expandedForm(42); # Should return "40 + 2"
 * Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
 * NOTE: All numbers will be whole numbers greater than 0.
 *
 * @author Ross Khapilov
 * @version 1.0 created on 01.05.2018
 */
public class WriteNumberInExpandedForm {
    //mine
    public static String expandedForm(int num) {
        String str = String.valueOf(num);
        String result = "";
        int len = String.valueOf(num).length();
        for (int i = 0; i < len; i++) {
            char number = str.charAt(i);
            if (number == '0') continue;
            result += number;
            for (int j = i; j < len - 1; j++) {
                result += "0";
            }
            if (i == len - 1) break;
            result += " + ";
        }
        result = result.replaceAll("( \\+ )$", "");
        return result;
    }

    public static String goodSolution(int num){
        String outs = "";
        for (int i = 10; i < num; i *= 10) {
            int rem = num % i;
            outs = (rem > 0) ? " + " + rem + outs : outs;
            num -= rem;
        }
        outs = num + outs;

        return outs;
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(900000));
    }
}
