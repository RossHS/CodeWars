package exercises.codewars.kyu5;

/**
 * @author Ross Khapilov
 * @version 1.0 19.03.2019
 */
public class MaximumSubarraySum {
    public static int sequence(int[] arr) {
        int maxEndingHere = 0, maxSoFar = 0;
        for (int v : arr) {
            maxEndingHere = Math.max(0, maxEndingHere + v);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }


    public static int n3(int[] arr) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    max = Math.max(sum, max);
                    count++;
                }
            }
        }

        System.out.println("n^3 = " + Math.pow(arr.length, 3) + "; counter  = " + count);
        return max;
    }

    public static int n2(int[] arr) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
                count++;
            }
        }
        System.out.println("n^2 = " + Math.pow(arr.length, 2) + "; counter  = " + count);

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(sequence(arr));
        System.out.println(n3(arr));
        System.out.println(n2(arr));
    }
}
