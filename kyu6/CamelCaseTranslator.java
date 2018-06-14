package exercises.codewars.kyu6;

/**
 * You wrote all your unit test names in camelCase. But some of your colleagues have troubles reading these long test names. So you make a compromise to switch to underscore separation.
 * <p>
 * To make these changes fast you wrote a class to translate a camelCase name into an underscore separated name.
 * <p>
 * Implement the ToUnderscore() method.
 * <p>
 * Example:
 * <p>
 * "ThisIsAUnitTest" => "This_Is_A_Unit_Test"
 * <p>
 * But of course there are always special cases...
 * <p>
 * You also have some calculation tests. Make sure the results don't get splitted by underscores.
 * <p>
 * Also Some people already used underscore names in their tests. Make sure you don't change them. But if they are not splitted correct you should adjust them.
 * <p>
 * Some of your colleagues mark their tests with a leading and trailing underscore. Make sure you don't remove this.
 * <p>
 * And of course you should handle empty strings to avoid unnecessary errors. Just return an empty string then.
 * <p>
 * Example:
 * <p>
 * "Calculate15Plus5Equals20" => "Calculate_15_Plus_5_Equals_20"
 * <p>
 * "This_Is_Already_Splitted_Correct" => "This_Is_Already_Splitted_Correct"
 * <p>
 * "ThisIs_Not_SplittedCorrect" => "This_Is_Not_Splitted_Correct"
 * <p>
 * "_UnderscoreMarked_Test_Name_" => _Underscore_Marked_Test_Name_"
 *
 * @author Ross Khapilov
 * @version 1.0 14.06.2018
 */
public class CamelCaseTranslator {
    public static String toUnderScore(String name) {
        String val = name.replaceAll("([A-Z]|([0-9]+))", "_$1").
                replaceAll("(__)", "_");
        return name.startsWith("_") ? val : val.substring(1);
    }

    public static void main(String[] args) {
        toUnderScore("123AddDdaAA");
    }
}
