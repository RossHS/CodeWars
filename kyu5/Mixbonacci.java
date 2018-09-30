package exercises.codewars.kyu5;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;

import static java.math.BigInteger.valueOf;
import static java.util.Arrays.asList;

/**
 * his is the first of my "-nacci" series. If you like this kata, check out the zozonacci sequence too.
 * <p>
 * Task
 * Mix -nacci sequences using a given pattern p.
 * Return the first n elements of the mixed sequence.
 * Rules
 * The pattern p is given as a list of strings
 * (or array of symbols in Ruby) using the pattern mapping below
 * (e. g. ['fib', 'pad', 'pel'] means take the next fibonacci, then the next padovan,
 * then the next pell number and so on).
 * <p>
 * When n is 0 or p is empty return an empty list.
 * If the length of p is more than n repeat the pattern.
 * Examples
 * 0  1  2  3  4
 * ----------+------------------
 * fibonacci:| 0, 1, 1, 2, 3 ...
 * padovan:  | 1, 0, 0, 1, 0 ...
 * pell:     | 0, 1, 2, 5, 12 ...
 * <p>
 * pattern = ['fib', 'pad', 'pel']
 * n = 6
 * #          ['fib',        'pad',      'pel',   'fib',        'pad',      'pel']
 * # result = [fibonacci(0), padovan(0), pell(0), fibonacci(1), padovan(1), pell(1)]
 * result = [0, 1, 0, 1, 0, 1]
 * <p>
 * pattern = ['fib', 'fib', 'pel']
 * n = 6
 * #          ['fib', 'fib', 'pel', 'fib', 'fib', 'pel']
 * # result = [fibonacci(0), fibonacci(1), pell(0), fibonacci(2), fibonacci(3), pell(1)]
 * result = [0, 1, 0, 1, 2, 1]
 * Sequences
 * fibonacci : 0, 1, 1, 2, 3 ...
 * padovan: 1, 0, 0, 1, 0 ...
 * jacobsthal: 0, 1, 1, 3, 5 ...
 * pell: 0, 1, 2, 5, 12 ...
 * tribonacci: 0, 0, 1, 1, 2 ...
 * tetranacci: 0, 0, 0, 1, 1 ...
 * Pattern mapping
 * 'fib' -> fibonacci
 * 'pad' -> padovan
 * 'jac' -> jacobstahl
 * 'pel' -> pell
 * 'tri' -> tribonacci
 * 'tet' -> tetranacci
 * If you like this kata, check out the zozonacci sequence.
 *
 * @author Ross Khapilov
 * @version 1.0 29.09.2018
 */
public class Mixbonacci {

    private final LinkedList<BigInteger> fib = new LinkedList<>(asList(valueOf(0), valueOf(1), valueOf(1), valueOf(2)));
    private final LinkedList<BigInteger> pad = new LinkedList<>(asList(valueOf(1), valueOf(0), valueOf(0), valueOf(1)));
    private final LinkedList<BigInteger> jac = new LinkedList<>(asList(valueOf(0), valueOf(1), valueOf(1), valueOf(3)));
    private final LinkedList<BigInteger> pel = new LinkedList<>(asList(valueOf(0), valueOf(1), valueOf(2), valueOf(5)));
    private final LinkedList<BigInteger> tri = new LinkedList<>(asList(valueOf(0), valueOf(0), valueOf(1), valueOf(1)));
    private final LinkedList<BigInteger> tet = new LinkedList<>(asList(valueOf(0), valueOf(0), valueOf(0), valueOf(1), valueOf(1)));


    public static BigInteger[] mixbonacci(String[] pattern, int length) {
        if (pattern == null || length <= 0) return new BigInteger[]{};
        Mixbonacci mix = new Mixbonacci();
        BigInteger[] integers = new BigInteger[length];
        for (int i = 0, j = 0; i < length; i++, j++) {
            if (j == pattern.length) j = 0;
            switch (pattern[j]) {
                case "fib":
                    if (mix.fib.size() < 3) mix.fib.add(mix.fib.get(0).add(mix.fib.get(1)));
                    integers[i] = mix.fib.remove();
                    break;
                case "pad":
                    if (mix.pad.size() < 4) mix.pad.add(mix.pad.get(0).add(mix.pad.get(1)));
                    integers[i] = mix.pad.remove();
                    break;
                case "jac":
                    if (mix.jac.size() < 3) mix.jac.add(mix.jac.get(0).multiply(valueOf(2)).add(mix.jac.get(1)));
                    integers[i] = mix.jac.remove();
                    break;
                case "pel":
                    if (mix.pel.size() < 3) mix.pel.add(mix.pel.get(1).multiply(valueOf(2)).add(mix.pel.get(0)));
                    integers[i] = mix.pel.remove();
                    break;
                case "tri":
                    if (mix.tri.size() < 4) mix.tri.add(mix.tri.get(0).add(mix.tri.get(1)).add(mix.tri.get(2)));
                    integers[i] = mix.tri.remove();
                    break;
                case "tet":
                    if (mix.tet.size() < 5)
                        mix.tet.add(mix.tet.get(0).add(mix.tet.get(1)).add(mix.tet.get(2)).add(mix.tet.get(3)));
                    integers[i] = mix.tet.remove();
                    break;
            }
        }
        return integers;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mixbonacci(new String[]{"fib", "pad", "pel"}, 6)));
        System.out.println(Arrays.toString(mixbonacci(new String[]{"fib", "fib", "pel"}, 6)));

        System.out.println(Arrays.toString(mixbonacci(new String[]{"fib"}, 30)));
        System.out.println(Arrays.toString(mixbonacci(new String[]{"pad"}, 30)));
        System.out.println(Arrays.toString(mixbonacci(new String[]{"jac"}, 30)));
        System.out.println(Arrays.toString(mixbonacci(new String[]{"pel"}, 30)));
        System.out.println(Arrays.toString(mixbonacci(new String[]{"tri"}, 30)));
        System.out.println(Arrays.toString(mixbonacci(new String[]{"tet"}, 30)));
    }
}
