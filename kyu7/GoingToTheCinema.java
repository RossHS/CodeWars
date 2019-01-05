package exercises.codewars.kyu7;

/**
 * My friend John likes to go to the cinema. He can choose between system A and system B.
 * <p>
 * System A : buy a ticket (15 dollars) every time
 * System B : buy a card (500 dollars) and every time
 * buy a ticket the price of which is 0.90 times the price he paid for the previous one.
 * #Example: If John goes to the cinema 3 times:
 * <p>
 * System A : 15 * 3 = 45
 * System B : 500 + 15 * 0.90 + (15 * 0.90) * 0.90 + (15 * 0.90 * 0.90) * 0.90 ( = 536.5849999999999, no rounding for each ticket)
 * John wants to know how many times he must go to the cinema so that the final result of System B, when rounded up to the next dollar, will be cheaper than System A.
 * <p>
 * The function movie has 3 parameters: card (price of the card), ticket (normal price of a ticket), perc (fraction of what he paid for the previous ticket) and returns the first n such that
 * <p>
 * ceil(price of System B) < price of System A.
 * More examples:
 * <p>
 * movie(500, 15, 0.9) should return 43
 * (with card the total price is 634, with tickets 645)
 * movie(100, 10, 0.95) should return 24
 * (with card the total price is 235, with tickets 240)
 *
 * @author Ross Khapilov
 * @version 1.0 05.01.2019
 */
public class GoingToTheCinema {
    public static int movie(int card, int ticket, double perc) {
        // your code
        double systemACounter = 0;
        double systemBCounter = card;
        int counter = 0;
        while (systemACounter < systemBCounter) {
            systemACounter += ticket;
            counter++;
            systemBCounter += ticket * Math.pow(perc, counter);
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(movie(500, 15, 0.9)); //43
        System.out.println(movie(100, 10, 0.95)); //24
    }

}
