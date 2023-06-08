public class Pattern3 {
    public static void main(String[] args) {
        
        int rows = 5;

        printLeftPyramidPattern(rows, 1, 2); // Fixed
    }

    static void printLeftPyramidPattern(int rows, int stars, int next) {

        if (!(rows > 0)) {
            return;
        }

        if (stars > 0) {
            System.out.print("*" + " ");
            printLeftPyramidPattern(rows, stars - 1, next);
        } else {
            System.out.println();
            printLeftPyramidPattern(rows - 1, next, next + 1);
        }

    }
}
