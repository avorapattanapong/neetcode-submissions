class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> record = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            record.computeIfAbsent(encodeKey(strs[i]), k -> new ArrayList<>()).add(strs[i]);
        }

        List<List<String>> result = new ArrayList<>();

        for (List<String> list : record.values()) {
            result.add(list);
        }

        return result;
    }

    private String encodeKey(String s) {
        int[] counts = new int[26];

        for(char c : s.toCharArray()) counts[c - 'a']++;

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {
            builder.append(counts[i]);
            builder.append("#");
        }

        return builder.toString();
    }
}
