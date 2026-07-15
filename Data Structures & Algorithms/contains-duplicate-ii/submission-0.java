class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> store = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if (!store.containsKey(nums[i])) {
                store.put(nums[i], i);
            } else {
                int storedIndex = store.get(nums[i]);
                if (Math.abs(storedIndex - i) <= k) {
                    return true;
                } else {
                    store.put(nums[i], i);
                }
            }
        }

        return false;
    }
}