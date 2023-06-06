public class S3 {
    public static void main(String[] args) {
        System.out.println(sumNatural(5));
        sumNatural(5, 0);
    }

    static int sumNatural(int num) {
        if (num == 0)
            return 0;
        return num + sumNatural(num - 1);
    }

    static void sumNatural(int num, int sum) {
        if (num == 0) {
            System.out.println(sum);
            return;
        }
        sumNatural(num - 1, num + sum);
    }
}
