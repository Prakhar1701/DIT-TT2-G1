// https://leetcode.com/problems/rotate-array/description/

public class S1 {

    public void rotate(int[] nums, int k) {

        for (int j = 0; j < k; j++) {

            for (int i = nums.length - 1; i > 0; i--) {

                int t = nums[i];

                nums[i] = nums[i - 1];
                nums[i - 1] = t;
            }

        }

    }

}