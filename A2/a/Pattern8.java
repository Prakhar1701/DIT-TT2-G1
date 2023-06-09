public class Pattern8 {

    public static void main(String[] args) {

        int rows = 10;

        printOddStarPyramidPattern(rows, 1, rows - 1, true); // Fixed
    }

    static void printOddStarPyramidPattern(int rows, int stars, int spaces, Boolean newLine) {

        if (!(rows > 0)) {
            return;
        }

        if (spaces > 0) {
            System.out.print(" " + " ");
            printOddStarPyramidPattern(1, 0, spaces - 1, false);
        }

        if (stars > 0) {
            System.out.print("*" + " ");
            printOddStarPyramidPattern(1, stars - 1, 0, false);
        }

        if (newLine) {
            System.out.println();
        }

        printOddStarPyramidPattern(rows - 1, stars + 2, spaces - 1, true);

    }
}
