// https://leetcode.com/problems/rotate-array/description/

public class S1 {

    // Method-3:
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int s, int e) {

        while (s < e) {
            int t = nums[e];
            nums[e] = nums[s];
            nums[s] = t;
            s++;
            e--;
        }

    }

    // Method-2:
    // Time Complexity : O(n)
    // Space Complexity : O(n)
    // public void rotate(int[] nums, int k) {

    // int n = nums.length;
    // int[] ary = new int[n];

    // while (k >= n) {
    // k -= n;
    // }

    // for (int i = 0; i < nums.length; i++) {

    // if (i + k >= n) {
    // ary[i + k - n] = nums[i];
    // } else {
    // ary[i + k] = nums[i];
    // }
    // }

    // for (int i = 0; i < n; i++) {
    // nums[i] = ary[i];
    // }

    // }

    // Method-1: (Time Limit Exceeded)
    // Time Complexity : O(n^2)
    // Space Complexity : O(1)
    // public void rotate(int[] nums, int k) {

    // for (int j = 0; j < k; j++) {

    // for (int i = nums.length - 1; i > 0; i--) {

    // int t = nums[i];

    // nums[i] = nums[i - 1];
    // nums[i - 1] = t;
    // }

    // }

    // }

}