class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();

        int left = 0;
        int right = 0;
        int size = 0;
        while (right < s.length() ) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                right++;
            } else {
                charSet.remove(s.charAt(left));
                left++;
            }

            size = Math.max(size, right - left);
        }

        return size;
    }
}
