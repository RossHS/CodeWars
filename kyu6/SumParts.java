package exercises.codewars.kyu6;

/**
 * Let us consider this example (array written in general format):
 * <p>
 * ls = [0, 1, 3, 6, 10]
 * <p>
 * Its following parts:
 * <p>
 * ls = [0, 1, 3, 6, 10]
 * ls = [1, 3, 6, 10]
 * ls = [3, 6, 10]
 * ls = [6, 10]
 * ls = [10]
 * ls = []
 * The corresponding sums are (put together in a list): [20, 20, 19, 16, 10, 0]
 * <p>
 * The function parts_sums (or its variants in other languages) will take as parameter a list
 * ls and return a list of the sums of its parts as defined above.
 * <p>
 * Other Examples:
 * ls = [1, 2, 3, 4, 5, 6]
 * parts_sums(ls) -> [21, 20, 18, 15, 11, 6, 0]
 * <p>
 * ls = [744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358]
 * parts_sums(ls) -> [10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0]
 * Notes
 * Some lists can be long.
 * Please ask before translating: some translations are already written and published when/if the kata is approved.
 *
 * @author Ross Khapilov
 * @version 1.0 11.07.2019
 */
public class SumParts {
    public static int[] sumParts(int[] ls) {
        int[] result = new int[ls.length + 1];
        int sum = 0;
        for (int i = ls.length - 1; i >= 0; i--) {
            sum += ls[i];
            result[i] = sum;
        }
        return result;
    }
}
