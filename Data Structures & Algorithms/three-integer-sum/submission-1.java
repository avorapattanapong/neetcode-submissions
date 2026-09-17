class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i - 1] == nums[i]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                if (left != i + 1 && nums[left] == nums[left - 1]) {
                    left++;
                    continue;
                }

                if (right != nums.length - 1 && nums[right] == nums[right + 1]) {
                    right--;
                    continue;
                }
                int temp = nums[left] + nums[right] + nums[i];
                if (temp == 0) {
                    List<Integer> sub = new ArrayList<>();
                    sub.add(nums[left]);
                    sub.add(nums[right]);
                    sub.add(nums[i]);
                    result.add(sub);
                    left++;
                    right--;
                } else if (temp < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
