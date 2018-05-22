package exercises.codewars.kyu6;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * <p>
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 * <p>
 * Note: If the number is a multiple of both 3 and 5, only count it once.
 *
 * @author Ross Khapilov
 * @version 1.0 22.05.2018
 */
public class MultiplesOf3or5 {
    public int solution(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++)
            if (i % 3 == 0 || i % 5 == 0)
                System.out.println(i);
        return sum;
    }

    public static void main(String[] args) {
        new MultiplesOf3or5().solution(10);
    }
}
