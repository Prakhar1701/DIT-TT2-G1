public class MazePathProblem {

    public static void main(String[] args) {

        int goalRowPosition = 5;
        int goalColoumPosition = 5;

        System.out.println("Options: Down(D), Right(R)");

        possiblePathsMovingDR(1, 1, goalRowPosition, goalColoumPosition, "");

        System.out.println("\n");

        System.out.println("Options: Down(D), Right(R), Diagonal(B)");

        possiblePathsMovingDRB(1, 1, goalRowPosition, goalColoumPosition, "");

        System.out.println();

    }

    static void possiblePathsMovingDR(int i, int j, int gr, int gc, String path) {

        if (i < 1 || j < 1 || i > gr || j > gc) {

            return;

        } else {

            if (i == gr && j == gc) {

                System.out.print(path + " ");

            } else {

                possiblePathsMovingDR(i + 1, j, gr, gc, path + "D"); // Down

                possiblePathsMovingDR(i, j + 1, gr, gc, path + "R"); // Right

            }

        }

    }

    static void possiblePathsMovingDRB(int i, int j, int gr, int gc, String path) {

        if (i < 1 || j < 1 || i > gr || j > gc) {

            return;

        } else {

            if (i == gr && j == gc) {

                System.out.print(path + " ");

            } else {

                possiblePathsMovingDRB(i + 1, j, gr, gc, path + "D"); // Down

                possiblePathsMovingDRB(i, j + 1, gr, gc, path + "R"); // Right

                possiblePathsMovingDRB(i + 1, j + 1, gr, gc, path + "B"); // Both(Diagonal) = Down + Right

            }

        }

    }

}