package exercises.codewars.kyu7;

/**
 * Have you heard about the myth that if you fold a paper enough times, you can reach the moon with it? Sure you do,
 * but exactly how many? Maybe it's time to write a program to figure it out.
 * <p>
 * You know that a piece of paper has a thickness of 0.0001m. Given distance in units of meters, calculate how many
 * times you have to fold the paper to make the paper reach this distance.
 * (If you're not familiar with the concept of folding a paper: Each fold doubles its total thickness.)
 * <p>
 * Note: Of course you can't do half a fold. You should know what this means ;P
 * <p>
 * Also, if somebody is giving you a non-positive distance, it's clearly bogus and you should yell at them by returning
 * null (or whatever equivalent in your language. In Shell please return None).
 *
 * @author Ross Khapilov
 * @version 1.0 created on 13.05.2018
 */
public class PaperFolder {
    public static Long fold(double d) {
        return d < 0 ? null : d <= 0.0001 ? 0 : 1 + fold(d / 2);
    }
}
