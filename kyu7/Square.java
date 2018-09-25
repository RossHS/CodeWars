package exercises.codewars.kyu7;

/**
 * A square of squares
 * You like building blocks. You especially like building blocks that are squares. And what you even like more,
 * is to arrange them into a square of square building blocks!
 * <p>
 * However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle!
 * Those blasted things! If you just had a way to know, whether you're currently working in vain… Wait!
 * That's it! You just have to check if your number of building blocks is a perfect square.
 * <p>
 * Task
 * Given an integral number, determine if it's a square number:
 * <p>
 * In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words,
 * it is the product of some integer with itself.
 * <p>
 * The tests will always use some integral number, so don't worry about that in dynamic typed languages.
 * <p>
 * Examples
 * is_square (-1) # => false
 * is_square   0 # => true
 * is_square   3 # => false
 * is_square   4 # => true
 * is_square  25 # => true
 * is_square  26 # => false
 *
 * @author Ross Khapilov
 * @version 1.0 25.09.2018
 */
public class Square {
    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0; // fix me!
    }
}
