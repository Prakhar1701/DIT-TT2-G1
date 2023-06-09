public class Pattern7 {
    public static void main(String[] args) {

        int rows = 10;

        printPyramidPattern(rows, 1, rows - 1, true); // Fixed
    }

    static void printPyramidPattern(int rows, int stars, int spaces, Boolean newLine) {

        if (!(rows > 0)) {
            return;
        }

        if (spaces > 0) {
            System.out.print(" ");
            printPyramidPattern(1, 0, spaces - 1, false);
        }

        if (stars > 0) {
            System.out.print("*" + " ");
            printPyramidPattern(1, stars - 1, 0, false);
        }

        if (newLine) {
            System.out.println();
        }

        printPyramidPattern(rows - 1, stars + 1, spaces - 1, true);

    }
}
