package exercises.codewars;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 18.03.2018
 */
public class SquareDigit {
    public int squareDigits(int n) {
        String str = String.valueOf(n);
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += (int)Math.pow(Character.getNumericValue(str.charAt(i)),2);
        }
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        System.out.println(new SquareDigit().squareDigits(9119));
    }
}
