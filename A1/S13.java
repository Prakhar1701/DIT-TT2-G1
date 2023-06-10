/* 
Q13: Given a String find the adjacent element if it is same as the previous element, add a star in between.

e.g.-:
input: "aabbcc"
output: "a*ab*bc*c" 
*/

public class S13 {

    public static void main(String[] args) {

        String inputString = "abcccdde";

        String outputString = outputString(inputString, 0, false);

        System.out.println("Output String is: " + outputString);
    }

    static String outputString(String inputString, int i, boolean s) {

        if (inputString == null)
            return null;

        if (i > inputString.length() - 2) {

            if (s) {

                if (inputString.charAt(i) != inputString.charAt(i - 1))
                    return inputString.charAt(i) + "";
                else
                    return "";

            } else {

                return inputString;

            }

        }

        char charAtI = inputString.charAt(i);

        if (charAtI == inputString.charAt(i + 1)) {

            String temp = outputString(inputString, i + 1, true);

            if (temp.length() > 0 && charAtI == temp.charAt(0)) {
                return charAtI + "*" + temp;
            } else {
                return charAtI + "*" + charAtI + temp;
            }

        } else {

            return charAtI + outputString(inputString, i + 1, s);

        }
    }
}
