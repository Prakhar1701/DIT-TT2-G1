public class Pattern12 {

    public static void main(String[] args) {

        int rows = 11; // Enter odd value only

        printRightPascalPattern(rows, 1, true); // Fixed
    }

    static void printRightPascalPattern(int rows, int stars, Boolean s) {

        if (!(rows > 0)) {
            return;
        }

        if (stars > 0) {
            System.out.print("*" + " ");
            printRightPascalPattern(1, stars - 1, false);
        } else {
            System.out.println();
        }

        if (rows == stars) {
            s = false;
        }

        if (s)
            printRightPascalPattern(rows - 1, stars + 1, true);
        else
            printRightPascalPattern(rows - 1, stars - 1, false);

    }
}
