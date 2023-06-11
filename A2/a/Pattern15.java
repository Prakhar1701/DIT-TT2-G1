public class Pattern15 {

    public static void main(String[] args) {

        int rows = 10;

        printInvertedPyramidStarPattern(rows, (rows * 2) - 1, 0, true); // Fixed
    }

    static void printInvertedPyramidStarPattern(int rows, int stars, int spaces, Boolean newLine) {

        if (!(rows > 0)) {
            return;
        }

        if (spaces > 0) {
            System.out.print(" " + " ");
            printInvertedPyramidStarPattern(1, 0, spaces - 1, false);
        }

        if (stars > 0) {
            System.out.print("*" + " ");
            printInvertedPyramidStarPattern(1, stars - 1, 0, false);
        }

        if (newLine) {
            System.out.println();
        }

        printInvertedPyramidStarPattern(rows - 1, stars - 2, spaces + 1, newLine);
    }
}
