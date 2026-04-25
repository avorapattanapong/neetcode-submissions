class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for( int i = 0; i < stones.length; i++ ) {
            queue.add(stones[i]);
        }

        while( queue.size() > 1) {
            int stoneA = queue.poll();
            int stoneB = queue.poll();

            if (stoneA == stoneB) {
                continue;
            }

            queue.add(stoneA - stoneB);
        }

        return queue.size() == 0 ? 0 : queue.poll();
    }
}
