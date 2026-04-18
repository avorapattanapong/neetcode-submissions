class Solution {
    public boolean isPalindrome(String s) {
        int lower = 0;
        int upper = s.length() - 1;

        while(lower < upper) {
            while (lower < upper && !Character.isLetterOrDigit(s.charAt(lower))) {
                lower++;
            }

            while (lower < upper && !Character.isLetterOrDigit(s.charAt(upper))) {
                upper--;
            }
            if (Character.toLowerCase(s.charAt(lower)) != 
            Character.toLowerCase(s.charAt(upper))) {
                return false;
            }
            lower++;
            upper--;
        }

        return true;
    }
}
