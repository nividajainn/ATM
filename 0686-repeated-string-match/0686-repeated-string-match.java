class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        while(sb.length() < b.length()){
            sb.append(a);
            count++;
        }

        if(sb.indexOf(b) != -1) //agar b, sb me exist karta hoga to count return
        return count;
        

        sb.append(a); //agar nahi karta to phir se a add karo

        if(sb.indexOf(b) != -1) //append hone ke baad check karo exist karta h ya nhi
        return count+1;

        return -1;
    }
}