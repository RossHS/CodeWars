package exercises.codewars.kyu7;

import java.util.ArrayList;

/**
 * Number of people in the bus
 * There is a bus moving in the city, and it takes and drop some people in each bus stop.
 * <p>
 * You are provided with a list (or array) of integer arrays (or tuples). Each integer array has two items
 * which represent number of people get into bus (The first item) and number of people get off the bus
 * (The second item) in a bus stop.
 * <p>
 * Your task is to return number of people who are still in the bus after the last bus station (after the last array).
 * Even though it is the last bus stop, the bus is not empty and some people are still in the bus, and they are
 * probably sleeping there :D
 * <p>
 * Take a look on the test cases.
 * <p>
 * Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0. So the return
 * integer can't be negative.
 * <p>
 * The second value in the first integer array is 0, since the bus is empty in the first bus stop.
 *
 * @author Ross Khapilov
 * @version 1.0 09.10.2018
 */
public class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
        return stops
                .stream()
                .mapToInt(value -> value[0] - value[1])
                .sum();
    }

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});
        System.out.println(countPassengers(list));
    }
}
