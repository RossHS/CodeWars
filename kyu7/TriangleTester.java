package exercises.codewars.kyu7;

/**
 * @author Ross Khapilov
 * @version 1.0 18.04.2019
 */
public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && a + c > b;
    }
}
