class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        int prefixP = 1;
        int suffixP = 1;

        for(int i=0; i<n; i++){
            //reset kr denge agar 0 ho gye to warna aage ke bhi 0 hi rahenge
            if(prefixP == 0) prefixP = 1;
            if(suffixP == 0) suffixP = 1;

            prefixP *= nums[i]; //aage se product 
            suffixP *= nums[n-1-i]; //peeche se product karenge

            max = Math.max(max, Math.max(suffixP, prefixP));
        }

        return max;
    }
}