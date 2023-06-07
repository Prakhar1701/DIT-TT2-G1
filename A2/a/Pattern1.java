public class Pattern1 {
    // Star Square Pattern
    public static void main(String[] args) {

        printStarSquarePattern(10, 10); // rows==stars
    }

    static void printStarSquarePattern(int rows, int stars) {

        if (!(rows > 0)) {
            return;
        }

        if (stars > 0) {
            System.out.print("*" + " ");
            printStarSquarePattern(1, stars - 1);
        } else {
            System.out.println();
        }

        printStarSquarePattern(rows - 1, stars);

    }
}