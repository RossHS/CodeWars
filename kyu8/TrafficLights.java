package exercises.codewars.kyu8;

/**
 * You're writing code to control your town's traffic lights. You need a function to handle each change from green,
 * to yellow, to red, and then to green again.
 * <p>
 * Complete the function that takes a string as an argument representing the current state of the light and returns a
 * string representing the state the light should change to.
 * <p>
 * For example, update_light('green') should return 'yellow'.
 *
 * @author Ross Khapilov
 * @version 1.0 created on 02.05.2018
 */
public class TrafficLights {
    public static String updateLight(String current) {
        switch (current) {
            case "green":
                return "yellow";
            case "yellow":
                return "red";
            case "red":
                return "green";
            default:
                return "";
        }
    }
}
