public class Pattern4 {
    public static void main(String[] args) {

        int rows = 10;

        printInvertedHalfPyramidPattern(rows, rows); // Fixed
    }

    static void printInvertedHalfPyramidPattern(int rows, int stars) {

        if (!(rows > 0)) {
            return;
        }

        if (stars > 0) {
            System.out.print("*" + " ");
            printInvertedHalfPyramidPattern(rows, stars - 1);
        } else {
            System.out.println();
            printInvertedHalfPyramidPattern(rows - 1, rows - 1);
        }
    }
}
