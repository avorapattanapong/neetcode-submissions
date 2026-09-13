class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> com = new HashMap<>();
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (com.containsKey(complement)) {
                answer[0] = com.get(complement);
                answer[1] = i;
                break;
            } else {
                com.put(nums[i], i);
            }

        }

        return answer;
    }
}
