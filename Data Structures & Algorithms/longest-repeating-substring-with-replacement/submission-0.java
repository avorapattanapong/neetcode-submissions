class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int maxFrequency = 0;
        Map<Character, Integer> charCount = new HashMap<>();

        while (right < s.length()) {
            char c = s.charAt(right);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            maxFrequency = Math.max(maxFrequency, charCount.get(c));
            right++;
            if (right - left - maxFrequency > k) {
                c = s.charAt(left);
                charCount.put(c, charCount.get(c) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left);
            
        }

        return maxLength;
    }
}
