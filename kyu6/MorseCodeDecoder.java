package exercises.codewars.kyu6;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ross Khapilov
 * @version 1.0 05.07.2018
 */
public class MorseCodeDecoder {
    final static private Map<String, String> morseCodeMap = new HashMap<>();

    static {
        morseCodeMap.put(".-", "A");
        morseCodeMap.put("-...", "B");
        morseCodeMap.put("-.-.", "C");
        morseCodeMap.put("-..", "D");
        morseCodeMap.put(".", "E");
        morseCodeMap.put("..-.", "F");
        morseCodeMap.put("--.", "G");
        morseCodeMap.put("....", "H");
        morseCodeMap.put("..", "I");
        morseCodeMap.put(".---", "J");
        morseCodeMap.put("-.-", "K");
        morseCodeMap.put(".-..", "L");
        morseCodeMap.put("--", "M");
        morseCodeMap.put("-.", "N");
        morseCodeMap.put("---", "O");
        morseCodeMap.put(".--.", "P");
        morseCodeMap.put("--.-", "Q");
        morseCodeMap.put(".-.", "R");
        morseCodeMap.put("...", "S");
        morseCodeMap.put("-", "T");
        morseCodeMap.put("..-", "U");
        morseCodeMap.put("...-", "V");
        morseCodeMap.put(".--", "W");
        morseCodeMap.put("-..-", "X");
        morseCodeMap.put("-.--", "Y");
        morseCodeMap.put("--..", "Z");
        //-----------------------
        morseCodeMap.put(".----", "1");
        morseCodeMap.put("..---", "2");
        morseCodeMap.put("...--", "3");
        morseCodeMap.put("....-", "4");
        morseCodeMap.put(".....", "5");
        morseCodeMap.put("-....", "6");
        morseCodeMap.put("--...", "7");
        morseCodeMap.put("---..", "8");
        morseCodeMap.put("----.", "9");
        morseCodeMap.put("-----", "0");
        //-----------------------
        morseCodeMap.put(".-.-.-", ".");
        morseCodeMap.put("--..--", ",");
        morseCodeMap.put("...---...","SOS");
        morseCodeMap.put("-.-.--","!");
    }

    public static String decode(String morseCode) {
        String[] morseArr = morseCode.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < morseArr.length; i++) {
            if (morseCodeMap.containsKey(morseArr[i]))
                sb.append(morseCodeMap.get(morseArr[i]));
            if(morseArr[i].equals("") && morseArr[i+1].equals(""))
                sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(decode("... --- ..."));
    }
}
