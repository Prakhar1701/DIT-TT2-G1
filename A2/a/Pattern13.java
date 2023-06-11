public class Pattern13 {

    public static void main(String[] args) {

        int rows = 11; // Enter odd value only

        printLeftPascalPattern(rows, 1, rows / 2, true, true); // Fixed
    }

    static void printLeftPascalPattern(int rows, int stars, int spaces, Boolean newLine, Boolean s) {

        if (!(rows > 0)) {
            return;
        }

        if (spaces > 0) {
            System.out.print(" " + " ");
            printLeftPascalPattern(1, 0, spaces - 1, false, false);
        }

        if (stars > 0) {
            System.out.print("*" + " ");
            printLeftPascalPattern(1, stars - 1, 0, false, false);
        }

        if (newLine) {
            System.out.println();
        }

        if (rows == stars) {
            s = false;
        }

        if (s)
            printLeftPascalPattern(rows - 1, stars + 1, spaces - 1, true, true);
        else
            printLeftPascalPattern(rows - 1, stars - 1, spaces + 1, true, false);
    }
}
