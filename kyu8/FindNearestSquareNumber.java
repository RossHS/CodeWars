package exercises.codewars.kyu8;

/**
 * Your task is to find the nearest square number, nearest_sq(n), of a positive integer n.
 *
 * @author Ross Khapilov
 * @version 1.0 created on 09.05.2018
 */
public class FindNearestSquareNumber {
    public int nearestSq(int n) {
        return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
    }

    public static void main(String[] args) {
        System.out.println(new FindNearestSquareNumber().nearestSq(10));
    }
}
