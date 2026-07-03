class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        // Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Store sign (default positive)
        int sign = 1;

        // Check for '+' or '-'
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {

            if (s.charAt(i) == '-') {
                sign = -1;
            }

            i++;
        }

        long num = 0;

        // Read digits
        while (i < n && Character.isDigit(s.charAt(i))) {

            // Convert character to digit
            int digit = s.charAt(i) - '0';

            // Build number
            num = num * 10 + digit;

            // Check overflow
            if (sign * num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if (sign * num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        // Return final answer
        return (int)(sign * num);
    }
}
/*
Decimal to Digit Mapping (ASCII Standard)
48 → '0'
49 → '1'
50 → '2'
51 → '3'
52 → '4'
53 → '5'
54 → '6'
55 → '7'
56 → '8'
57 → '9'

*/