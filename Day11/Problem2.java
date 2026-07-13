public class Problem2 {
    Problem2(int a) {
        System.out.println("Number = " + a);
    }
    Problem2(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
    public static void main(String[] args) {
        new Problem2(10);
        new Problem2(10,20);
    }
}