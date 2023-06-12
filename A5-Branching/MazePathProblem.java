import java.util.ArrayList;

public class MazePathProblem {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        int goalRowPosition = 5;
        int goalColoumPosition = 5;

        possiblePaths(1, 1, goalRowPosition, goalColoumPosition, "", list);

        System.out.println(list);

    }

    static void possiblePaths(int i, int j, int gr, int gc, String path, ArrayList<String> paths) {

        if (i < 1 || j < 1 || i > gr || j > gc) {

            return;

        } else {

            if (i == gr && j == gc) {

                paths.add(path);

            } else {

                possiblePaths(i + 1, j, gr, gc, path + "D", paths); // Down

                possiblePaths(i, j + 1, gr, gc, path + "R", paths); // Right

            }
            
        }

    }
}