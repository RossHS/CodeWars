package exercises.codewars;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 16.03.2018
 */
public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int sum = 0;
        for (int i = 0, counter = 1; i <= n; i++) {
            for (int j = 0; j < i; j++, counter += 2) {
                if (i == n) sum += counter;
            }
        }
        return sum;
    }
    public static String numberToString(int num) {
       return String.valueOf(num);
    }

    public static void main(String[] args) {
        //    System.out.println(rowSumOddNumbers(1));
        //System.out.println(rowSumOddNumbers(2));
            System.out.println(rowSumOddNumbers(3));
        //     System.out.println(rowSumOddNumbers(4));
    }
}
