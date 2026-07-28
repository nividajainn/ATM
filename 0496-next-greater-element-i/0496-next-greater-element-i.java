class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> map = new HashMap<>();
       Deque<Integer> dq = new ArrayDeque<>();

        for(int num : nums2) {

            while(!dq.isEmpty() && dq.peek() < num){
                map.put(dq.pop(), num);
            }
            dq.push(num);
        }

        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }

        return ans;
    }
}