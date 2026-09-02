class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int num1 : nums1) {
            set.add(num1);
        }

        for (int num2 : nums2) {
            if (set.contains(num2)) {
                set.remove(num2);
                list.add(num2);
            }
        }

        int[] arr = new int[list.size()];
        int i = 0;

        for (int num : list) {
            arr[i++] = num;
        }

        return arr;
    }
}