public class Problem6 {

    int[] queue = new int[5];
    int front = -1;
    int rear = -1;

    public void enqueue(int value) {

        if ((rear + 1) % queue.length == front) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
    }

    public void dequeue() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Deleted: " + queue[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
    }

    public void display() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % queue.length;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Problem6 q = new Problem6();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();
    }
}