class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int j : nums) {
            sum += j;
            if (maxSum < sum) {
                maxSum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }

        }
        return maxSum;
    }
}