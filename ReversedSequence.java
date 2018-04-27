package exercises.codewars;

/**
 * Get the number n (n>0) to return the reversed sequence from n to 1.
 * <p>
 * Example : n=5 >> [5,4,3,2,1]
 *
 * @author Ross Khapilov
 * @version 1.0 created on 27.04.2018
 */
public class ReversedSequence {

    public static int[] reverse(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = n - i;
        }
        return res;
    }

    public static void main(String[] args) {
        reverse(5);
    }
}
