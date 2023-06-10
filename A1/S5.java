// Q5: Check the Given Number is Prime or Not.

public class S5 {

    public static void main(String[] args) {

        int n = 121;

        Boolean b = isPrime1(n, 2); // Fixed

        System.out.println(n + " is Prime: " + b);

        n = 169;

        isPrime2(n, 2); // Fixed
    }

    static boolean isPrime1(int num, int i) {

        if (i > Math.sqrt(num)) {
            return true;
        }

        if (num % i == 0) {
            return false;
        }

        return isPrime1(num, i + 1);
    }

    static void isPrime2(int num, int i) {

        if (i > Math.sqrt(num)) {
            System.out.println(num + " is Prime: " + true);
            return;
        }

        if (num % i == 0) {
            System.out.println(num + " is Prime: " + false);
            return;
        }

        isPrime2(num, i + 1);
    }

}
