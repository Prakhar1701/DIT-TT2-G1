public class Pattern5 {
    public static void main(String[] args) {

        int rows = 10;

        printMirrorLeftPyramidPattern(rows, 1, rows - 1); // Fixed
    }

    static void printMirrorLeftPyramidPattern(int rows, int stars, int spaces) {

        if (!(rows > 0)) {
            return;
        }

        if (spaces > 0) {
            System.out.print(" " + " ");
            printMirrorLeftPyramidPattern(1, 0, spaces - 1);
        }

        if (stars > 0) {
            System.out.print("*" + " ");
            printMirrorLeftPyramidPattern(1, stars - 1, 0);
        }

        if (stars + spaces == rows && spaces != 1) {
            System.out.println();
        }

        printMirrorLeftPyramidPattern(rows - 1, stars + 1, spaces - 1);

    }
}
