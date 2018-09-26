package exercises.codewars.kyu7;

/**
 * Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions"
 * for the development and functioning of living organisms.
 * <p>
 * If you want to know more http://en.wikipedia.org/wiki/DNA
 * <p>
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function
 * with one side of the DNA (string, except for Haskell); you need to get the other complementary side.
 * DNA strand is never empty or there is no DNA at all (again, except for Haskell).
 * <p>
 * More similar exercise are found here http://rosalind.info/problems/list-view/ (source)
 * <p>
 * DnaStrand.makeComplement("ATTGC") // return "TAACG"
 * <p>
 * DnaStrand.makeComplement("GTAT") // return "CATA"
 *
 * @author Ross Khapilov
 * @version 1.0 26.09.2018
 */
public class DnaStrand {
    public static String makeComplement(String dna) {
        char[] chars = dna.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = getComplement(chars[i]);
        }
        return new String(chars);
    }

    private static char getComplement(char c) {
        switch (c) {
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'C':
                return 'G';
            case 'G':
                return 'C';
        }
        return c;
    }
}
