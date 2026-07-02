import java.util.Scanner;
public class Problem13 {
    int add(int a, int b) {
        return a + b;
    }
    int sub(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem13 obj = new Problem13();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition = " + obj.add(a, b));
        System.out.println("Subtraction = " + obj.sub(a, b));
    }
}