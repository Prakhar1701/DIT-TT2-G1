/*
Q12: Given a String find the adjacent element if it is same as the previous element, replace the element with #.
e.g.-:
input: "aabbcc" 
output: "a#b#c#"
 */

public class S12 {

    public static void main(String[] args) {

        String inputString = "abbbacdbbbdddde";

        String outputString = outputString(inputString, 0); // Fixed

        System.out.println("Output String is: " + outputString);
    }

    static String outputString(String inputString, int i) {

        if (inputString == null)
            return null;

        if ((i > inputString.length() - 2)) {

            if (inputString.length() < 2)
                return inputString;
            else if (inputString.charAt(i - 1) == inputString.charAt(i))
                return "";
            else
                return inputString.charAt(i) + "";

        }

        char temp1 = inputString.charAt(i);
        String temp2 = outputString(inputString, i + 1);

        if (temp1 == inputString.charAt(i + 1)) {
            if (temp2.length() > 1 && temp1 == temp2.charAt(0))
                return temp1 + "#" + temp2.substring(1);
            else
                return temp1 + "#" + temp2;
        }

        return temp1 + outputString(inputString, i + 1);
    }

}
