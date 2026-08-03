class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;

        //PSE[i] batata hai ki left me kaha tak extend kar sakte ho.
        //NSE[i] batata hai ki right me kaha tak extend kar sakte ho.
        int[] nse = nse(heights);
        int[] pse = pse(heights);
        
        //Dono boundaries ke beech ki width nikal lo.
        for(int i=0; i<heights.length; i++){

            // Rectangle starts from (PSE + 1) and ends at (NSE - 1)
            // Width = (NSE - 1) - (PSE + 1) + 1 = NSE - PSE - 1
            int width = nse[i]-pse[i]-1;
            
            //height × width se us bar ka maximum rectangle area mil jayega.
            int area = heights[i]*width; 
            
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    static int[] pse(int[] height){
        int [] pse = new int[height.length];
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<height.length; i++){

            while(!st.isEmpty() && height[st.peek()] >= height[i]){
                st.pop();
            }

            if(st.isEmpty()){
                pse[i] = -1;
            }

            else{ 
                pse[i] = st.peek();
            }

            st.push(i);
        }
        return pse;
    }

        static int[] nse(int[] height) {
        int[] nse = new int[height.length];
        Stack<Integer> st = new Stack<>();

        for (int i = height.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && height[st.peek()] >= height[i]) {
                st.pop();
            }

            if (st.isEmpty())
                nse[i] = height.length;

            else{
                nse[i] = st.peek();
            } 
            
            st.push(i);
        }

        return nse;
    }
}