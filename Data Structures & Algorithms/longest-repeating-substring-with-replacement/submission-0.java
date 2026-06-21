class Solution {
    public int characterReplacement(String s, int k) {
         int[] count = new int[26]; // To store frequency of uppercase letters
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Increment the count of the current character
            char current = s.charAt(right);
            count[current - 'A']++;
            
            // Update the maximum frequency found in the current window
            maxFreq = Math.max(maxFreq, count[current - 'A']);

            // If replacements needed (window size - maxFreq) > k, shrink window
            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
                // Note: maxFreq doesn't strictly need to be recalculated 
                // because the result only increases when maxFreq increases.
            }

            // Update the global maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
