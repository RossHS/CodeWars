package exercises.codewars.kyu8;

/**
 * Your task is to create a function that does four basic mathematical operations.
 * <p>
 * The function should take three arguments - operation(string/char), value1(number), value2(number).
 * The function should return result of numbers after applying the chosen operation.
 * <p>
 * Examples:
 * <p>
 * basicOp('+', 4, 7)         // Output: 11
 * basicOp('-', 15, 18)       // Output: -3
 * basicOp('*', 5, 5)         // Output: 25
 * basicOp('/', 49, 7)        // Output: 7
 *
 * @author Ross Khapilov
 * @version 1.0 07.10.2018
 */
public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                return v1 / v2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(basicMath("-", 1, 23));
    }
}
