public class Pattern18 {

    public static void main(String[] args) {

        int rows = 11;

        printLeftArrowStarPattern(rows, rows / 2, true, true); // Fixed
    }

    static void printLeftArrowStarPattern(int rows, int spaces, Boolean newLine, Boolean s) {

        if (!(rows > 0)) {
            return;
        }

        if (spaces > 0) {
            System.out.print(" ");
            printLeftArrowStarPattern(1, spaces - 1, false, false);
        }

        System.out.print("*");

        if (newLine) {
            System.out.println();
        }

        if (spaces == 0 && s) {
            s = false;
        }

        if (s) {
            printLeftArrowStarPattern(rows - 1, spaces - 1, true, s);
        } else {
            printLeftArrowStarPattern(rows - 1, spaces + 1, true, s);
        }

    }
}
