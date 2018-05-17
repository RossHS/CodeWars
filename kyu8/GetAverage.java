package exercises.codewars.kyu8;

import java.util.Arrays;

/**
 * It's the academic year's end, fateful moment of your school report. The averages must be calculated. All the students come to you and entreat you to calculate their average for them. Easy ! You just need to write a script.
 * <p>
 * Return the average of the given array rounded down to its nearest integer.
 * <p>
 * The array will never be empty.
 *
 * @author Ross Khapilov
 * @version 1.0 created on 17.05.2018
 */
public class GetAverage {
    public static int getAverage(int[] marks) {
        return Arrays.stream(marks).sum()/marks.length;
    }
}
