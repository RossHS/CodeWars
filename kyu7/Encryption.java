package exercises.codewars.kyu7;

/**
 * For building the encrypted string:
 * Take every 2nd char from the string, then the other chars, that are not every 2nd char, and concat them as new String.
 * Do this n times!
 * <p>
 * Examples:
 * <p>
 * "This is a test!", 1 -> "hsi  etTi sats!"
 * "This is a test!", 2 -> "hsi  etTi sats!" -> "s eT ashi tist!"
 * Write two methods:
 * <p>
 * String encrypt(final String text, final int n)
 * String decrypt(final String encryptedText, final int n)
 * For both methods:
 * If the input-string is null or empty return exactly this value!
 * If n is <= 0 then return the input text.
 *
 * @author Ross Khapilov
 * @version 1.0 15.06.2018
 */
public class Encryption {
    public static String encrypt(final String text, final int n) {
        String str = text;
        for (int i = 0; i < n; i++) {
            StringBuilder a = new StringBuilder();
            StringBuilder b = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                if (j % 2 == 0) a.append(str.charAt(j));
                else b.append(str.charAt(j));
            }
            str = b.toString() + a.toString();
        }
        return str;
    }

    public static String decrypt(final String encryptedText, final int n) {
        String str = encryptedText;
        for (int i = 0; i < n; i++) {
            String a = str.substring(0, str.length() / 2);
            String b = str.substring(str.length() / 2);
            StringBuilder var = new StringBuilder();
            for (int j = 0; j < b.length(); j++) {
                var.append(b.charAt(j));
                if (j < a.length()) var.append(a.charAt(j));
            }
            str = var.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(encrypt("This is a test!", 1));
//        System.out.println(decrypt("s eT ashi tist!", 2));

        System.out.println(decrypt("This is a test!", 0));
        System.out.println(decrypt("hsi  etTi sats!", 1));
        System.out.println(decrypt("s eT ashi tist!", 2));
        System.out.println(decrypt(" Tah itse sits!", 3));
        System.out.println(decrypt("This is a test!", 4));
        System.out.println(decrypt("This is a test!", -1));

    }
}
