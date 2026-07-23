import java.util.LinkedList;
import java.util.Queue;
public class Problem1 {
    Queue<Integer> queue = new LinkedList<>();
    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
    public static void main(String[] args) {
        Problem1 obj = new Problem1();
        System.out.println(obj.ping(1));
        System.out.println(obj.ping(100));
        System.out.println(obj.ping(3001));
        System.out.println(obj.ping(3002));
    }
}