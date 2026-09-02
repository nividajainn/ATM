class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
/* DRY RUN 
[1,2,9] -> [1,3,0]
     i
     9<9 -> false
     [1,2,0]
        i
     2<9 -> true
     [1,3,0] return digits

[9] -> [1,0]
 i  
 9<9 -> false
 [0]

 digits[0,0] (len+1)
 digit[0] = 1
 digits[1,0] return */
              