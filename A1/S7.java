public class S7 {

    public static void main(String[] args) {

        String s1 = "prakhar";
        int l1 = s1.length();

        String s2 = "lol";
        int l2 = s2.length();

        System.out.println(isPalindrome1(s1, 0, l1 - 1));
        System.out.println(isPalindrome1(s2, 0, l2 - 1));

        isPalindrome2(s1, 0, l1 - 1, true);
        isPalindrome2(s2, 0, l2 - 1, true);

    }

    static boolean isPalindrome1(String str, int lci, int uci) {

        if (str.charAt(lci) != str.charAt(uci))
            return false;

        if (lci == uci || uci < lci)
            return true;

        return isPalindrome1(str, lci + 1, uci - 1);

    }

    static void isPalindrome2(String str, int lci, int uci, Boolean b) {

        if (str.charAt(lci) != str.charAt(uci)) {
            b = false;
        }

        if (lci == uci || uci < lci) {
            System.out.println(b);
            return;
        }

        isPalindrome2(str, lci + 1, uci - 1, b);
    }
}