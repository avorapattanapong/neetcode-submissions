class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (stack.size() > 0){
                Character c = stack.pop();

                if (c == '(' && s.charAt(i) != ')') {
                    return false;
                } else if (c == '[' && s.charAt(i) != ']') {
                    return false;
                } else if (c == '{' && s.charAt(i) != '}') {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.size() == 0;
    }
}
