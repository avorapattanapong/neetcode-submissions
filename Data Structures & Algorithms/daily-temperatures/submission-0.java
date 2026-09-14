class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> tempIndex = new ArrayDeque<>();
        
        for (int i = 0; i < temperatures.length; i++) {
            while (!tempIndex.isEmpty() && temperatures[i] > temperatures[tempIndex.peek()]) {
                int prevDay = tempIndex.pop();
                result[prevDay] = i - prevDay;
            }
            
            tempIndex.push(i);

        }

        return result;
    }
}
