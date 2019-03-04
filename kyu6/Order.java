package exercises.codewars.kyu6;

/**
 * Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
 * <p>
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * <p>
 * If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
 * <p>
 * Examples
 * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
 * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
 * ""  -->  ""
 *
 * @author Ross Khapilov
 * @version 1.0 04.03.2019
 */
public class Order {
    public static String order(String words) {
        StringBuilder sb = new StringBuilder();
        String[] srts = words.split(" ");
        for (int i = 1; i <= srts.length; i++) {
            for (String s : srts) {
                if (s.contains(i+"")) {
                    sb.append(s).append(" ");
                    break;
                }
            }
        }
        // ...
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
    }
}
