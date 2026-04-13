class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum = 0;

        // Step 1: Calculate sum of first window (size k)
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Initialize maxSum with first window sum
        int maxSum = sum;

        // Step 2: Slide the window
        for (int i = k; i < nums.length; i++) {

            // Remove element going out of window
            sum -= nums[i - k];

            // Add new element coming into window
            sum += nums[i];

            // Update maximum sum if needed
            maxSum = Math.max(maxSum, sum);
        }

        // Step 3: Return maximum average
        return (double) maxSum / k;
    }
}