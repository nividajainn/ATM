class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
         for(int [] wealth : accounts){
            int rowsum = 0;
            for(int bank : wealth){
                rowsum += bank;
                max = Math.max(max, rowsum);
            }
         }
         return max;
    }
}