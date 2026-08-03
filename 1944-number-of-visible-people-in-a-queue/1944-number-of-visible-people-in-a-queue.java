class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        int [] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        
        // Last person ke right me koi nahi hota
        st.push(arr[n-1]);
        ans[n-1] = 0;

        // Right se left traverse karenge
        for (int i = n - 2; i >= 0; i--) {

            // Current person kitne log dekh sakta hai
            int count = 0;

            // Jab tak stack me current se chhoti ya equal height wale log hain
            while (st.size() > 0 && st.peek() <= arr[i]) {
                count++;
                // Ye person future me kisi ke kaam nahi aayega
                // Kyuki current usse bada ya equal hai
                st.pop();
            }

            // Agar stack me koi taller person bacha hai
            // To current usse bhi dekh sakta hai
            if (st.size() > 0)
                count++;

            ans[i] = count;

            // Current person ko stack me daal do
            // Taaki left wale log ise compare kar sake
            st.push(arr[i]);
        }
        
        return ans;
    }
}
