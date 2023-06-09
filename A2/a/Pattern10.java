public class Pattern10 {

    public static void main(String[] args) {

        int rows = 10;

        printDiagonalLinePattern(rows, rows - 1, true); // Fixed
    }

    static void printDiagonalLinePattern(int rows, int spaces, Boolean newLineWithStar) {

        if (!(rows > 0)) {
            return;
        }

        if (spaces > 0) {
            System.out.print(" " + " ");
            printDiagonalLinePattern(1, spaces - 1, false);
        }

        if (newLineWithStar) {
            System.out.println("*");
        }

        printDiagonalLinePattern(rows - 1, spaces - 1, true);

    }
}
