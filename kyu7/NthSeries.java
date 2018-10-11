package exercises.codewars.kyu7;

/**
 * Task:
 * Your task is to write a function which returns the sum of following series upto nth term(parameter).
 * <p>
 * Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
 * Rules:
 * You need to round the answer to 2 decimal places and return it as String.
 * <p>
 * If the given value is 0 then it should return 0.00
 * <p>
 * You will only be given Natural Numbers as arguments.
 * <p>
 * Examples:
 * SeriesSum(1) => 1 = "1.00"
 * SeriesSum(2) => 1 + 1/4 = "1.25"
 * SeriesSum(5) => 1 + 1/4 + 1/7 + 1/10 + 1/13 = "1.57"
 * NOTE: In PHP the function is called series_sum().
 *
 * @author Ross Khapilov
 * @version 1.0 28.09.2018
 */
public class NthSeries {
    public static String seriesSum(int n) {
        double result = 0;
        for (int i = 0, j = 1; i < n; i++, j += 3) {
            result += (double) 1 / j;
            System.out.println(result);
        }
        return result+" ";
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }
}
