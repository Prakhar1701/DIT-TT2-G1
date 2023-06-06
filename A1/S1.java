class S1 {
    public static void main(String[] args) {
        System.out.println(power(2, 5));
        power(2, 5, 1);

    }

    static int power(int n, int p) {
        if (p == 0)return 1;
        return n * power(n, p - 1);
    }

    static void power(int n, int p, int val) {
        if (p == 0) {
            System.out.println(val);
            return;
        }
        power(n, p - 1, n * val);
    }
}