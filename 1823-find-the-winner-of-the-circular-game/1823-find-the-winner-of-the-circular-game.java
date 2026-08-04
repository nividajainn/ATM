class Solution {
    public int findTheWinner(int n, int k) {
       
        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=n; i++){
            q.offer(i);
        }

        while(q.size() > 1){

           // Rotate k-1 times
            for(int i = 1; i < k; i++){
                q.offer(q.poll());
            }

            // Eliminate kth player
            q.poll();
        }

        return q.peek();
    }
}