class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (record.containsKey(nums[i])) {
                return true;
            } else {
                record.put(nums[i], 1);
            }
        }

        return false;
    }
}