import java.util.LinkedList;
import java.util.Queue;
public class Problem3 {
    Queue<Integer> q = new LinkedList<>();
    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }
    public int pop() {
        return q.remove();
    }
    public int top() {
        return q.peek();
    }
    public boolean empty() {
        return q.isEmpty();
    }
    public static void main(String[] args) {
        Problem3 stack = new Problem3();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}