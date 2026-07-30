class Solution {
    public int majorityElement(int[] nums) {
       int ans = 0;
       HashMap<Integer, Integer> map = new HashMap<>();

       for(int num: nums){
        map.put(num, map.getOrDefault(num, 0) + 1);
       }

       int limit = 0;

       for(int num : map.keySet()){
            if (map.get(num) > limit) {
                limit = map.get(num);
                ans = num;
            }
        }

        return ans;
    }
}

 /*
    Majority element appears more than n/2 times.
    
    After sorting, Arrays.sort(nums);
    majority element will always be present return nums[n/2];
    at middle index.
 */