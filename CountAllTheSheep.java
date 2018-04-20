package exercises.codewars;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 18.01.2018
 */
public class CountAllTheSheep {
    public static int lostSheeps(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepsTotal) {
        for (int n : fridayNightCounting) {
            sheepsTotal -= n;
        }
        for (int n : saturdayNightCounting) {
            sheepsTotal -= n;
        }
        return sheepsTotal;
    }
}
