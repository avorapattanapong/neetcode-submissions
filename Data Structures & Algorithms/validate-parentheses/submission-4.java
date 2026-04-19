class Solution {
    public boolean isValid(String s) {
        Deque<Character> record = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                record.addFirst(c);
            } else if (record.isEmpty()) {
                return false;
            } else {
                Character next = record.peekFirst();
                if (c == ')' && next == '(' ||
                c == ']' && next == '[' ||
                c == '}' && next == '{') {
                    record.removeFirst();
                } else {
                    return false;
                }
            }
        }

        return record.isEmpty();
    }
}
