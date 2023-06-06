public class S2 {
    // Count zero in given number
    public static void main(String[] args) {
        System.out.println(countZeros(134040));
        countZeros(134040, 0);
    }

    static int countZeros(int num) {
        if (num == 0) {
            return 0;
        }
        int count = countZeros(num / 10);
        if (num % 10 == 0) {
            return 1 + count;
        }
        return count;
    }

    static void countZeros(int num, int count) {
        if (num == 0) {
            System.out.println(count);
            return;
        }
        if (num % 10 == 0) {
            countZeros(num / 10, 1 + count);
        } else {
            countZeros(num / 10, count);
        }
    }
}
