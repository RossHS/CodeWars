package exercises.codewars.kyu6;

/**
 * The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line.
 * Each of them has a single 100, 50 or 25 dollars bill. An "Avengers" ticket costs 25 dollars.
 * <p>
 * Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.
 * <p>
 * Can Vasya sell a ticket to each person and give the change if he initially has no money and sells the tickets
 * strictly in the order people follow in the line?
 * <p>
 * Return YES, if Vasya can sell a ticket to each person and give the change with the bills he has at hand at that
 * moment. Otherwise return NO.
 * <p>
 * Examples:
 * Line.Tickets(new int[] {25, 25, 50}) // => YES
 * Line.Tickets(new int[]{25, 100}) // => NO. Vasya will not have enough money to give change to 100 dollars
 * Line.Tickets(new int[] {25, 25, 50, 50, 100}) // => NO. Vasya will not have the right bills to give 75
 *
 * @author Ross Khapilov
 * @version 1.0 25.01.2019
 */
public class VasyaClerk {
    public static String Tickets(int[] peopleInLine) {
        int[] cashbox = new int[3];
        for (int p : peopleInLine) {
            switch (p) {
                case 25:
                    cashbox[0]++;
                    break;
                case 50:
                    if (cashbox[0] > 0) {
                        cashbox[0]--;
                        cashbox[1]++;
                    } else return "NO";
                    break;
                case 100:
                    if (cashbox[0] > 0 && cashbox[1] > 0) {
                        cashbox[2]++;
                        cashbox[0]--;
                        cashbox[1]--;
                    } else if (cashbox[0] > 2) {
                        cashbox[2]++;
                        cashbox[0] -= 3;
                    } else return "NO";
                    break;
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(Tickets(new int[]{25, 25, 50, 50, 100}));
    }
}
