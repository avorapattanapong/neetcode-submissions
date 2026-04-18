class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // First create the frequency map
        Map<Integer, Integer> record = new HashMap<>();

        for( int i = 0; i < nums.length; i++) {
            record.put(nums[i], record.getOrDefault(nums[i], 0) + 1);
        }

        // Then we want to create a sructure where frequency is the index
        List<Integer>[] result = new List[nums.length + 1];

        record.forEach((key, value) -> {
            if (result[value] == null) {
                result[value] = new ArrayList<>();
            }
            result[value].add(key); 
        });

        int[] sol = new int[k];
        int kIndex = 0;
        for(int i = result.length - 1; i >= 0; i--) {
            int index = 0;
            if (result[i] == null) continue;
            while( index < result[i].size() && kIndex < k) {
                sol[kIndex] = result[i].get(index);
                index++;
                kIndex++;
            }
            if (kIndex >= k) {
                break;
            }
        }

        return sol;
    }
}
