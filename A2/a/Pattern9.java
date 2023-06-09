public class Pattern9 {
    public static void main(String[] args) {

        int rows = 11; // Enter odd value only

        printFullPyramidPattern(rows, 1, rows / 2, true, true); // Fixed
    }

    static void printFullPyramidPattern(int rows, int stars, int spaces, Boolean newLine, Boolean s) {

        if (!(rows > 0)) {
            return;
        }

        if (spaces > 0) {
            System.out.print(" " + " ");
            printFullPyramidPattern(1, 0, spaces - 1, false, s);
        }

        if (stars > 0) {
            System.out.print("*" + " ");
            printFullPyramidPattern(1, stars - 1, 0, false, s);
        }

        if (newLine) {
            System.out.println();
        }

        if (stars == (rows - 1) * 2 + 1) {
            s = false;
        }

        if (s) {
            printFullPyramidPattern(rows - 1, stars + 2, spaces - 1, true, true);
        } else {
            printFullPyramidPattern(rows - 1, stars - 2, spaces + 1, true, false);
        }

    }
}
