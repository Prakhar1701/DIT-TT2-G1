public class Pattern14 {

    public static void main(String[] args) {

        int rows = 10;

        printNumberCharPattern(rows, 1, 2, 1); // Fixed
    }

    static void printNumberCharPattern(int rows, int stars, int next, int i) {

        if (!(rows > 0)) {
            return;
        }

        if (stars > 0) {
            System.out.print(i + " ");
            printNumberCharPattern(rows, stars - 1, next, i + 1);
        } else {
            System.out.println();
            printNumberCharPattern(rows - 1, next, next + 1, i);
        }

    }
}
