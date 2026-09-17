class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] result = new int[2];

        while (left < right) {
            int temp = numbers[left] + numbers[right];
            if (temp < target) {
                left++;
            } else if (temp > target) {
                right--;
            } else {
                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            }
        }

        return result;
    }
}
