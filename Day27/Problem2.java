import java.util.Stack;
public class Problem2 {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void push(int x) {
        s1.push(x);
    }
    public int pop() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int val = s2.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return val;
    }
    public int peek() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int val = s2.peek();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return val;
    }
    public boolean empty() {
        return s1.isEmpty();
    }
    public static void main(String[] args) {
        Problem2 q = new Problem2();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.empty());
    }
}