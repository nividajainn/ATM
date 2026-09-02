class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            // Leave the smaller element and go to next(greater) element in nums1
            if(nums1[i] < nums2[j]) {
                i++;
            }
            // Go to next(greater) element in nums2 array
            else if(nums1[i] > nums2[j]){
                j++;
            }
            // If both the elements intersected
            // Add this element to arr & increment both i and j.
            else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        // Create a output list to store the output...
        int[] ans = new int[arr.size()];
        int k = 0;
        while(k < arr.size()){
            ans[k] = arr.get(k);
            k++;
        }
        return ans;
    }
}