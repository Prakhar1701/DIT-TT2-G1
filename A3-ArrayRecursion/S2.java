/* Q2: Write recursive function that takes an array of words and returns an array containing all words capitalized
 i/p : ["foo", "bar", "world"]
 o/p : ["FOO", "BAR", "WORLD"] */

import java.util.ArrayList;

public class S2 {

    public static void main(String[] args) {

        String[] words = { "prakhar", "bar", "world", "pen", "car" };

        ArrayList<String> capitalizedWordsList = capitalizeWords(words, 0);

        System.out.println(capitalizedWordsList);
    }

    static ArrayList<String> capitalizeWords(String[] words, int index) {

        ArrayList<String> list = new ArrayList<>();

        if (index > words.length - 1) {
            return list;
        }

        String capitalizedWord = words[index].toUpperCase();

        list.add(capitalizedWord);

        list.addAll(capitalizeWords(words, index + 1));

        return list;
    }
}
