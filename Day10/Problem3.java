import java.util.Scanner;
public class Problem3 {
    Problem3(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        new Problem3(a, b);
    }
}