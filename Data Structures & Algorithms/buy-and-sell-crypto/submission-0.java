class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int left = 0;
        int right = 1;
        int result = 0;

        while(left < prices.length - 1 && right < prices.length) {
            if (prices[left] > prices[right]) {
                left = right;
            } else {
                result = Math.max(result, prices[right] - prices[left]);
            }
            right++;
        }

        return result;

    }
}
