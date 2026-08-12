class Solution {
    public int jump(int[] nums) {

        int jumps = 0;
        int end = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            // Current range se kitna door ja sakte hain?
            farthest = Math.max(farthest, i + nums[i]);

            // Current jump ki range khatam
            if (i == end) {

                jumps++;

                // Next jump ki range
                end = farthest;
            }
        }

        return jumps;
    }
}
//Current range ke andar sab possibilities dekho, aur farthest ko maximum karo. Jab i == end ho jaye, tab jump badhao aur end = farthest kar do.