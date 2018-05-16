package exercises.codewars.kyu8;

/**
 * You get an array of numbers, return the sum of all of the positives ones.
 * <p>
 * Example [1,-4,7,12] => 1 + 7 + 12 = 20
 * <p>
 * Note: array may be empty, in this case return 0.
 *
 * @author Ross Khapilov
 * @version 1.0 created on 16.05.2018
 */
public class SumOfPositive {
    public static int sum(int[] arr){
        int sum = 0;
        for (int n: arr){
            if(n>0) sum+=n;
        }
        return sum;
    }
}
