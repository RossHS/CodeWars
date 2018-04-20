package exercises.codewars;

import java.util.Arrays;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 14.03.2018
 */

public class Queue {
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] tills = new int[n];
        for (int man : customers) {
            int time = 0;
            for (int i = 0; i < tills.length; i++) {
                if (tills[time] > tills[i]) {
                    time = i;
                }
            }
            tills[time] += man;
        }
        Arrays.sort(tills);
        return tills[tills.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[]{3, 2, 1, 6, 12, 3, 1, 6, 7, 8}, 3));
    }
}
