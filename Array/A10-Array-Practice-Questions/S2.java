// https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class S2 {

    int missingNumber(int array[], int n) {

        int sum = ++n * (n - 1) / 2;

        for (int x : array) {
            sum -= x;
        }

        return sum;
    }
}