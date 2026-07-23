import java.util.Stack;
public class Problem1 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return minStack.peek();
    }
    public static void main(String[] args) {
        Problem1 s = new Problem1();
        s.push(5);
        s.push(3);
        s.push(7);
        s.push(2);
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.getMin());
    }
}