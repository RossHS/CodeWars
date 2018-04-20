package exercises.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 18.04.2018
 */
public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int a : elements)
            integerHashMap.put(a, 0);
        for (int element : elements) {
            int temp = integerHashMap.get(element);
            if (temp < maxOccurrences) {
                integerHashMap.put(element, ++temp);
                integers.add(element);
            }
        }
        int[] res = new int[integers.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = integers.get(i);
        return res;
    }

    public static void main(String[] args) {
        int[] a = deleteNth(new int[]{2, 2, 1, 2, 3, 4, 5, 5, 1, 2}, 2);
        System.out.println(Arrays.toString(a));
    }
}
