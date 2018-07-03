package exercises.codewars.kyu8;

/**
 * @author Ross Khapilov
 * @version 1.0 03.07.2018
 */
public class CalculateAverage {
    public static double find_average(int[] array) {
        int sum = 0;
        for (int anArray : array) {
            sum += anArray;
        }
        return sum / array.length;
    }
}
