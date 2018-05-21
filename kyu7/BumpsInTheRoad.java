package exercises.codewars.kyu7;

/**
 * Your car is old, it breaks easily. The shock absorbers are gone and you think it can handle about 15 more bumps
 * before it dies totally.
 *
 * Unfortunately for you, your drive is very bumpy! Given a string showing either flat road ("_") or bumps ("n"),
 * work out if you make it home safely. 15 bumps or under, return "Woohoo!", over 15 bumps return "Car Dead".
 * @author Ross Khapilov
 * @version 1.0 21.05.2018
 */
public class BumpsInTheRoad {
    public static String bumps(final String road) {
        int counter = 0;
        for (int i = 0; i < road.length() && counter < 15; i++) {
            if (road.charAt(i) == 'n') counter++;
        }
        return counter > 15 ? "Car Dead" : "Woohoo!";
    }
}
