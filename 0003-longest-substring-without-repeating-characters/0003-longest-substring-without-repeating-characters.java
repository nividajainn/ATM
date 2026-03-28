class Solution {
   public int lengthOfLongestSubstring(String s) {

    // set to store unique characters in current window
    HashSet<Character> set = new HashSet<>();

    int left = 0;        // left pointer of window
    int maxLength = 0;   // answer

    // right pointer expands the window
    for (int right = 0; right < s.length(); right++) {

        // if duplicate character found
        while (set.contains(s.charAt(right))) {
            // remove left character to shrink window
            set.remove(s.charAt(left));
            left++; // move left forward
        }

        // add current character (now guaranteed unique)
        set.add(s.charAt(right));

        // update maximum length
        maxLength = Math.max(maxLength, right - left + 1);
    }

    // return final answer
    return maxLength;
}
}