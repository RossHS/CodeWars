package exercises.codewars.kyu8;

/**
 * @author Ross Khapilov
 * @version 1.0 02.05.2019
 */
public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean arrayOfSheep : arrayOfSheeps) {
            if (arrayOfSheep!= null && arrayOfSheep) counter++;
        }
        return counter;
    }
}
