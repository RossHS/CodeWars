package exercises.codewars.kyu7;

/**
 * John wants to decorate a room with wallpaper. He has been said that making sure he has the right amount of wallpaper
 * is more complex than it sounds. He wants a fool-proof method to getting it right.
 * <p>
 * John knows that the rectangular room has a length of l meters, a width of w meters, a height of h meters.
 * The standard width of the rolls he wants to buy is 52 centimeters. The length of a roll is 10 meters. He bears in
 * mind however, that it’s best to have an extra length of wallpaper handy in case of mistakes or miscalculations so
 * he wants to buy a length 15% greater than the one he needs.
 * <p>
 * Last time he did these calculations he caught a headache so could you help John? Your function wallpaper(l, w, h)
 * should return as a plain English word in lower case the number of rolls he must buy.
 * <p>
 * #Example: wallpaper(4, 3.5, 3) should return "ten"
 * <p>
 * #Notes:
 * <p>
 * all rolls (even with incomplete width) are put edge to edge
 * 0 <= l, w, h (floating numbers), it can happens that w x h x l is zero
 * the integer r (number of rolls) will always be less or equal to 20
 *
 * @author Ross Khapilov
 * @version 1.0 created on 11.05.2018
 */
public class EasyWallpaper {
    public String wallpaper(double l, double w, double h) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        if (l * w * h == 0) return words[0];
        double res = (2 * (l + w) / 0.52) / (10 / (h * 1.15));
        return words[(int) Math.ceil(res)];
    }

    public static void main(String[] args) {
        new EasyWallpaper().wallpaper(4, 3.5, 3);
    }
}
