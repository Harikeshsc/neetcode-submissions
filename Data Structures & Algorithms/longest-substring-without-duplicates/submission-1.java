class Solution {
    public int lengthOfLongestSubstring(String s) {
          int n = s.length();
        int maxLength = 0;
        // Map to store the last seen index of each character
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0, left = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            
            // If character was seen before, move left pointer to the right 
            // of its last occurrence (only if it's within current window)
            if (map.containsKey(currentChar)) {
                left = Math.max(map.get(currentChar) + 1, left);
            }
            
            // Update last seen position of the character
            map.put(currentChar, right);
            // Calculate window size and update maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
