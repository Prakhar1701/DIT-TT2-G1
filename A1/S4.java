public class S4 {
    // 1/1^1 + 2 / 2 ^2 + 3 / 3^3 
    public static void main(String[] args) {
        System.out.println(sumSeries(2));
        sumNatural(2, 0);
    }

    static double sumSeries(int num) {
        if (num == 0)
            return 0;
        return eleVal(num) + sumSeries(num - 1);
    }

    static void sumNatural(int num, double sum) {
        if (num == 0) {
            System.out.println(sum);
            return;
        }
        sumNatural(num - 1, eleVal(num) + sum);
    }

    static double eleVal(int n){
        return  (n/Math.pow(n, n));
    }
}
