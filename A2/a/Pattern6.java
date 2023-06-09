public class Pattern6 {

    public static void main(String[] args) {

        int rows = 10;

        printMirrorInvertedHalfPyramidPattern(rows, rows, 0, true); // Fixed
    }

    static void printMirrorInvertedHalfPyramidPattern(int rows, int stars, int spaces, Boolean newLine) {

        if (!(rows > 0)) {
            return;
        }

        if (spaces > 0) {
            System.out.print(" " + " ");
            printMirrorInvertedHalfPyramidPattern(1, 0, spaces - 1, false);
        }
        if (stars > 0) {
            System.out.print("*" + " ");
            printMirrorInvertedHalfPyramidPattern(1, stars - 1, 0, false);
        }

        if (newLine) {
            System.out.println();
        }

        printMirrorInvertedHalfPyramidPattern(rows - 1, stars - 1, spaces + 1, true);

    }

}
