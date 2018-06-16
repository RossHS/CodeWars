package exercises.codewars.kyu4;

import java.math.BigInteger;

/**
 * In mathematics, the factorial of integer n is written as n!. It is equal to the product of n and every integer
 * preceding it. For example: 5! = 1 x 2 x 3 x 4 x 5 = 120
 * <p>
 * Your mission is simple: write a function that takes an integer n and returns the value of n!.
 * <p>
 * You are guaranteed an integer argument. For any values outside the non-negative range, return null, nil or None
 * (return an empty string "" in C and C++). For non-negative numbers a full length number is expected for example,
 * return 25! = "15511210043330985984000000" as a string.
 *
 * @author Ross Khapilov
 * @version 1.0 16.06.2018
 */
public class LargeFactorial {

    public static String Factorial(int n) {
        BigInteger num = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            num = num.multiply(new BigInteger(String.valueOf(i)));
        }
        return num.toString();
    }
    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }
}
