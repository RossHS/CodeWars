package exercises.codewars.kyu6;

/**
 * Your task is to construct a building which will be a pile of n cubes. The cube at the bottom will have a volume
 * of n^3, the cube above will have volume of (n-1)^3 and so on until the top which will have a volume of 1^3.
 * <p>
 * You are given the total volume m of the building. Being given m can you find the number n of cubes you will have to build?
 * <p>
 * The parameter of the function findNb (find_nb, find-nb, findNb) will be an integer m and you have to return the
 * integer n such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n.
 * <p>
 * Examples:
 * findNb(1071225) --> 45
 * findNb(91716553919377) --> -1
 * mov rdi, 1071225
 * call find_nb            ; rax <-- 45
 * <p>
 * mov rdi, 91716553919377
 * call find_nb            ; rax <-- -1
 *
 * @author Ross Khapilov
 * @version 1.0 05.05.2019
 */
public class ASum {
    public static long findNb(long m) {
        long res = 0;
        for (long i = 0; res < m; i++) {
            res += (long) Math.pow(i, 3);
            if (res == m) return i;
        }
        return -1;
    }
}
