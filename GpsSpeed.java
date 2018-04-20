package exercises.codewars;

import java.util.stream.IntStream;

/**
 * @author Ross Khapilov
 * @version 1.0 created on 18.01.2018
 */
public class GpsSpeed {
    public static int gps(int s, double[] x) {
        double maxSpeed = IntStream
                .range(0, x.length - 1)
                .mapToDouble(i -> (x[i + 1] - x[i]) * 3600.0 / (double) s)
                .max().orElse(0.0);
        return (int) Math.floor(maxSpeed);
    }

    public static void main(String[] args) {
        System.out.println(gps(15, new double[]{0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25}));
    }
}
