class Solution {
    static class Pair{
        int diff;
        int val;

        Pair(int diff, int val){
            this.diff = diff;
            this.val = val;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.diff == b.diff)
                return b.val - a.val;
            return b.diff - a.diff;
        });

        for(int ele : arr){
            pq.add(new Pair(Math.abs(ele - x), ele));

            if(pq.size() > k) pq.remove();
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while(!pq.isEmpty()){
            ans.add(pq.remove().val);
        }
        
        Collections.sort(ans);
        return ans;
    }
}