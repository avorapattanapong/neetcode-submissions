class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> record = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (record.contains(nums[i])) {
                return true;
            } else {
                record.add(nums[i]);
            }
        }

        return false;
    }
}