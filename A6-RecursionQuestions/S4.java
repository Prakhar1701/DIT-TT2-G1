// https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&curated[]=1&sortBy=submissions

public class S4 {

    int missingNumber(int array[], int n) {

        int sum = (n * (n + 1)) / 2;
        int sumAry = sum(array, n - 1);

        return sum - sumAry;
    }

    int sum(int array[], int i) {

        if (i < 0)
            return 0;

        return array[i] + sum(array, i - 1);
    }

    // int missingNumber(int array[], int n) {

    // int sum = (n * (n + 1)) / 2;

    // for (int i = 0; i < n - 1; i++) {
    // sum -= array[i];
    // }

    // return sum;

    // }
}