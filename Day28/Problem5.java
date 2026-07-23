public class Problem5 {
    int[] queue = new int[5];
    int front = 0;
    int rear = -1;
    public void enqueue(int value) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        queue[rear] = value;
    }
    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Deleted: " + queue[front]);
        front++;
    }
    public void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Problem5 q = new Problem5();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}