package exercises.codewars.kyu5;

/**
 * ##########
 * ##      ##
 * # #    # #
 * #  #  #  #
 * #   ##   #
 * #   ##   #
 * #  #  #  #
 * # #    # #
 * ##      ##
 * ##########
 *
 * @author Ross Khapilov
 * @version 1.0 25.04.2019
 */
public class Squad {
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("#");
        }
        System.out.println();
        for (int i = 0; i < size - 2; i++) {
            System.out.print("#");
            for (int j = 0; j < size - 2; j++) {
                if (j == i || (j + i) == size - 3)
                    System.out.print("#");
                else System.out.print(" ");
            }
            System.out.println("#");
        }
        for (int i = 0; i < size; i++) {
            System.out.print("#");
        }
        System.out.println();
    }
}
