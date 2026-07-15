class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
        while(q1.size() > 1) {
            q2.offer(q1.poll());
        }

        int result = q1.poll();

        q1 = q2;
        q2 = new ArrayDeque<>();

        return result;
    }
    
    public int top() {
        while(q1.size() > 1) {
            q2.offer(q1.poll());
        }

        int result = q1.peek();

        q2.offer(q1.poll());
        q1 = q2;
        q2 = new ArrayDeque<>();

        return result;
    }
    
    public boolean empty() {
        return q1.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */