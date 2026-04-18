class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> record = new HashMap<>();
        int[] result = {0,0};

        for(int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (!record.containsKey(comp)) {
                record.put(nums[i], i);
            } else {
                result[0] = record.get(comp);
                result[1] = i;
            }
        }

        return result;
    }
}
