class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
    
        for (int i = 0; i < operations.length; i++) {
            String operation = operations[i];

            switch (operation) {
                case "D":
                    Integer prevRecord = stack.peek();
                    stack.push(prevRecord * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                case "+":
                    Integer temp = stack.pop();
                    Integer sum = temp + stack.peek();

                    stack.push(temp);
                    stack.push(sum);
                    break;
                default:
                    Integer num = Integer.parseInt(operation);
                    stack.push(num);
            }
        }

        Integer ans = 0;
        while(!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }
}