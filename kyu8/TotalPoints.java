package exercises.codewars.kyu8;

/**
 * Our football team finished the championship. The result of each match look like "x:y". Results of all matches are recorded in the collection.
 * <p>
 * For example: ["3:1", "2:2", "0:1", ...]
 * <p>
 * Write a function that takes such collection and counts the points of our team in the championship. Rules for counting points for each match:
 * <p>
 * if x>y - 3 points
 * if x<y - 0 point
 * if x=y - 1 point
 * Notes:
 * <p>
 * there are 10 matches in the championship
 * 0 <= x <= 4
 * 0 <= y <= 4
 *
 * @author Ross Khapilov
 * @version 1.0 03.03.2019
 */
public class TotalPoints {
    public static int points(String[] games) {
        //implement me
        int points = 0;
        for (String s : games) {
            String[] score = s.split(":");
            int x = Integer.parseInt(score[0]);
            int y = Integer.parseInt(score[1]);
            if (x > y)
                points += 3;
            else if (x == y)
                points++;
        }
        return points;
    }

    public static void main(String[] args) {

    }
}
