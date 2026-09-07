class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // s1 ki frequency
        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }

        int l = 0;

        for (int r = 0; r < s2.length(); r++) {

            // Current character add
            freq2[s2.charAt(r) - 'a']++;

            // Window size maintain karo
            if (r - l + 1 > s1.length()) {
                freq2[s2.charAt(l) - 'a']--;
                l++;
            }

            // Same frequency = permutation
            // Ye check kar raha hai ki s1 aur current window mein har character ki frequency exactly same hai ya nahi.
            if (Arrays.equals(freq1, freq2)) {
                return true;
            }

            /**boolean same = true;
                for(int i = 0; i < 26; i++){
                    if(freq1[i] != freq2[i]){
                        same = false;
                        break;
                    }   
                }
            */
        }

        return false;
    }
}