class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
         
          for(int n: nums) set.add(n);
           
           int maxSeq = 0;

    for(int number: set){
          if(!set.contains(number-1)){
                int currNum = number;
                int length = 1;

         while(set.contains(currNum+1)){
              currNum++;
               length++;
         }
            maxSeq = Math.max(maxSeq,length);
          }
    }

            return maxSeq;
    }
}