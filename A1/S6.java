// Q6:  Check the Given Number is Armstrong or Not.

public class S6 {

    public static void main(String[] args) {

        int num = -371;

        // Method 1:
        if (isArmstrong(num, 0) == num) // Fixed
            System.out.println(num + " is a Armstrong Number.");
        else
            System.out.println(num + " is not a Armstrong Number.");

        // Method 2:
        if (isArmstrong(num, num, 0)) // Fixed
            System.out.println(num + " is a Armstrong Number.");
        else
            System.out.println(num + " is not a Armstrong Number.");

        // Method 3:
        isArmstrongPrint(num, num, 0); // Fixed
    }

    static int isArmstrong(int num, int squareSum) {

        if (num == 0)
            return squareSum;

        squareSum += Math.pow(num % 10, 3);

        return isArmstrong(num / 10, squareSum);
    }

    static Boolean isArmstrong(int num, int n, int squareSum) {

        if (n == 0) {
            return (squareSum == num) ? true : false;
        }

        squareSum += Math.pow(n % 10, 3);

        return isArmstrong(num, n / 10, squareSum);
    }

    static void isArmstrongPrint(int num, int n, int squareSum) {

        if (n == 0) {
            if (squareSum == num)
                System.out.println(num + " is a Armstrong Number.");
            else
                System.out.println(num + " is not a Armstrong Number.");
            return;
        }

        squareSum += Math.pow(n % 10, 3);

        isArmstrongPrint(num, n / 10, squareSum);
    }
}
