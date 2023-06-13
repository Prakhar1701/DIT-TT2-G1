public class PermutateString {

    public static void main(String[] args) {

        String s = "PRAKHAR";

        int sL = s.length();

        permutate(s, sL, "");

        System.out.println();
    }

    static void permutate(String gS, int gSL, String rS) {

        if (rS.length() == gSL) {

            System.out.print(rS + " ");

        } else {

            for (int i = 0; i < gS.length(); i++) {

                String s = "";

                for (int j = 0; j < gS.length(); j++) {

                    if (j != i) {
                        s = s + gS.charAt(j);
                    }

                }

                permutate(s, gSL, rS + gS.charAt(i));

            }

        }

    }
}