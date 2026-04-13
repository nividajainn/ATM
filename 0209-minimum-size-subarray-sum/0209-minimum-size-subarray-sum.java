class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        // yaha hum minimum length store karenge
        // starting me bahut bada value lete hain taaki baad me compare kar sake
        int minLen = Integer.MAX_VALUE;

        // left pointer (window ka start)
        int l = 0;

        // current window ka sum
        int sum = 0;

        // right pointer se array traverse karenge
        for (int r = 0; r < nums.length; r++) {

            // step 1: window expand karo → current element add karo
            sum += nums[r];

            // step 2: jab tak sum target se bada ya equal hai
            // tab tak window ko chhota karo (shrink)
            while (sum >= target) {

                // current window valid hai, to uski length calculate karo
                int currentLength = r - l + 1;

                // minimum length update karo
                minLen = Math.min(minLen, currentLength);

                // ab window ko shrink karne ke liye left element hatao
                sum -= nums[l];

                // left pointer aage badhao
                l++;
            }
        }

        // agar minLen update hi nahi hua to matlab koi valid subarray nahi mila
        if (minLen == Integer.MAX_VALUE) {
            return 0;
        }

        // warna minimum length return karo
        return minLen;
    }
}